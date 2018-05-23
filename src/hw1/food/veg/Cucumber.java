package hw1.food.veg;

import hw1.food.Vegetable;

public class Cucumber extends Vegetable {
    int caloricity = 14;

    public Cucumber() {
        super.setName(this.getClass().getSimpleName());
        super.setCaloricity(caloricity);
    }
}
