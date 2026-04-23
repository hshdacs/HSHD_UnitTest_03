import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCar {

    private Car car;

    @BeforeEach
    public void setup() {
        car = new Car(2011, 45);
    }

//    @AfterEach
//    public void teardown() {
//        System.out.println("Cleaning up ...");
//    }

    @Test
    public void TestConstructionYear() {
        assertEquals(2011, car.getYearOfConstruction());
    }

    @Test
    public void TestPower() {
        assertEquals(45, car.getPower());
    }

    @Test
    public void TestSellingValue() {
        assertEquals(calculateSellingValue(2011, 45), car.sellingValue());
    }

    @Test
    public void TestSetPower() {
        int power = (int)(Math.random() * 100);
        car.setPower(power);
        assertEquals(power, car.getPower());
    }

    @Test
    public void TestSetConstructionYear() {
        int year = createRandomValueBetweenGivenRange(1970, 2025);
        car.setYearOfConstruction(year);
        assertEquals(year, car.getYearOfConstruction());
    }

    private static int createRandomValueBetweenGivenRange(int min, int max) {
        return (int)(Math.random() * (max - min)) + min;
    }

    private double calculateSellingValue(int year, int power) {
        return  power * 42 -  power * 42 * 0.1 * (2026 - year);
    }
}
