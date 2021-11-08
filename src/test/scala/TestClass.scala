import example.oop.{CaseWacky, Wacky}
import org.scalatest.wordspec.AnyWordSpec

class SetSpec extends AnyWordSpec {
  val wack = new Wacky("att")
  "Wacky instance" when {
    "no private set " should {
      "have private as random value" in {
        val t = new Wacky("att")
        val caseT = CaseWacky("tt")
        caseT.attributeInConstructor
        assert(wack.getPrivate() =="random value")
      }

    }
  }
}