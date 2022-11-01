public class SUVCar extends Car {

    int seatingCapacity;

    public SUVCar(String name) {
        super(name);
    }

    public void start() {
        System.out.println("SUV started");
    }

    public void stop() {
        System.out.println("SUV stop");
    }

    public void changemode() {
        System.out.println("mode change to automatic");
    }
}
