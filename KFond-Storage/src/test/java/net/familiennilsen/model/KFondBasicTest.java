package net.familiennilsen.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KFondBasicTest {

	@Test
	void test() {
		KFondBasic t = new KFondBasic("Kjell","Boka");
		Assertions.assertNotNull(t, "Object should exsist");
		Assertions.assertEquals(t.getAuthor(), "Kjell");
		
	}

}
