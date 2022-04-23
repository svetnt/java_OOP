import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogic {
    Circle testCircle = new Circle("krug", 5);
    Rectangul testRectangul=new Rectangul("rect", 4, 10);

   @Test
    public void testCircleArrea() {
        double rezult = testCircle.getArea();
        double expextedRezult=Figura.PI*5*5;
        Assert.assertEquals(rezult, expextedRezult);
    }

    @Test
    public void testCircleLength(){
        double rezult = testCircle.getLength();
        double expectedRezult=2*Figura.PI*5;
        Assert.assertEquals(rezult,expectedRezult);
    }

    @Test
    public void testRectangulArrea(){
       double rezult=testRectangul.getArea();
       double expectedRezult=4*10;
       Assert.assertEquals(rezult,expectedRezult);
    }

    @Test
    public void testRectangulLength(){
        double rezult = testRectangul.getLength();
        double expectedRezult=(4+10)*2;
        Assert.assertEquals(rezult,expectedRezult);
    }
}
