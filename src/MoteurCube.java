import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

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
	
	public Cube scrambleCube(Cube c){
		
		String[] tabDeplacement = getTabDeplacement();
		
		for(int i=0; i<25;i++){

			c = moove(tabDeplacement[i], c);
		}
					
		return c;
	}
	
	
	public Cube moove(String tabDeplacement, Cube cube){
		
		String[] faceImpactees = getFacesMoove(tabDeplacement);
		
		return cube;
	}
	
	public String[] getFacesMoove(String deplacement){
		
		String[] faces = new String[4];
		
		switch (deplacement) {
		case "L":	
			faces[1] = "front_face";
			faces[2] = "bottom_face";
			faces[3] = "back_face";
			faces[4] = "top_face";
			break;
		case "L'":	
			faces[1] = "top_face";
			faces[2] = "back_face";
			faces[3] = "bottom_face";
			faces[4] = "front_face";
			break;
		case "R":	
			faces[1] = "front_face";
			faces[2] = "top_face";
			faces[3] = "back_face";
			faces[4] = "bottom_face";
			break;
		case "R'":	
			faces[1] = "top_face";
			faces[2] = "back_face";
			faces[3] = "bottom_face";
			faces[4] = "front_face";
			break;
		case "U":	
			faces[1] = "front_face";
			faces[2] = "left_face";
			faces[3] = "back_face";
			faces[4] = "right_face";
			break;
		case "U'":	
			faces[1] = "right_face";
			faces[2] = "back_face";
			faces[3] = "left_face";
			faces[4] = "front_face";
			break;
		case "D":	
			faces[1] = "front_face";
			faces[2] = "left_face";
			faces[3] = "back_face";
			faces[4] = "bottom_face";
			break;
		case "D'":	
			faces[1] = "front_face";
			faces[2] = "left_face";
			faces[3] = "back_face";
			faces[4] = "bottom_face";
			break;
		case "F":	
			faces[1] = "front_face";
			faces[2] = "left_face";
			faces[3] = "back_face";
			faces[4] = "bottom_face";
			break;
		case "F'":	
			faces[1] = "front_face";
			faces[2] = "left_face";
			faces[3] = "back_face";
			faces[4] = "bottom_face";
			break;
		case "B":	
			faces[1] = "front_face";
			faces[2] = "left_face";
			faces[3] = "back_face";
			faces[4] = "bottom_face";
			break;
		case "B'":	
			faces[1] = "front_face";
			faces[2] = "left_face";
			faces[3] = "back_face";
			faces[4] = "bottom_face";
			break;
			

		default:
			break;
		}
		return faces;
	}
	
	public String[] getTabDeplacement(){
		String[] tabDeplacement = new String[25];
		for(int i=0;i<25;i++){
			tabDeplacement[i]= this.getRandomSens();
		}
		return tabDeplacement;
	}
	
	public String getRandomSens(){
		
		int randomNum = ThreadLocalRandom.current().nextInt(1,7);
		int randomNumBis = ThreadLocalRandom.current().nextInt(1,3);
		String sens = "";
		
		switch(randomNum){
		case 1 : 
			//Rotation droite
			sens = "R";
			break;
		
		case 2 : 
			//Rotation gauche
			sens = "L";
			break;
	
			
		case 3 : 
			//Rotation haut
			sens = "U";
			break;
			
		case 4 : 
			//Rotation bas
			sens = "D";
			break;
			
		case 5 : 
			//Rotation avant
			sens = "F";
			break;
			
		case 6 : 
			//Rotation arrière
			sens = "B";
			break;
		}
		
		switch(randomNumBis){
		case 1:
			sens = sens +"";
			break;
		case 2 :
			sens = sens +"'";
		}
		
	
		return sens;
	}

}
