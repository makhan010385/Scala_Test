import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
 class FirstUseCaseTest extends AnyFlatSpec with should.Matchers {
"my add2 sum function" should "add 3 " in {

 FirstUseCase.add2num(4) should be (7)
}

 }
