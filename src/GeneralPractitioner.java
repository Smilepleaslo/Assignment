public class GeneralPractitioner extends HealthProfessional {
    private String qualifications;

    public GeneralPractitioner() {
        super();
        this.clinicname = "";
        this.qualifications = "";
    }

    public GeneralPractitioner(int id, String name, String doctortype, String qualifications) {
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
        System.out.println("Clinic Name: " + clinicname);
        System.out.println("Qualifications: " + qualifications);
    }
}

