package hw1.food.flavor;

import hw1.food.Flavoring;

public class Salt extends Flavoring {
    int caloricity = 0;

    public Salt() {
        super.setName(this.getClass().getSimpleName());
        super.setCaloricity(caloricity);
    }
}
