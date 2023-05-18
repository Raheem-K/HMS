public class doctors extends person{


    public int getAppointmentNo() {
        return appointmentNo;
    }

    public void setAppointmentNo(int appointmentNo) {
        this.appointmentNo = appointmentNo;
    }

    int appointmentNo;
    String special;

    public doctors(int id, String name, int age, String special, int appointmentNo){
        this.id=id;
        this.name=name;
        this.age=age;
        this.special=special;
        this.appointmentNo=appointmentNo;
    }

    public String getName() {
        return name;
    }
}
