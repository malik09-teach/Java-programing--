package student_Forms;

public class Student {
             private String name;
    private String gender;
          private String department;

         public Student(String name, String gender, String department) {
        this.name = name;
        this.gender = gender;
        this.department = department;
    }

    
          public String getName() { return name; }
    public String getGender() { return gender; }
                public String getDepartment() { return department; }

    @Override
          public String toString() {
                 return name + " (" + gender + ") - " + department;
    }
}