package my_package;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyClassTest {

	
	int [] a;
	@BeforeEach
	void setUp() throws Exception {
		a = new int [] {2,5,4};
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("this has nnot yet implemented");
	}

	@Test
	final void testSearch() {
		boolean val = (new MyClass()).search(a, 5);
		assertFalse(val);
	}

}
