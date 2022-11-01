public abstract class Car {
    private String name;
    protected Engine Engine;

    public Car(String name, Engine e) {
        this.name = name;
        this.Engine = e;
    }

    public String getName() {
        return name;
    }

    public abstract void start();

    public abstract void stop();

}
