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

    public String getPatientPhone() {
        return patientphone;
    }

    public void setPatientPhone(String patientphone) {
        this.patientphone = patientphone;
    }

    public String getPreferredTimeSlot() {
        return preferredtime;
    }

    public void setPreferredTimeSlot(String preferredtime) {
        this.preferredtime = preferredtime;
    }

    public HealthProfessional getDoctor() {
        return doctor;
    }

    public void setDoctor(HealthProfessional doctor) {
        this.doctor = doctor;
    }
}