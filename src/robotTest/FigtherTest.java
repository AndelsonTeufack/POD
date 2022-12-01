package robotTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import robot.Arena;
import robot.Figther;
import robot.Robot;

class FigtherTest {

	@Test
	void testFire() {
		Arena A1 = new Arena();
		Robot R1 = new Robot("R1");
		Figther F = new Figther("F1");
		A1.fight(F, R1);
	}

}
