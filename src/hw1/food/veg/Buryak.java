package hw1.food.veg;

import hw1.food.Vegetable;

public class Buryak extends Vegetable {
    int caloricity = 43;

    public Buryak() {
        super.setName(this.getClass().getSimpleName());
        super.setCaloricity(caloricity);
    }
}
