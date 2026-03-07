package polymarphism;
import java.util.Scanner;

class Room {
    protected String name;
    protected String location;
    protected String name_institue;
    protected int no;
    protected int no_stud;

    Room(String name, String location, int no, int no_stud, String name_institue) {
        this.location = location;
        this.name = name;
        this.name_institue = name_institue;
        this.no = no;
        this.no_stud = no_stud;
    }

    protected void detail() {
    }

    protected void detail(int n, int n2) {
    }

    protected int per_cls_stu() {
        return (no == 0) ? 0 : no_stud / no; // avoid divide by zero
    }
}

class Office extends Room {
    private String name_off;

    Office(String name, String location, String name_institue, int no, int no2, String name_off) {
        super(name, location, no, no2, name_institue);
        this.name_off = name_off;
    }

    @Override
    protected void detail() {
        System.out.println("NAME: " + name +
                "\nOffice name: " + name_off +
                "\nLocation: " + location +
                "\nInstitute: " + name_institue);
    }

    @Override
    protected void detail(int n, int n2) {
        System.out.println("\nRoom count: " + no +
                "\nTotal students: " + no_stud +
                "\nStudents per class: " + per_cls_stu());
    }
}

public class method_overload_over_on_override {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name of teacher:");
        String name = sc.nextLine();

        System.out.println("Location of office:");
        String location = sc.nextLine();

        System.out.println("Name of institute:");
        String name_institue = sc.nextLine();

        System.out.println("Office name:");
        String name_off = sc.nextLine();

        System.out.println("Do you want class and student number details? (yes/no):");
        String check = sc.nextLine();

        int no = 0;
        int no_stud = 0;

        if (check.equalsIgnoreCase("yes")) {
            System.out.println("Enter number of classes:");
            no = sc.nextInt();

            System.out.println("Enter total number of students:");
            no_stud = sc.nextInt();
        }

        Room n1 = new Office(name, location, name_institue, no, no_stud, name_off);

        n1.detail();
        if (check.equalsIgnoreCase("yes")) {
        n1.detail(no, no_stud);
        }
    }
}

