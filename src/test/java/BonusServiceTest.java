import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    @Test
    public void testRegisteredAndUnderLimit() {
        BonusMilesService service = new BonusMilesService();

        long expected = 30;
        long actual = service.calculate(1000, true);
        //System.out.println("1. " + expected + "==?==" + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRegisteredAndOverLimit() {
        BonusMilesService service = new BonusMilesService();

        long expected = 500;
        long actual = service.calculate(1_000_000, true);
        //System.out.println("1. " + expected + "==?==" + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnregisteredAndUnderLimit() {
        BonusMilesService service = new BonusMilesService();

        long expected = 30;
        long actual = service.calculate(1000, folse);
        //System.out.println("1. " + expected + "==?==" + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnregisteredAndOverLimit() {
        BonusMilesService service = new BonusMilesService();

        long expected = 500;
        long actual = service.calculate(1_000_000, folse);
        //System.out.println("1. " + expected + "==?==" + actual);

        Assertions.assertEquals(expected, actual);
    }
}
