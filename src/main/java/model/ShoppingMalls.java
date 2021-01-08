package model;

public class ShoppingMalls {

    private String nameOfMall;
    private int numberOfMall;

    public ShoppingMalls(String nameOfMall, int numberOfMall) {
        this.nameOfMall = nameOfMall;
        this.numberOfMall = numberOfMall;
    }

    public String getNameOfMall() {
        return nameOfMall;
    }

    public void setNameOfMall(String nameOfMall) {
        this.nameOfMall = nameOfMall;
    }

    public int getNumberOfMall() {
        return numberOfMall;
    }

    public void setNumberOfMall(int numberOfMall) {
        this.numberOfMall = numberOfMall;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShoppingMalls that = (ShoppingMalls) o;

        if (numberOfMall != that.numberOfMall) return false;
        return nameOfMall != null ? nameOfMall.equals(that.nameOfMall) : that.nameOfMall == null;
    }

    @Override
    public int hashCode() {
        int result = nameOfMall != null ? nameOfMall.hashCode() : 0;
        result = 31 * result + numberOfMall;
        return result;
    }

    @Override
    public String toString() {
        return "ShoppingMalls{" +
                "nameOfMall='" + nameOfMall + '\'' +
                ", numberOfMall=" + numberOfMall +
                '}';
    }
}
