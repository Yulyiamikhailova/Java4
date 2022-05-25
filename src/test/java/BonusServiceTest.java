import static org.junit.jupiter.api.Assertions.*;

public class BonusServiceTest {
    @org.junit.jupiter.api.Test
    public void shouldCalculateSmallAmountForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        long expected = 30;

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateHugeAmountForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        long expected = 500;

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateSmallAmountForNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean Registered = false;

        // вызываем целевой метод:
        long actual = service.calculate(amount, Registered);
        long expected = 10;

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldCalculateHugeAmountForNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = false;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);
        long expected = 500;

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}