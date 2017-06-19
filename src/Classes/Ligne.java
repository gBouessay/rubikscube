package Classes;

public class Ligne {

	protected Case left;
	protected Case center;
	protected Case right;
	
	public Case getLeft() {
		return left;
	}
	public void setLeft(Case left) {
		this.left = left;
	}
	public Case getCenter() {
		return center;
	}
	public void setCenter(Case center) {
		this.center = center;
	}
	public Case getRight() {
		return right;
	}
	public void setRight(Case right) {
		this.right = right;
	}
	public Ligne(Case left, Case center, Case right) {
		super();
		this.left = left;
		this.center = center;
		this.right = right;
	}
	
	
}
