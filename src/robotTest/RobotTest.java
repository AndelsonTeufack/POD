package robotTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import robot.Robot;

class RobotTest {

	
	
	@Test
	void testRobotString() {
		Robot r = new Robot("tom");
	}
	

	@Test
	void testFire() {
		Robot F1 = new Robot("tom");
		Robot F2 = new Robot("tok");
		F1.fire(F2);
	}

}
