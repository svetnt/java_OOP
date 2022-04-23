public class Rectangul extends Figura{

    private double storona1;
    private double storona2;

    Rectangul(String name, double storona1, double storona2){
        super.setName(name);
        this.storona1=storona1;
        this.storona2=storona2;
    }

    @Override
    public double getLength() {
        return 2*storona1+2*storona2;
    }

    @Override
    public double getArea() {
        return storona1*storona2;
    }

    @Override
    public void info() {
        System.out.print("Фигура "+getName()+", его стороны "+storona1+" и "+storona2+" мм.");
    }
}
