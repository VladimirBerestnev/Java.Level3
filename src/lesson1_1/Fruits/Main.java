package lesson1_1.Fruits;

public class Main {

    public static void main(String[] args) {

        Box<Apple> box1 = new Box<Apple>();

        box1.putFruit(new Apple());
        box1.putFruit(new Apple());
        box1.putFruit(new Apple());
        box1.putFruit(new Apple());
        box1.putFruit(new Apple());
        box1.putFruit(new Apple());

        System.out.println(box1.getWeight());

        Box<Orange> box2 = new Box<Orange>();

        box2.putFruit(new Orange());
        box2.putFruit(new Orange());
        box2.putFruit(new Orange());
        box2.putFruit(new Orange());
        box2.putFruit(new Orange());
        box2.putFruit(new Orange());

        System.out.println(box2.getWeight());

   System.out.println(box1.compare(box2));

        Box<Apple> box3 = new Box<>();
        box1.pourFruits(box3);
    }
}
