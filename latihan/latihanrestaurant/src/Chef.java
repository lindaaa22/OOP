package latihanrestaurant.src;

public class Chef {
    private String name; // atribute
    private String biography;

    // setter
    Chef(String name, String biography){
        this.name = name;
        this.biography = biography;
    }

    //getter
    String getName(){
        return name;
    }
    
    String getBiography(){
        return biography;
    }




}
