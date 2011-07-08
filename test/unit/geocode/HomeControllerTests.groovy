package geocode

import grails.test.mixin.*
import org.junit.*

@TestFor(HomeController)
class HomeControllerTests {

    void testIndex() {
        controller.index()
        assert response.text == ""
    }
}
