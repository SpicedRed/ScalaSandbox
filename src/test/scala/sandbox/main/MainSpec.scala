package sandbox.main

import org.scalatest.{FlatSpec, Matchers}

class MainSpec extends FlatSpec with Matchers {
    behavior of "Main"

    it should "exist" in {
        1 === 1
    }
}
