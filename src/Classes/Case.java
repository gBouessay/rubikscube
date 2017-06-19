package Classes;

public class Case {

	protected String name;
	protected String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Case(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public void afficher(){
		System.out.print(this.color);
	}
	
}
