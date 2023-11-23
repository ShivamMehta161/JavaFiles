import java.util.Scanner;

class Student1 {
    int uid;
    String name;

    Student1(int uid, String name) {
        this.uid = uid;
        this.name = name;
    }
}

public class exception {

    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("There are two Students are there in a LIST");
        Student1 students[] = new Student1[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter ID");
            int id = scanner.nextInt();
            System.out.println("Enter Name");
            String name = scanner.next();

            students[i] = new Student1(id, name);
        }

        System.out.println("Student List");

        for (int i = 0; i < 2; i++) {
            System.out.println(students[i].uid + " " + students[i].name);
        }

        char op = 'n';

        System.out.println("Do you want to Extend the list? (y/n)");
        op = scanner.next().charAt(0);

        if (op == 'y') {
            try {
                System.out.println("Enter ID");
                int id = scanner.nextInt();
                System.out.println("Enter Name");
                String name = scanner.next();

                students[2] = new Student1(id, name);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Array Index Out of Bounds. Cannot extend the list.");
            }
        }

        scanner.close();
    }
}
