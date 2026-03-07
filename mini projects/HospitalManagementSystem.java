package week_07;

import java.util.ArrayList;
import java.util.Scanner;

class Entity {
    public String displayDetails() {
        return ""; 
    }
}

class Doctor extends Entity {
    String name;
    String specialty;
    ArrayList<Patient> patients;

    Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        this.patients = new ArrayList<>();
    }

    @Override
    public String displayDetails() {
        StringBuilder details = new StringBuilder("Doctor{name='" + name + "', specialty='" + specialty + "', patients=[");
        for (Patient patient : patients) {
            details.append(patient.displayDetails()).append(", ");
        }
        if (!patients.isEmpty()) {
            details.setLength(details.length() - 2); 
        }
        details.append("]}");
        return details.toString();
    }
}

class Patient extends Entity {
    String name;
    int age;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String displayDetails() {
        return "Patient{name='" + name + "', age=" + age + '}';
    }
}

public class HospitalManagementSystem {
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addDoctor() {
        System.out.print("Enter doctor's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter doctor's specialty: ");
        String specialty = scanner.nextLine();
        doctors.add(new Doctor(name, specialty));
    }

    public void addPatient() {
        System.out.print("Enter patient's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter patient's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter doctor's name to assign patient: ");
        String doctorName = scanner.nextLine();

        for (Doctor doctor : doctors) {
            if (doctor.name.equals(doctorName)) {
                doctor.patients.add(new Patient(name, age));
                return;
            }
        }
        System.out.println("Doctor not found!");
    }

    public void displayPatientsOfDoctor() {
        System.out.print("Enter doctor's name: ");
        String doctorName = scanner.nextLine();
        for (Doctor doctor : doctors) {
            if (doctor.name.equals(doctorName)) {
                System.out.println("Patients of Dr. " + doctor.name + ":");
                for (Patient patient : doctor.patients) {
                    System.out.println(patient.displayDetails());
                }
                return;
            }
        }
        System.out.println("Doctor not found!");
    }

    public void displayAllDoctorsAndPatients() {
        for (Doctor doctor : doctors) {
            System.out.println(doctor.displayDetails());
        }
    }

    public void removePatient() {
        System.out.print("Enter patient's name: ");
        String patientName = scanner.nextLine();
        for (Doctor doctor : doctors) {
            doctor.patients.removeIf(patient -> patient.name.equals(patientName));
        }
    }

    public void menu() {
        while (true) {
            System.out.println("1. Add Doctor\n2. Add Patient\n3. Display Patients of a Doctor\n4. Display All Doctors and Patients\n5. Remove Patient\n6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1 -> addDoctor();
                case 2 -> addPatient();
                case 3 -> displayPatientsOfDoctor();
                case 4 -> displayAllDoctorsAndPatients();
                case 5 -> removePatient();
                case 6 -> System.exit(0);
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    public static void main(String[] args) {
        new HospitalManagementSystem().menu();
    }
}