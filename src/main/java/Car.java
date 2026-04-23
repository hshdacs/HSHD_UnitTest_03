public class Car {
    private int yearOfConstruction;
    private int power;

    public Car(int yearOfConstruction, int power) {
        this.yearOfConstruction = yearOfConstruction;
        this.power = power;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double sellingValue() {
        double value = power * 42;
        double depreciation = value * 0.1 * (2026 - yearOfConstruction);
        return value - depreciation;
    }
}
