package model;

public class UpcomingProject {

    private String projectName;
    private String typeOfProject;
    private int budget;

    public UpcomingProject(String projectName, String typeOfProject, int budget) {
        this.projectName = projectName;
        this.typeOfProject = typeOfProject;
        this.budget = budget;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getTypeOfProject() {
        return typeOfProject;
    }

    public void setTypeOfProject(String typeOfProject) {
        this.typeOfProject = typeOfProject;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UpcomingProject that = (UpcomingProject) o;

        if (budget != that.budget) return false;
        if (projectName != null ? !projectName.equals(that.projectName) : that.projectName != null) return false;
        return typeOfProject != null ? typeOfProject.equals(that.typeOfProject) : that.typeOfProject == null;
    }

    @Override
    public int hashCode() {
        int result = projectName != null ? projectName.hashCode() : 0;
        result = 31 * result + (typeOfProject != null ? typeOfProject.hashCode() : 0);
        result = 31 * result + budget;
        return result;
    }

    @Override
    public String toString() {
        return "UpcomingProject{" +
                "projectName='" + projectName + '\'' +
                ", typeOfProject='" + typeOfProject + '\'' +
                ", budget=" + budget +
                '}';
    }
}
