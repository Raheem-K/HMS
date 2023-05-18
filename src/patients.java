public class patients extends person {

//    private int id;
//    private String name;
//    private int age;
    private String disease;
    private String doctor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public int getAppointmentNo() {
        return appointmentNo;
    }

    public void setAppointmentNo(int appointmentNo) {
        this.appointmentNo = appointmentNo;
    }

    private int appointmentNo;

    public patients(int id,String name, int age,String disease,String doctor,int appointmentNo){
        this.id=id;
        this.name=name;
        this.age=age;
        this.disease=disease;
        this.doctor=doctor;
        this.appointmentNo=appointmentNo;
    }

}
