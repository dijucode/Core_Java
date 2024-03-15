public class Driver {
    void print(Doctor d){
        System.out.println(d.doctorName);
        System.out.println(d.doctorAge);

    }
    public static void main(String[] args) {
        Driver dr = new Driver();
        Doctor d = new Doctor();
        d.doctorAge = "42";
        d.doctorName = "Arun Kumar";
        dr.print(d);


    }

}
class Doctor {
    String doctorName;
    String doctorAge;
}
