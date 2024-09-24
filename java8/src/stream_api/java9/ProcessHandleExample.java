package stream_api.java9;
import java.lang.*;
public class ProcessHandleExample {
    public static void main(String[] args) {

//       ProcessHandle currentProcess = ProcessHandle .current();
//        System.out.println("processId: " +currentProcess .pid());
//        System.out.println("Direct Children :" + currentProcess.children());
//        System.out.println("Class Name" + currentProcess.getClass());
//
//        System.out.println("All Process" + ProcessHandle.allProcesses());
//
//        System.out.println("Process Info" +currentProcess .info());

        String sb = "Adil";
        String sb2 = "Adil";
        String sb3 = "Adil";
        String sb1= new String("Adil");

        System.out.println(sb.hashCode());
        System.out.println(sb2.hashCode());
        System.out.println(sb3.hashCode());
        System.out.println(sb1.hashCode());
//        System.out.println(sb3.compareTo(sb1) == 0); //true //false
//        System.out.println(sb3 == sb1);//false
    }
}
