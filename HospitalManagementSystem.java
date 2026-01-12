package hospital;

import java.util.Scanner;
import java.util.ArrayList;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Doctor> doctors = new ArrayList<>();
        ArrayList<Appointment> appointments = new ArrayList<>();

        while (true) {
            System.out.println("\n Hospital Management System ");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Create Appointment");
            System.out.println("4. Show Patients");
            System.out.println("5. Show Doctors");
            System.out.println("6. Show Appointments");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient Name: ");
                    String pname = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();
                    patients.add(new Patient(pname, age, disease));
                    System.out.println("Patient added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Doctor Name: ");
                    String dname = sc.nextLine();
                    System.out.print("Enter Specialization: ");
                    String spec = sc.nextLine();
                    doctors.add(new Doctor(dname, spec));
                    System.out.println("Doctor added successfully!");
                    break;

                case 3:
                    if (patients.isEmpty() || doctors.isEmpty()) {
                        System.out.println("Please add patients and doctors first!");
                        break;
                    }
                    System.out.println("Show Patient:");
                    for (int i = 0; i < patients.size(); i++) {
                        System.out.println((i + 1) + ". " + patients.get(i).name);
                    }
                   System.out.println("Select patient Index: ");
                    int pidx = sc.nextInt();
                    Patient  pts = patients.get(pidx-1);

                    System.out.println("Available Doctor:");
                    for (int i = 0; i < doctors.size(); i++) {
                        System.out.println((i + 1) + ". " + doctors.get(i).name);
                    }
                    System.out.println("Select doctor index = ");
                    int didx = sc.nextInt();
                        Doctor dct =doctors.get(didx-1);
                    
                    System.out.print("Enter Bill Amount: ");
                    double bill = sc.nextDouble();
                    sc.nextLine();
                 
                    appointments.add(new Appointment(pts, dct, bill));
                    System.out.println("Appointment created successfully!");
                    break;

                case 4:
                    System.out.println("\n Patient List ");
                    for (Patient p : patients) {
                    	p.display();
                    }
                    break;

                case 5:
                    System.out.println("\n Doctor List ");
                    for (Doctor d : doctors) {
                    	d.display();
                    }
                    break;

                case 6:
                    System.out.println("\n Appointment List ");
                    System.out.println("Show Patient:");
                    for (int i = 0; i < patients.size(); i++) {
                        System.out.println((i + 1) + ". " + patients.get(i).name);
                    }
                   System.out.println("Select patient Index: ");
                    int pidx1 = sc.nextInt();
                    Patient  pts1 = patients.get(pidx1-1);
                    
                    boolean found= false;
                    for (Appointment a : appointments) {
                    	if
                    	 (a.patient==pts1) {
                            	a.display();
                            	found = true;
                    	}
                    }
                   
                    if (!found) {
                        System.out.println("No result found for this patient.");
                    }
                    break;
                    
                case 7:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
