public class Appointment{
    private String patientname;
    private int patientphone;
    private String preferredtime;
    private HealthProfessional doctor;

    public Appointment(){
        this.patientname = "";
        this.patientphone = 0;
        this.preferredtime = "";
        this.doctor= null;
    }

    public Appointment(String patientname, int patientphone, String preferredtime, Healthprofessional doctor) {
        this.patientname = patientname;
        this.patientphone = patientphone;
        this.preferredtime = preferredtime;
        this.doctor= doctor;
    }

    public String getPatientName() {
        return patientname;
    }

    public void setPatientName(String patientname) {
        this.patientname = patientname;
    }

    public int getPatientPhone() {
        return patientphone;
    }

    public void setPatientPhone(int patientphone) {
        this.patientphone = patientphone;
    }

    public String getPreferredTime() {
        return preferredtime;
    }

    public void setPreferredTime(String preferredtime) {
        this.preferredtime = preferredtime;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    public void setDoctor(HealthProfessional doctor) {
        this.doctor = doctor;
    }

    public void printDetails() {
        System.out.println("Patient Name:" + patientname);
        System.out.println("Patient Phone Number:" + patientphone);
        System.out.println("Preffered Time Slot:" + preferredtime);

        if (doctor != null) {
            System.out.println("Doctor: " + doctor.getName();
        } else {
            System.out.println("Doctor Not Selected");
        }
    }
}