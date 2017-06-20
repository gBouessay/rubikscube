import Classes.Cube;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoteurCube mc = new MoteurCube();
		Cube c = mc.generateCube();
		mc.scrambleCube(c);
		//c.afficher();
		
	}

}
