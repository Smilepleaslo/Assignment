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

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDoctortype() {
        return doctortype;
    }

    public void setDoctortype(String doctortype) {
        this.doctortype = doctortype;
    }

    public void printDetails(){
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
