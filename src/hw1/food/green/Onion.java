package hw1.food.green;

import hw1.food.Green;

public class Onion extends Green {
    int caloricity = 33;

    public Onion() {
        super.setName(this.getClass().getSimpleName());
        super.setCaloricity(caloricity);
    }
}
