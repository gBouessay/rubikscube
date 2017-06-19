package Classes;

public class Cube {

	protected Face front_face;
	protected Face left_face;
	protected Face right_face;
	protected Face back_face;
	protected Face top_face;
	protected Face bottom_face;
	public Face getFront_face() {
		return front_face;
	}
	public void setFront_face(Face front_face) {
		this.front_face = front_face;
	}
	public Face getLeft_face() {
		return left_face;
	}
	public void setLeft_face(Face left_face) {
		this.left_face = left_face;
	}
	public Face getRight_face() {
		return right_face;
	}
	public void setRight_face(Face right_face) {
		this.right_face = right_face;
	}
	public Face getBack_face() {
		return back_face;
	}
	public void setBack_face(Face back_face) {
		this.back_face = back_face;
	}
	public Face getTop_face() {
		return top_face;
	}
	public void setTop_face(Face top_face) {
		this.top_face = top_face;
	}
	public Face getBottom_face() {
		return bottom_face;
	}
	public void setBottom_face(Face bottom_face) {
		this.bottom_face = bottom_face;
	}
	public Cube(Face front_face, Face left_face, Face right_face, Face back_face, Face top_face, Face bottom_face) {
		super();
		this.front_face = front_face;
		this.left_face = left_face;
		this.right_face = right_face;
		this.back_face = back_face;
		this.top_face = top_face;
		this.bottom_face = bottom_face;
	}
	public void afficher(){
		this.front_face.afficher();
		this.left_face.afficher();
		this.right_face.afficher();
		this.back_face.afficher();
		this.top_face.afficher();
		this.bottom_face.afficher();
	}
}
