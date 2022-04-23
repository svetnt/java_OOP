public class Circle extends Figura{

    private double radius;

    Circle(String name, double radius){
        super.setName(name);
        this.radius=radius;
    }

    @Override
    public double getLength() {
        return 2*PI*radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public void info(){
        System.out.print("Фигура "+getName()+", его радиус "+radius+" мм.");
    }
}
