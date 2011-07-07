package geocode

import groovy.json.JsonSlurper 

class HomeController {
    def geocodeService
 
    def index = {}

    def show = {
        String queryForXML = params.queryForXML
        String queryForJSON = params.queryForJSON

        [xmlMap: geocodeService.queryForXML(queryForXML), jsonMap: geocodeService.queryForJSON(queryForJSON)]
    }
}
