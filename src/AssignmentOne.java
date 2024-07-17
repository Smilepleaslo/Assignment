import java.util.ArrayList;

public class AssignmentOne{
    private static final ArrayList<Appointment> appointmentsList = new ArrayList<>();

    //part 3-Using classes and objects
    public static void main(String[] args) {
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Shrestha", "General Practitioner", "MBBS");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Shakya", "General Practitioner", "B.Med");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Prajapati", "General Practitioner", "B.Surg");

        Dentist dentist1 = new Dentist(4, "Dr. Karki", "Dentist", "DMD");
        Dentist dentist2 = new Dentist(5, "Dr. Sebanja", "Dentist", "DDS");
        // Doctor Information
        System.out.println("The List of Available Doctors are Given Below:");
        System.out.println("General Practitioners:");
        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        gp3.printDetails();
        System.out.println("------------------------------");

        System.out.println("Dentists:");
        dentist1.printDetails();
        System.out.println("------------------------------");
        dentist2.printDetails();
        System.out.println("------------------------------");

        createAppointment("Abc Shrestha", 123456789, "10:00 AM", gp1);
        createAppointment("Bcd Shakya", 234567891, "11:00 AM", gp2);
        createAppointment("Cde Prajapati", 345678912, "12:00 PM", gp3);

        createAppointment("Def karki", 456789123, "1:00 PM", dentist1);
        createAppointment("Efg Sebanja", 567891234, "2:00 PM", dentist2);
        printExistingAppointments(appointmentsList);
    }

    // Part 5 –  Collection of appointments
    public static void createAppointment(String patientname, int patientphone, String preferredtime, HealthProfessional doctor){
        if (patientname.isEmpty() || patientphone==0 || preferredtime.isEmpty() || doctor==null){
            System.out.println("Appointment cannot be created, All information should be provide");
        } else {
            Appointment appointment1 = new Appointment(patientname, patientphone, preferredtime, doctor);
            appointmentsList.add(appointment1);
            System.out.println("Appointment created successfully");
            System.out.println("------------------------------");
        }
    }

    public static void printExistingAppointments(ArrayList<Appointment> appointmentsList) {
        if (appointmentsList.isEmpty()){
            System.out.println("No current Appointment");
        }else {
            System.out.println("Existing Appointments:");
            for (Appointment appointment : appointmentsList) {
                System.out.println("Patient Name: " + appointment.getPatientName());
                System.out.println("Patient Phone: " + appointment.getPatientPhone());
                System.out.println("Preferred Time: " + appointment.getPreferredTime());
                System.out.println("Doctor: " + appointment.getDoctor().getName());
                System.out.println("------------------------------");
            }
        }
    }
}
