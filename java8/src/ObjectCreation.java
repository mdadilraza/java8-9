import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectCreation {
    void print(){
        System.out.println("Hello");
    }
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException, NoSuchMethodException, InvocationTargetException {

        //1)
        new ObjectCreation().print();

        //2)
        ObjectCreation objectCreation = (ObjectCreation) Class.forName("ObjectCreation")
                .newInstance();
        System.out.println(objectCreation);
        objectCreation.print();

        //3)
        ObjectCreation clone = (ObjectCreation) objectCreation.clone();

        Class<?> objectCreation1 = Class.forName("ObjectCreation");
        ObjectCreation o = (ObjectCreation) objectCreation1.getConstructor()
                .newInstance();




    }
}


