import javax.print.attribute.standard.PresentationDirection;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InpOut {

    public static void main(String[] args) {

    /*    String path = "dir1/dir2/dir3";
        File dyrect = new File(path);
        dyrect.mkdirs();
        List <File> files = new ArrayList<>();
        files.add(new File(path+"Anna.txt"));
        files.add(new File(path+"Boris.txt"));
        files.add(new File(path+"Alla.txt"));
        files.add(new File(path+"123"));
        try {
            for (File f : files) {
                f.createNewFile();
            }
        } catch (IOException ex){
            ex.printStackTrace();
        }
        Arrays.stream(dyrect.listFiles((d, p)->p.contains("M")))
                .forEach(System.out::println);*/

       /*File file = new File("1234.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        StringBuilder result = new StringBuilder();
        try (Reader reader = new InputStreamReader(new FileInputStream(file))){
            char [] arr = new char[128];
            int count = reader.read(arr);
            while (count>0){
                result.append(arr,0,count);
                count=reader.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Arrays.stream(result.toString().split(" "))
                .filter(p->p.startsWith("М"))
                .forEach(System.out::println);*/

       /* File file = new File("1234.txt");
        try (OutputStream outputStream = new FileOutputStream(file,true)){
            outputStream.write("\nMusya molodez!".getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        File fileInp = new File("input.txt");
        StringBuilder result = new StringBuilder();
        try (Reader reader = new InputStreamReader(new FileInputStream(fileInp))){
            char [] arr = new char[128];
            int count = reader.read(arr);
            while (count>0){
                result.append(arr,0,count);
                count=reader.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
            Long sum =  Arrays.stream(result.toString().split(" "))
                        .map(p -> Long.parseLong(p))
                                .reduce(0L,(a,b)->a+b);

        File fileOut = new File("output.txt");
        try (OutputStream outputStream = new FileOutputStream(fileOut,false)){
            outputStream.write(Long.toString(sum).getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

