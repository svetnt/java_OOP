import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {


        File file = new File("1234.txt");

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер страницы или \"Выход\" ");
            byte[] arr = new byte[3000];
            String number = scanner.nextLine();

            while (!number.equals("Выход")) {
                int page = Integer.parseInt(number);
                randomAccessFile.seek(arr.length * (page - 1));

                int count = randomAccessFile.read(arr);
                System.out.println(new String(arr,0,count));
                System.out.println("Введите номер страницы или \"Выход\" ");
                number=scanner.nextLine();
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

}
