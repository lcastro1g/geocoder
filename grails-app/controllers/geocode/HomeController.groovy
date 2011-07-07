package geocode

import groovy.json.JsonSlurper 

class HomeController {
    def geocodeService
 
    def index = {
        String queryForXML = "Times+Squre"
        String queryForJSON = "Eiffel+Tower"

        [xmlMap: geocodeService.queryForXML(queryForXML), jsonMap: geocodeService.queryForJSON(queryForJSON)]
    }
}
