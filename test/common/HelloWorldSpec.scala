package common

import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

import play.api.test._
import play.api.test.Helpers._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
@RunWith(classOf[JUnitRunner])
class HelloWorldSpec extends Specification {

  "multiply Value" should {

    "retutn the correct value" in new WithApplication{
      var multiplyService = new HelloWorld()
      multiplyService.multiplyValue(3,3) must equalTo(9)
    }

  }
}
