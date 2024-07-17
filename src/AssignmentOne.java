public class AssignmentOne{
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
    }

    // Part 5 –  Collection of appointments
    private static ArrayList<Appointment> appointmentsList = new ArrayList<>();

    public static void createAppointment(String patientname, int patientphone, String preferredtime, HealthProfessional doctor){
        
    }
}
