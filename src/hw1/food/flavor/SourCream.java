package hw1.food.flavor;

import hw1.food.Flavoring;

public class SourCream extends Flavoring {
    int caloricity = 115;

    public SourCream() {
        super.setName(this.getClass().getSimpleName());
        super.setCaloricity(caloricity);
    }
}
