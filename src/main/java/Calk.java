import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Calk {
    public static void main(String[] args) throws IOException {
        File file=new File("Data.txt");
        File fileResult=new File("Result.txt");
        file.createNewFile();
        fileResult.createNewFile();
        FileWriter writer=new FileWriter(file);
        FileWriter writerResult=new FileWriter(fileResult);
        writer.write("10 + 25");
        writer.flush();

        FileReader fr=new FileReader(file);
        Scanner sc=new Scanner(fr);

     //   Scanner sc = new Scanner(System.in);
        String s1 = sc.next(), oper = sc.next(), s2 = sc.next();
        fr.close();
        Double num1 = 0.0, num2 = 0.0;
        try {
            num1 = Double.parseDouble(s1);
            num2 = Double.parseDouble(s2);
            if (!oper.equals("+") && !oper.equals("-") && !oper.equals("*") && !oper.equals("/")) {
                throw new IllegalArgumentException("Operation Error!");
            }
            if (num2 == 0 && oper.equals("/")) {
                throw new ArithmeticException("Error! Division by zero");
            }
            if (oper.equals("+")) {
                System.out.println(num1 + num2);
                String sum=Double.toString(num1+num2);
                writerResult.write(sum);
                writerResult.flush();
            }
            if (oper.equals("-")) {
                System.out.println(num1 - num2);
            }
            if (oper.equals("*")) {
                System.out.println(num1 * num2);
            }
            if (oper.equals("/")) {
                System.out.println(num1 / num2);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error! Not number");
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (ArithmeticException exc) {
            System.out.println(exc.getMessage());
        }

    }
}