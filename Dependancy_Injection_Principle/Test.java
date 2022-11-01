public class Test {
    public static void main(String[] args) {
        SUVCar c2 = new SUVCar("BMW", new V6Engine());

        Driver esa = new Driver();
        c2.start();
        esa.Drive(c2);
        c2.stop();
        esa.FillTank(c2);

        Mechanic m1 = new Mechanic();
        m1.changetires(c2);
        c2.changemode();
        c2.fourWheelDrive();
    }

}
