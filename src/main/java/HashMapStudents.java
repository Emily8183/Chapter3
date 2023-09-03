import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;


public class HashMapStudents {
    public static void main(String[] args){
        HashMap<Double, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName;

//        System.out.println("Enter your name: ");

        do{
            System.out.println("Student: ");
            studentName = input.nextLine();

            if(!studentName.equals("")){
                System.out.print("ID number: ");
                Double idNumber = input.nextDouble();
                students.put(idNumber, studentName);

                input.nextLine();
            }
        } while(!studentName.equals(""));

        System.out.println("\nClass roster: ");
        double sum= 0.0;

        for(Map.Entry<Double, String> student: students.entrySet()){
            System.out.println(student.getKey() + "(" + student.getValue() + ")");
        }





    }


}
