package geocode

import groovy.json.JsonSlurper
import org.codehaus.groovy.grails.commons.*

/**
 * Service to parse the google geocode web service
 * http://code.google.com/apis/maps/documentation/geocoding/
 *
 * @author Bobby Warner
 */ 
class GeocodeService {
    static transactional = false
    static scope = "singleton"

    def queryForXML(String query) {
        def config = ConfigurationHolder.config
        String configUrlXML = config.googleapi.url.xml
        
        def urlXML = new URL(configUrlXML + query)
        def geoCodeResultXML = new XmlParser().parseText(urlXML.getText())
        def xmlMap = [:]
        xmlMap.query = query
        xmlMap.lat = geoCodeResultXML.result.geometry.location.lat.text()
        xmlMap.lng = geoCodeResultXML.result.geometry.location.lng.text()
        xmlMap.address = geoCodeResultXML.result.formatted_address.text()
        
        return xmlMap
    }
    
    def queryForJSON(String query) {
        def config = ConfigurationHolder.config
        String configUrlJSON = config.googleapi.url.json
        
        def urlJSON = new URL(configUrlJSON + query)
        def geoCodeResultJSON = new JsonSlurper().parseText(urlJSON.getText())
        def jsonMap = [:]
        jsonMap.query = query
        jsonMap.lat = geoCodeResultJSON.results.geometry.location.lat[0]
        jsonMap.lng = geoCodeResultJSON.results.geometry.location.lng[0]
        jsonMap.address = geoCodeResultJSON.results.formatted_address[0]
        
        return jsonMap
    }
}
