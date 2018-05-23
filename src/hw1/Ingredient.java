package hw1;

public class Ingredient {
    private String name;
    private int caloricity;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCaloricity(int caloricity) {
        this.caloricity = caloricity;
    }

    public Integer getCaloricity() {
        return caloricity;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", caloricity=" + caloricity +
                '}';
    }
}
