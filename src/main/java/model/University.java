package model;

public class University {

    private String faculty;
    private int numberOfStudents;
    private String mediumOfClass;

    public University(String faculty, int numberOfStudents, String mediumOfClass) {
        this.faculty = faculty;
        this.numberOfStudents = numberOfStudents;
        this.mediumOfClass = mediumOfClass;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public String getMediumOfClass() {
        return mediumOfClass;
    }

    public void setMediumOfClass(String mediumOfClass) {
        this.mediumOfClass = mediumOfClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        University that = (University) o;

        if (numberOfStudents != that.numberOfStudents) return false;
        if (faculty != null ? !faculty.equals(that.faculty) : that.faculty != null) return false;
        return mediumOfClass != null ? mediumOfClass.equals(that.mediumOfClass) : that.mediumOfClass == null;
    }

    @Override
    public int hashCode() {
        int result = faculty != null ? faculty.hashCode() : 0;
        result = 31 * result + numberOfStudents;
        result = 31 * result + (mediumOfClass != null ? mediumOfClass.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "University{" +
                "faculty='" + faculty + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                ", mediumOfClass='" + mediumOfClass + '\'' +
                '}';
    }
}
