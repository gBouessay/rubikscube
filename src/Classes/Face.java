package Classes;

import java.util.ArrayList;

public class Face {

	protected ArrayList<Case> top_ligne;
	protected ArrayList<Case> center_ligne;
	protected ArrayList<Case> bottom_ligne;
	
	public ArrayList<Case> getLeft_ligne() {
		return top_ligne;
	}
	public void setLeft_ligne(ArrayList<Case> left_ligne) {
		this.top_ligne = left_ligne;
	}
	public ArrayList<Case> getCenter_ligne() {
		return center_ligne;
	}
	public void setCenter_ligne(ArrayList<Case> center_ligne) {
		this.center_ligne = center_ligne;
	}
	public ArrayList<Case> getRight_ligne() {
		return bottom_ligne;
	}
	public void setRight_ligne(ArrayList<Case> right_ligne) {
		this.bottom_ligne = right_ligne;
	}
	public Face(ArrayList<Case> left_ligne, ArrayList<Case> center_ligne, ArrayList<Case> right_ligne) {
		super();
		this.top_ligne = left_ligne;
		this.center_ligne = center_ligne;
		this.bottom_ligne = right_ligne;
	}
	public Face() {
		// TODO Auto-generated constructor stub
	}
	
	public void afficher(){
		System.out.println("");
		for(Case c : this.top_ligne){
			c.afficher();
		}
		System.out.println("");
		for(Case c : this.center_ligne){
			c.afficher();
		}
		System.out.println("");
		for(Case c : this.bottom_ligne){
			c.afficher();
		}
		System.out.println("");
		
	}
}
