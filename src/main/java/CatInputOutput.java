import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CatInputOutput {

    public static void main(String[] args) {

        File file = new File("789.cat");

        /* Cat cat1 = new Cat("Vas", "ewr", 2);
        Cat cat2 = new Cat("Mura", "sibir", 10);
        Cat cat3 = new Cat("Lus", "siam", 15);

        List<Cat> list = new ArrayList<>();
        list.add(cat1);
        list.add(cat2);
        list.add(cat3);

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(list);
        } catch (Exception ex) {
            ex.printStackTrace();
        }*/

        try (ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(file))){
           List <Cat> newList=new ArrayList<>();
           newList=(List<Cat>) objectInputStream.readObject();
           for (Cat cat:newList){
               System.out.println(cat.getName());
           }
        } catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
