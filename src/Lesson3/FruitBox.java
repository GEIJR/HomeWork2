package Lesson3;

import java.util.ArrayList;

public class FruitBox<Fruit> {
    ArrayList<Fruit> fruits = new ArrayList<>();

    private final double weightFruit;

    public  FruitBox(double weightFruit) {
        this.weightFruit= weightFruit;
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public double getBoxWeight(){
        return fruits.size() * weightFruit;
    }

    public boolean compare(FruitBox<?> box){
        return Math.abs(getBoxWeight() - box.getBoxWeight()) < 0.00001;
    }

    public void addFruits(FruitBox<Fruit> FruitBox){

        System.out.println("Количество яблок до пересыпания в первой коробке: " + fruits.size());
        System.out.println("Количество яблок до пересыпания во второй коробке: " + FruitBox.fruits.size());
        fruits.addAll(FruitBox.fruits);
        FruitBox.fruits.clear();
        FruitBox.fruits.trimToSize();
        System.out.println("Количество яблок после пересыпания в первой коробке: " + fruits.size());
        System.out.println("Количество яблок после пересыпания во второй коробке: " + FruitBox.fruits.size());
    }



}
