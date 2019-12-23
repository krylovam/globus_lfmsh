package users;

public class Student extends User {
    private int team;
    private int grade;
    private int lecturesAttend;
    private int facAttend;
    private int certificates;
    private int labPass;
    private int facPass;
    private int seminarPass;

    public Student(String firstName, String lastName, String middleName, int grade) {
        super(firstName, lastName, middleName);
        this.team = 11 - grade;
        this.grade = grade;
    }

    public int getTeam() {
        return team;
    }

    public int getGrade() {
        return grade;
    }

    public int getLecturesAttend() {
        return lecturesAttend;
    }

    public int getFacAttend() {
        return facAttend;
    }

    public int getCertificates() {
        return certificates;
    }

    public int getLabPass() {
        return labPass;
    }

    public int getFacPass() {
        return facPass;
    }

    public int getSeminarPass() {
        return seminarPass;
    }

    public void setLecturesAttend(int lecturesAttend) {
        this.lecturesAttend = lecturesAttend;
    }

    public void setFacAttend(int facAttend) {
        this.facAttend = facAttend;
    }

    public void setCertificates(int certificates) {
        this.certificates = certificates;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public void setLabPass(int labPass) {
        this.labPass = labPass;
    }

    public void setFacPass(int facPass) {
        this.facPass = facPass;
    }

    public void setSeminarPass(int seminarPass) {
        this.seminarPass = seminarPass;
    }
}
