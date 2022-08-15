import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Inp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println(sc.locale());
        double sum = 0;
        try {
            while (sc.hasNext()) {
                sum += sc.nextDouble();
            }
        } catch (InputMismatchException e) {
            sc.next();
        }
        sc.close();
        System.out.printf("%.6f",sum);
    }
}