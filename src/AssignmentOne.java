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
