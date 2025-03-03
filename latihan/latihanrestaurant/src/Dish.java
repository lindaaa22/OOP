package latihanrestaurant.src;

public class Dish {
    private String name;
    private String id;
    private Chef chef;

    //settter
    Dish(String name, String id, Chef chef){
        this.name = name;
        this.id = id;
        this.chef = chef;
        System.out.println("Dish added to menu: " + name);

    }


    //getter
    String getName(){
        return name;
    }

    String getId(){
        return id;
    }

    Chef getChef(){
        return chef;
    }

    void printDish(){
        System.out.println("Dish: " +name);
        System.out.println("ID : " +id);
        System.out.println("chef : "+ chef.getName());
        System.out.println("Biography: "+chef.getBiography());
            

    }



}
