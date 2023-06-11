import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    @Test
    public void testRegisteredAndUnderLimit() {
        BonusMilesService service = new BonusMilesService();

        long expected = 30;
        boolean registered = true;
        long actual = service.calculate(1000, true);
        //System.out.println("1. " + expected + "==?==" + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRegisteredAndOverLimit() {
        BonusMilesService service = new BonusMilesService();

        long expected = 500;
        boolean registered = true;
        long actual = service.calculate(1_000_000, true);
        //System.out.println("2. " + expected + "==?==" + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnregisteredAndUnderLimit() {
        BonusMilesService service = new BonusMilesService();

        long expected = 10;
        long actual = service.calculate(1_000, false);
        //System.out.println("3. " + expected + "==?==" + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnregisteredAndOverLimit() {
        BonusMilesService service = new BonusMilesService();

        long expected = 500;
        long actual = service.calculate(1_000_000, false);
        //System.out.println("4. " + expected + "==?==" + actual);

        Assertions.assertEquals(expected, actual);
    }
}
