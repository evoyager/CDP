package hw1;

import java.util.Comparator;

public class DishIngredientsComparatorByCaloricity implements Comparator<Ingredient> {
    @Override
    public int compare(Ingredient o1, Ingredient o2) {
        return o1.getCaloricity().compareTo(o2.getCaloricity());
    }
}
