object SecondUseCase extends App{
  def add2num(a :Int):Int={
    {
      if(a<10)
        {

          a+3
        }
      else if(a>10 && a<20)
        {
          a+30

        }
      else 1000
    }

    }
}
