
import java.io.*;

public class SerializationExample implements Serializable {


        int a =10;
        String name ="Adil" ;
       String password ="Adil@123" ;//null
     void show(){
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return "SerializationExample{" +
                "a=" + a +
                ", name='" + name + '\'' + ", password='" + password +
                '}';
    }


    @Serial
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject(); // Serialize non-transient fields

        // Custom serialization logic for the 'password' field
        oos.writeObject(password + " - Custom");
    }

    // Custom deserialization method
    @Serial
    private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
        ois.defaultReadObject(); // Deserialize non-transient fields

        // Custom deserialization logic for the 'password' field
        String passwordFromStream = (String) ois.readObject();
        name = passwordFromStream.replace(" - Custom", "");
    }


    public static void main(String[] args)  {
     try(FileOutputStream fos = new FileOutputStream("abc.txt")){

         ObjectOutputStream oos = new ObjectOutputStream(fos);


         oos.writeObject(new SerializationExample());

     }catch (Exception e){
     e.printStackTrace();
     }

     try(FileInputStream fileInputStream = new FileInputStream("abc.txt")){

         ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

         SerializationExample  o = (SerializationExample) objectInputStream.readObject();

         System.out.println(o.toString());
         o.show();

     }catch (Exception e){
         e.printStackTrace();
     }

    }


}
