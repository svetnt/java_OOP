public class Main {

    public static void main(String[] args) {

        Circle circle1=new Circle("круг",5);
        Rectangul rectangul1=new Rectangul("прямоугольник",3,7 );

        circle1.info();
        System.out.printf("Его площадь %.2f мм2, длина окружности %.2f мм.%n", circle1.getArea(),circle1.getLength());
        rectangul1.info();
        System.out.printf("Его площадь %.2f мм2, периметр %.2f мм.%n", rectangul1.getArea(),rectangul1.getLength());


    }
}
