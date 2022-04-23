public abstract class Figura {

    private String name;

    public static final double PI = 3.14;

    public abstract double getLength();

    public abstract double getArea();

    public abstract void info();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
};
