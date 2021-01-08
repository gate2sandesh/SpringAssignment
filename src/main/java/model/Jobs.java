package model;

public class Jobs {

    private String typeOfJob;
    private int salary;
    private boolean isInsured;


    public Jobs(String typeOfJob, int salary, boolean isInsured) {
        this.typeOfJob = typeOfJob;
        this.salary = salary;
        this.isInsured = isInsured;
    }

    public String getTypeOfJob() {
        return typeOfJob;
    }

    public void setTypeOfJob(String typeOfJob) {
        this.typeOfJob = typeOfJob;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isInsured() {
        return isInsured;
    }

    public void setInsured(boolean insured) {
        isInsured = insured;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jobs jobs = (Jobs) o;

        if (salary != jobs.salary) return false;
        if (isInsured != jobs.isInsured) return false;
        return typeOfJob != null ? typeOfJob.equals(jobs.typeOfJob) : jobs.typeOfJob == null;
    }

    @Override
    public int hashCode() {
        int result = typeOfJob != null ? typeOfJob.hashCode() : 0;
        result = 31 * result + salary;
        result = 31 * result + (isInsured ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Jobs{" +
                "typeOfJob='" + typeOfJob + '\'' +
                ", salary=" + salary +
                ", isInsured=" + isInsured +
                '}';
    }
}
