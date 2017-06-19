import java.util.ArrayList;

import Classes.Case;
import Classes.Cube;
import Classes.Face;

public class MoteurCube {
	
	
	
	public MoteurCube() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cube generateCube(){
		
		Case c_rouge = new Case("rouge","r");
		Case c_vert = new Case("vert","v");
		Case c_bleu = new Case("bleu","b");
		Case c_jaune = new Case("jaune","j");
		Case c_blanc = new Case("blanc","b");
		Case c_orange = new Case("orange","o");
		
		return new Cube(generateFace(c_rouge),generateFace(c_vert),generateFace(c_bleu),generateFace(c_jaune),generateFace(c_blanc),generateFace(c_orange));
		
	}
	
	public Face generateFace(Case c){
		
		ArrayList<Case> ligne = new ArrayList<>();
		ligne.add(c);
		ligne.add(c);
		ligne.add(c);
		Face face = new Face(ligne,ligne,ligne);
	
		return face;
		
	}
	

}
