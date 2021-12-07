package lesson1_1.Fruits;

import java.util.ArrayList;
import java.util.List;

public class Box<F extends Fruit> {

    private final List<F> fruits;

    public Box(){

        this.fruits = new ArrayList<>();
    }

    public boolean putFruit(F fruit){

        return fruits.add(fruit);}

    public F takeFruit(F fruit) {
        if (fruits.contains(fruit)) {
            fruits.remove(fruit);
            return fruit;
        }
        return null;
    }

    public double getWeight() {

        double weight = 0;
        for (F fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public void pourFruits (Box<? super F> box){

        box.fruits.addAll(this.fruits);
        fruits.clear();
    }

    public boolean compare (Box<?> box){

        return Math.abs(this.getWeight() - box.getWeight()) < 0.001;
    }
}
