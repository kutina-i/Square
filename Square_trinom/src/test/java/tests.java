import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;

public class tests {

    @Test
    public void squareTrinomTest() {
        squareTrinom square = new squareTrinom();
        Square q = new Square(1, 5 ,6);
        assertEquals(square.maxRoot(q), -2, 0);
    }
    @Test
    public void squareOneRootTest() {
        Square q = new Square(1, -2 ,1);
        double[] arr = new double[1];
        arr[0] = 1;
        Assert.assertArrayEquals(q.Roots(), arr, 5);
    }

    @Test
    public void squareTwoRootsTest() {
        Square q = new Square(1, 5 ,6);
        double[] arr = new double[2];
        arr[0] = -2;
        arr[1] = -3;
        Assert.assertArrayEquals(q.Roots(), arr, 6);
    }

    @Test
    public void squareA0Test() {
        try{
            Square q = new Square(0, 5 ,6);
        }catch (IllegalArgumentException err)
        {
            System.err.println("Не квадратный трехчлен");
        }
    }

    @Test
    public void squareDLess0Test() {
        Square q = new Square(1, 5 ,6);
        try{
            q.Roots();
        }catch (IllegalArgumentException err)
        {
            System.err.println("Действительных корней нет");
        }
    }
}