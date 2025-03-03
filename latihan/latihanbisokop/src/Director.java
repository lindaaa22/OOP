public class Director {
    private String name;
    private String biography;

    // setter

    Director(String name, String biography){
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
