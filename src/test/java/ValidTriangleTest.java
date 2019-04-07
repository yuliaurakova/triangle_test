import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class ValidTriangleTest {
    @Parameterized.Parameter()
    public int side1;
    @Parameterized.Parameter(1)
    public int side2;
    @Parameterized.Parameter(2)
    public int side3;
    @Parameterized.Parameter(3)
    public boolean expected;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(
                new Object[]{2, 3, 5, false},
                new Object[]{0, 0, 0, false},
                new Object[]{6, 5, 9, true},
                new Object[]{100, 100, 100, true},
                new Object[]{-3, -0, -9, false},
                new Object[]{7, 8, 12, true}
        );


    }


    @Test

    public void TestValidTrianle() {
        Triangle Triangle = new Triangle();
        boolean actual = Triangle.TheRealTriangle(side1, side2, side3);
        assertEquals(expected, actual);
    }
}
