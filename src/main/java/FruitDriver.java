import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class FruitDriver {

         public static void main(String[] args){

             Fruit apple = new Fruit("Apple", 100);
             Fruit apple2 = new Fruit("Apple", 75);
             Fruit peach = new Fruit("Peach", 200);
             Fruit orange = new Fruit("Orange", 150);
             Fruit banana = new Fruit("Banana", 120);
             Fruit tangerine = new Fruit("Tangerine", 180);

List<Fruit> fruits new = new ArrayList<>();

             fruits.add(apple);
             fruits.add(apple2);
             fruits.add(peach);
             fruits.add(orange);
             fruits.add(banana);
             fruits.add(tangerine);
             fruits.forEach(System.out::print);
             Collection.sort(fruits);
             fruits.forEach((System.out::print));




         }











}



