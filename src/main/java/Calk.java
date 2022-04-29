import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calk {
    public static void main(String[] args) throws IOException {

        File fileResult = new File("Result.txt");
        fileResult.createNewFile();
        FileWriter writerResult = new FileWriter(fileResult);

        FileReader fr = new FileReader("Data.txt");
        Scanner sc = new Scanner(fr);

        ArrayList<String> input = new ArrayList<String>();
        while (sc.hasNext()) {
            input.add(sc.next());
        }

        fr.close();

        String[][] inputData = new String[input.size() / 3][3];
        int j = 0;
        for (int i = 0; i < input.size(); i += 3) {
            inputData[j] = new String[]{input.get(i), input.get(i + 1), input.get(i + 2)};
            j++;
        }

        String[] rezultArr = new String[inputData.length];

        for (int i = 0; i < inputData.length; i++) {
            Double num1 = 0.0, num2 = 0.0;
            String oper = inputData[i][1];
            try {
                num1 = Double.parseDouble(inputData[i][0]);
                num2 = Double.parseDouble(inputData[i][2]);
                if (!oper.equals("+") && !oper.equals("-") && !oper.equals("*") && !oper.equals("/")) {
                    throw new IllegalArgumentException("Operation Error!");
                }
                if (num2 == 0 && oper.equals("/")) {
                    throw new ArithmeticException("Error! Division by zero");
                }
                if (oper.equals("+")) {
                    String sum = Double.toString(num1 + num2);
                    System.out.println(sum);
                    rezultArr[i] = String.format("%s %s %s = %s", inputData[i][0], oper, inputData[i][2], sum);
                }
                if (oper.equals("-")) {
                    String sum = Double.toString(num1 - num2);
                    System.out.println(sum);
                    rezultArr[i] = String.format("%s %s %s = %s", inputData[i][0], oper, inputData[i][2], sum);
                }
                if (oper.equals("*")) {
                    String sum = Double.toString(num1 * num2);
                    System.out.println(sum);
                    rezultArr[i] = String.format("%s %s %s = %s", inputData[i][0], oper, inputData[i][2], sum);
                }
                if (oper.equals("/")) {
                    String sum = Double.toString(num1 / num2);
                    System.out.println(sum);
                    rezultArr[i] = String.format("%s %s %s = %s", inputData[i][0], oper, inputData[i][2], sum);
                }
            } catch (NumberFormatException e) {
                System.out.println("Error! Not number");
                rezultArr[i] = String.format("%s %s %s = Error! Not number ", inputData[i][0], oper, inputData[i][2]);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                rezultArr[i] = String.format("%s %s %s = %s", inputData[i][0], oper, inputData[i][2], ex.getMessage());
            } catch (ArithmeticException exc) {
                System.out.println(exc.getMessage());
                rezultArr[i] = String.format("%s %s %s = %s", inputData[i][0], oper, inputData[i][2], exc.getMessage());
            }
        }

        for (int i = 0; i < rezultArr.length; i++) {
            writerResult.write(rezultArr[i] + "\n");
            writerResult.flush();
        }
    }
}