package robot;

public class MainApp {

	public static void main(String[] args) {
		
		Robot R1 = new Robot("R1");
		Robot R2 = new Robot("R2");
		Figther F = new Figther("F1");
		Arena A1 = new Arena();
		
		A1.fight(R1, R2);
		
		A1.fight(F, R1);
	}

}
