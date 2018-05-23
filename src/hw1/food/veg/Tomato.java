package hw1.food.veg;

import hw1.food.Vegetable;

public class Tomato extends Vegetable {
    int caloricity = 20;

    public Tomato() {
        super.setName(this.getClass().getSimpleName());
        super.setCaloricity(caloricity);
    }
}
