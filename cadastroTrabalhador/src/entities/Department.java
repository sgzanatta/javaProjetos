package entities;

public class Department {
    //ATRIBUTOS
	private String name;
	
	//CONSTRUTOR
	public Department() {
		
	}
	
	public Department(String name) {
		this.name = name;
	}
	
	//METODOS GET SET
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
