
public class GeneralPractitioner extends HealthProfessional {
    private String clinicname;
    private String qualifications;

    public GeneralPractitioner() {
        super();
        this.clinicname = "";
        this.qualifications = "";
    }

    public GeneralPractitioner(int id, String name, String doctortype, String clinicname, String qualifications) {
        super(id, name, doctortype);
        this.clinicname = clinicname;
        this.qualifications = qualifications;
    }

    public String getClinicName() {
        return clinicname;
    }

    public void setClinicName(String clinicname) {
        this.clinicname = clinicname;
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

public class Dentist extends HealthProfessional {
    private String clinicname;
    private String qualifications;

    public Dentist() {
        super();
        this.clinicname="";
        this.qualifications="";
    }

    public Dentist(int id, String name, String doctortype, String clinicname, String qualifications) {
        super(id, name, doctortype);
        this.clinicname = clinicname;
        this.qualifications = qualifications;
    }

    public String getClinicName() {
        return clinicname;
    }

    public void setClinicName(String clinicname) {
        this.clinicname = clinicname;
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

//part 3-Using classes and objects
