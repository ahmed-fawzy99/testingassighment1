import org.junit.Test;
import static org.junit.Assert.*;

public class lab1Q2AssMainTest {
    @Test
    public void static_eqChecker() {
        lab1Q2AssMain equilibriumChecker = new lab1Q2AssMain();
        assertFalse(equilibriumChecker.static_eqChecker(3, new float[]{4, 1, 7},new float[]{-2, 4, -1},new float[]{1, -5, -3})); // No Equilibrium
        assertTrue(equilibriumChecker.static_eqChecker(3, new float[]{3, -1, 7},new float[]{-5, 2, -4},new float[]{2, -1, -3})); // There is Equilibrium
        assertFalse(equilibriumChecker.static_eqChecker(3, new float[]{600, 1, 7},new float[]{-200, 4, -1},new float[]{-400, -5, -3})); // There is Equilibrium but out of boundaries so should be false

    }
}
