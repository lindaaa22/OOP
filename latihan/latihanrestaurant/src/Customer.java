package latihanrestaurant.src;
import java.util.*;

public class Customer {
    private String name;
    List <Dish> orders = new ArrayList<>();

    Customer(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void displayOrders(){
        System.out.println(name + " 's order");
        for(Dish dish : orders){
            dish.printDish();
        }
    }
}
