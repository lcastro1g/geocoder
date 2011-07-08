package geocode

import grails.test.mixin.*
import org.junit.*

@TestFor(GeocodeService)
class GeocodeServiceTests {

    void testQueryForXML() {
        def result = service.queryForXML("Statue of Liberty")
        assert "40.6891947" == result.lat.toString()
        assert "-74.0444169" == result.lng.toString()
        assert "The Statue Of Liberty, Liberty Island, New York, NY 11231, USA" == result.address
    }
    
    void testQueryForJSON() {
        def result = service.queryForJSON("Times Square")
        assert "40.75659" == result.lat.toString()
        assert "-73.98626" == result.lng.toString()
        assert "Theater District - Times Square, New York, NY, USA" == result.address
    }
}
