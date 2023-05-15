import java.util.Scanner;

public class hms {
    private static queue<patients> patientQueue;
    public hms(int max) {
        patientQueue = new queue<>(max);
    }
    public static void addpatients(int id, String name, int age, String disease, String doctor, int appointmentNo){
        patients patient = new patients(id, name,age,disease,doctor, appointmentNo);
        patientQueue.enqueue(patient);
        System.out.println("Patient added: " + patient.getName());
    }
    public static void deletePatient() {
        patients patient = patientQueue.dequeue();
        if (patient != null) {
            System.out.println("Deleted patient: " + patient);
        } else {
            System.out.println("No patients in the queue.");
        }
    }

    public static void mainOptions(){
        System.out.println("*******Welcome to Arogya Hospital Management System");
        System.out.println("Press 1 for Patients");
        System.out.println("Press 2 for Doctors");
        System.out.println("Press 3 for ADMIN");



    }
    public static void main(String[] args) {

        hms system = new hms(10);
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
                System.out.println("Press 3 - View Prescription Details");

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
                        System.out.println("1-Delete Patient");
                        System.out.println("1-View Patient");
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
                            hms.deletePatient();

                        }else if (keyP==3){

                        }



                    }else if (keyA==2){

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
