public class Author {
	private String name;
	private String description;
	
	public Author(String name, String description) {
		this.name = name;
		this.description = description;
	}

	String getName(){
		return name;
	}

	String getDescription(){
		return description;
	}
}
