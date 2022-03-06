import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
class SecondUseCaseTest extends AnyFlatSpec with should.Matchers {
  "my add2 sum function" should "add 3 " in {

    SecondUseCase.add2num(4) should be (7)
  }
  "my add2 sum function" should "return 44 " in {

   SecondUseCase.add2num(14) should be (44)
  }
  "my add2 sum function" should "return 1000 " in {

    SecondUseCase.add2num(55) should be (1000)
  }
}
