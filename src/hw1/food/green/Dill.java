package hw1.food.green;

import hw1.food.Green;

public class Dill extends Green {
    int caloricity = 32;

    public Dill() {
        super.setName(this.getClass().getSimpleName());
        super.setCaloricity(caloricity);
    }
}
