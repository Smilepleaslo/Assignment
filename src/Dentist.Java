public class Dentist extends HealthProfessional {
    private String qualifications;

    public Dentist() {
        super();
        this.qualifications = "";
    }

    public Dentist(int id, String name, String doctortype, String qualifications) {
        super(id, name, doctortype);
        this.qualifications = qualifications;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Qualifications: " + qualifications);
    }
}
