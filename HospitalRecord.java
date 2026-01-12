package hospital;

class Patient {
    String name;
    int age;
    String disease;

     Patient(String name, int age, String disease) {
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

     void display() {
        System.out.println("Patient: " + name + "\n Age: " + age + "\n Disease: " + disease);
    }
}

class Doctor {
    String name;
    String specialization;

    Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

   void display() {
        System.out.println("Doctor: " + name + "\n Specialization: " + specialization);
    }
}

class Appointment {
    Patient patient;
    Doctor doctor;
    double bill;

    Appointment(Patient patient, Doctor doctor, double bill) {
        this.patient = patient;
        this.doctor = doctor;
        this.bill = bill;
    }

     void display() {
        System.out.println("Appointment -> Patient: " + patient.name + 
                           "\n Doctor: " + doctor.name + 
                           "\n Bill: " + bill);
    }
}
