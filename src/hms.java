import java.util.Scanner;

public class hms {
    private static queue<patients> patientQueue;
    private static queue<doctors> doctorQueue;
    public hms(int max) {

        patientQueue = new queue<patients>(max);
        doctorQueue = new queue<doctors>(max);
    }
    public static void addpatients(int id, String name, int age, String disease, String doctor, int appointmentNo){
        patients patient = new patients(id, name,age,disease,doctor, appointmentNo);
        patientQueue.enqueue(patient);
        System.out.println(" added: " + patient.getName());
    }
    public static void deletePatient() {
        patients patient = patientQueue.dequeue();
        if (patient != null) {

            System.out.println("1st record deleted: " + patient.getName());
        } else {
            System.out.println("No patient records available");

        }
    }

    public void viewPatients() {
        if (patientQueue.isEmpty()) {
            System.out.println("No patient records available");
            return;
        }
        System.out.println("Patients List");
        for (int i = 0; i < patientQueue.size(); i++) {
            patients patient = patientQueue.get(i);
            System.out.println("Patient Name : "+ patient.getName());
        }
    }
    public static void addDoctors(int id, String name, int age, String special, int appointmentNo){
        doctors doctor = new doctors(id, name,age,special, appointmentNo);
        doctorQueue.enqueue(doctor);
        System.out.println("Added: " + doctor.getName());
    }
    public static void deleteDoctors() {
        doctors doctor = doctorQueue.dequeue();
        if (doctor != null) {

            System.out.println("1st record deleted: " + doctor.getName());
        } else {
            System.out.println("No records available");

        }
    }
    public void viewDoctors() {
        if (doctorQueue.isEmpty()) {
            System.out.println("No patient records available");
            return;
        }
        System.out.println("Doctors List");
        for (int i = 0; i < doctorQueue.size(); i++) {
            doctors doctor = doctorQueue.get(i);
            System.out.println("Doctor Name : "+ doctor.getName());
        }
    }
    public static void mainOptions(){
        System.out.println("*******Welcome to Arogya Hospital Management System");
        System.out.println("Press 1 for Patients");
        System.out.println("Press 2 for Doctors");
        System.out.println("Press 3 for ADMIN");



    }

    public static void main(String[] args) {


        hms system = new hms(1000);

        system.addpatients(1, "Micky", 21, "nil", "Dr.Raj", 85);
        system.addpatients(2, "Author", 74, "Back Pain", "Dr.Jacky",91 );
        system.addpatients(2, "Joe", 74, "Back Pain", "Dr.Jacky",91 );

        mainOptions();
        while (true) {

            Scanner scan = new Scanner(System.in);
            int key = scan.nextInt();

            if (key == 1) {
                System.out.println("***Patients Dashboard***");
                System.out.println("Press 1 - View Patients Profile");
                System.out.println("Press 2 - View Appointments Details");

            } else if (key == 2) {
                System.out.println("Doctors Dashboard");
                System.out.println("Press 1 - View Patients Profile");
                System.out.println("Press 2 - View Appointments Details");

                int keyD = scan.nextInt();
                if (keyD==1){
                    system.viewPatients();

                }else if (keyD==2){
                    //system.viewAppoinments();

                }else {
                    System.out.println("Invalid Details");
                    main(null);
                }

            } else if (key == 3) {
                System.out.println("Admin Dashboard");
                System.out.println("Press 1 - View Patient's Profile");
                System.out.println("Press 2 - View Doctor's Profile");
                System.out.println("Press 3 - View Appointments Details");
                System.out.println("Press 4 - View Prescription Details");
                System.out.println("Press 5 - View Ward Details");
                System.out.println("Press 6 - View Nurse Details");
                int keyA = scan.nextInt();
                    if (keyA==1){
                        System.out.println("1-Add Patient");
                        System.out.println("2-Delete Patient");
                        System.out.println("3-View Patient");
                        int keyP = scan.nextInt();
                        if (keyP==1){
                            System.out.println("Enter Patient ID:");
                            int id = scan.nextInt();
                            System.out.println("Enter Patient Name:");
                            String name = scan.next();
                            System.out.println("Enter Patient Age:");
                            int age = scan.nextInt();
                            System.out.println("Enter Patient Disease:");
                            String disease = scan.next();
                            System.out.println("Enter Patient Doctor:");
                            String doctor = scan.next();
                            System.out.println("Enter Patient Appointment Number:");
                            int appointmentNo = scan.nextInt();
                            system.addpatients(id, name, age, disease, doctor, appointmentNo);

                        }else if (keyP==2){
                            system.deletePatient();
                            system.viewPatients();

                        }else if (keyP==3){
                           system.viewPatients();
                        }

                    }else if (keyA==2){

                        System.out.println("1-Add Doctor");
                        System.out.println("2-Delete Doctor");
                        System.out.println("3-View Doctor");
                        int keyD = scan.nextInt();
                        if (keyD==1){
                            System.out.println("Enter Doctor ID:");
                            int id = scan.nextInt();
                            System.out.println("Enter Doctor Name:");
                            String name = scan.next();
                            System.out.println("Enter Doctor Age:");
                            int age = scan.nextInt();
                            System.out.println("Enter Doctor's Specialization:");
                            String special = scan.next();

                            System.out.println("Enter Doctor Appointment Number:");
                            int appointmentNo = scan.nextInt();
                            system.addDoctors(id, name,age,special, appointmentNo);

                        }else if (keyD==2){
                            system.deleteDoctors();
                            system.viewDoctors();

                        }else if (keyD==3){
                            system.viewDoctors();
                        }


                    }else if (keyA==3){

                    }else if (keyA==4){

                    }else if (keyA==5){

                    }else if (keyA==6){
                    }




            } else {
                System.out.println("Invalid Input");
            }

        }
    }
}
