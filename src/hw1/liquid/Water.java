package hw1.liquid;

import hw1.Liquid;

public class Water extends Liquid {
    int caloricity = 0;

    public Water() {
        super.setName(this.getClass().getSimpleName());
        super.setCaloricity(caloricity);
    }
}
