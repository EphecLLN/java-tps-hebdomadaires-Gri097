package tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testjunitTest {

	@Test
	void testCarre() {
		testjunit calc = new testjunit();
		assertEquals(0, calc.carre(0));
	}

}
