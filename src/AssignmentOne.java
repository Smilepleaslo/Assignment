public class AssignmentOne{
//part 3-Using classes and objects

    public static void main(String[] args) {
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Shrestha", "General Practitioner", "MBBS");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Shakya", "General Practitioner", "B.Med");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Dr. Prajapati", "General Practitioner", "B.Surg");

        Dentist dentist1 = new Dentist(4, "Dr. Karki", "Dentist", "DMD");
        Dentist dentist2 = new Dentist(5, "Dr. Sebanja", "Dentist", "DDS");
    }
}
