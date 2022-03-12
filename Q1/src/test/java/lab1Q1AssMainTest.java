import org.junit.Test;
import static org.junit.Assert.*;

public class lab1Q1AssMainTest {

    @Test
    public void watermelonDivider() {
        lab1Q1AssMain watermelonDividerObj = new lab1Q1AssMain();

        // I will make 200 tests
        boolean[] booleans = new boolean[200];

        int index = 0;
        for (int w = -50; w < 150; w++) { // We will generate 200 test for this code. w stands for the weight
            if (w <= 0 || w > 100){
                assertFalse(watermelonDividerObj.WatermelonDivider(w));
                booleans[index] = false;
                System.out.println("if weight = " + w + " ===> Result = NO");
                index++;
                continue;
            }
            if (w % 2 == 0 && w != 2){ // 2 is a special case because it's even, but cannot be divided to 2 even numbers
                assertTrue(watermelonDividerObj.WatermelonDivider(w));
                booleans[index] = false;
                System.out.println("if weight = " + w + " ===> Result = YES");
            }
            else {
                assertFalse(watermelonDividerObj.WatermelonDivider(w));
                booleans[index] = false;
                System.out.println("if weight = " + w + " ===> Result = NO");
            }
            index++;
        }
    }


}
