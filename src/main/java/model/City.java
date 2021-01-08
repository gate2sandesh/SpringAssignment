package model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class City {



    private Jobs jobs;
    private ShoppingMalls shop;
    private University uni;
    private Student student;
    private UpcomingProject project;


    public Jobs getJobs() {
        return jobs;
    }

    public void setJobs(Jobs jobs) {
        this.jobs = jobs;
    }

    public ShoppingMalls getShop() {
        return shop;
    }

    public void setShop(ShoppingMalls shop) {
        this.shop = shop;
    }

    public University getUni() {
        return uni;
    }

    public void setUni(University uni) {
        this.uni = uni;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public UpcomingProject getProject() {
        return project;
    }

    public void setProject(UpcomingProject project) {
        this.project = project;
    }

    public City(Jobs jobs, ShoppingMalls shop, University uni, Student student, UpcomingProject project) {
        this.jobs = jobs;
        this.shop = shop;
        this.uni = uni;
        this.student = student;
        this.project = project;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (jobs != null ? !jobs.equals(city.jobs) : city.jobs != null) return false;
        if (shop != null ? !shop.equals(city.shop) : city.shop != null) return false;
        if (uni != null ? !uni.equals(city.uni) : city.uni != null) return false;
        if (student != null ? !student.equals(city.student) : city.student != null) return false;
        return project != null ? project.equals(city.project) : city.project == null;
    }

    @Override
    public int hashCode() {
        int result = jobs != null ? jobs.hashCode() : 0;
        result = 31 * result + (shop != null ? shop.hashCode() : 0);
        result = 31 * result + (uni != null ? uni.hashCode() : 0);
        result = 31 * result + (student != null ? student.hashCode() : 0);
        result = 31 * result + (project != null ? project.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "City{" +
                "jobs=" + jobs +
                ", shop=" + shop +
                ", uni=" + uni +
                ", student=" + student +
                ", project=" + project +
                '}';
    }
}
