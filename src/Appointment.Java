public class Appointment{
    private String patientname;
    private int patientphone;
    private String preferredtime;
    private HealthProfessional doctor;

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
}