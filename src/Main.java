import hw1.DishIngredientsComparatorByCaloricity;
import hw1.Ingredient;
import hw1.food.flavor.Salt;
import hw1.food.flavor.SourCream;
import hw1.food.green.Dill;
import hw1.food.green.Onion;
import hw1.food.veg.Buryak;
import hw1.food.veg.Cucumber;
import hw1.food.veg.Potato;
import hw1.food.veg.Tomato;
import hw1.liquid.Water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ingredient> salat = new ArrayList<>();
        Dill dill = new Dill();
        Onion onion = new Onion();
        Tomato tomato = new Tomato();
        Cucumber cucumber = new Cucumber();

        salat.add(dill);
        salat.add(onion);
        salat.add(tomato);
        salat.add(cucumber);

        Collections.sort(salat, new DishIngredientsComparatorByCaloricity());
        System.out.println("Salat ingredients with sorting by caloricity:");
        salat.forEach(System.out::println);
        int caloricityOfSalat = calculateCaloricity(salat);
        System.out.println("\nCaloricity of salat is: " + caloricityOfSalat);

        List<Ingredient> borsch = new ArrayList<>();
        Potato potato = new Potato();
        Buryak buryak = new Buryak();
        Water water = new Water();
        Salt salt = new Salt();
        SourCream sourCream = new SourCream();

        borsch.add(dill);
        borsch.add(onion);
        borsch.add(tomato);
        borsch.add(cucumber);
        borsch.add(potato);
        borsch.add(buryak);
        borsch.add(water);
        borsch.add(salt);
        borsch.add(sourCream);

        System.out.println("\nBorsch ingredients:");
        borsch.forEach(System.out::println);
        int caloricityOfBorsch = calculateCaloricity(borsch);
        System.out.println("\nCaloricity of borsch is: " + caloricityOfBorsch);

        int caloricityOfSearchedIngredient = 0;
        Ingredient ingredientWithNeededCaloricity = findIngredientByCaloricity(borsch, caloricityOfSearchedIngredient);

        System.out.println("\nIngredient with caloricity " + caloricityOfSearchedIngredient + " is: " + ingredientWithNeededCaloricity.getName());
    }

    public static int calculateCaloricity(List<Ingredient> dish){
        int caloricityOfDish = dish.stream().mapToInt(Ingredient::getCaloricity).sum();
        return caloricityOfDish;
    }

    public static Ingredient findIngredientByCaloricity(List<Ingredient> dish, int caloricity){
        Ingredient ingredientWithNeededCaloricuty = null;
        for (Ingredient ingr: dish) {
            if (ingr.getCaloricity() == caloricity) {
                ingredientWithNeededCaloricuty = ingr;
                return ingredientWithNeededCaloricuty;
            }
        }
        return ingredientWithNeededCaloricuty;
    }
}
