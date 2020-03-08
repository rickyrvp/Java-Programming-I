
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("name: ");
            String name = reader.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("studentnumber: ");
            String studentNumber = reader.nextLine();
            list.add(new Student(name, studentNumber));
        }
        for (Student student : list) {
            System.out.println(student);
        }

        System.out.println("Give search term: ");
        String search = reader.nextLine();
        for (Student student : list) {
            if (student.getName().contains(search)) {
                System.out.println("Result:" + student);
            }
        }
    }
}
