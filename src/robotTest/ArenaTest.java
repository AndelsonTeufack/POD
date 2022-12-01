package robotTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import robot.Arena;
import robot.Robot;

class ArenaTest {

	@Test
	void testFight() {
		Robot r1 = new Robot("tom");
		Robot r2 = new Robot("tok");
		Arena A = new Arena();
		A.fight(r1, r2);
	}

}
