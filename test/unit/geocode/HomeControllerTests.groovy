package geocode

import grails.test.mixin.*
import org.junit.*

import geb.Browser

@TestFor(HomeController)
class HomeControllerTests {

    void testIndex() {
        controller.index()
        assert response.text == ""
    }
}
