package hw1.food.veg;

import hw1.food.Vegetable;

public class Potato extends Vegetable {
    int caloricity = 77;

    public Potato() {
        super.setName(this.getClass().getSimpleName());
        super.setCaloricity(caloricity);
    }
}
