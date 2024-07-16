public class HealthProfessional {
    private int id;
    private String name;
    private String doctortype;

    public HealthProfessional() {
        this.id = 0;
        this.name = "";
        this.doctortype = "";
    }
    public HealthProfessional(int id, String name, String doctortype) {
        this.id = id;
        this.name = name;
        this.doctortype = doctortype;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDoctortype() {
        return doctortype;
    }

    public void PrintDetails(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Doctor Type: " + doctortype);
    }
}

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

    public String getQualifications() {
        return qualifications;
    }

    @Override
    public void PrintDetails() {
        super.PrintDetails();
        System.out.println("Clinic Name: " + clinicname);
        System.out.println("Qualifications: " + qualifications);
    }
}
