package model;

public class Student {

    private String studentName;
    private String gender;
    private String visaStatus;

    public Student(String studentName, String gender, String visaStatus) {
        this.studentName = studentName;
        this.gender = gender;
        this.visaStatus = visaStatus;

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getVisaStatus() {
        return visaStatus;
    }

    public void setVisaStatus(String visaStatus) {
        this.visaStatus = visaStatus;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (studentName != null ? !studentName.equals(student.studentName) : student.studentName != null) return false;
        if (gender != null ? !gender.equals(student.gender) : student.gender != null) return false;
        return visaStatus != null ? visaStatus.equals(student.visaStatus) : student.visaStatus == null;
    }

    @Override
    public int hashCode() {
        int result = studentName != null ? studentName.hashCode() : 0;
        result = 31 * result + (gender != null ? gender.hashCode() : 0);
        result = 31 * result + (visaStatus != null ? visaStatus.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", gender='" + gender + '\'' +
                ", visaStatus='" + visaStatus + '\'' +
                '}';
    }
}
