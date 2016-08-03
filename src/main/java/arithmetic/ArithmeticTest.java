package arithmetic;

import static org.junit.Assert.*;


public class ArithmeticTest {

	@org.junit.Test
	public void AddingTest() {
		Arithmetic obj = new Arithmetic();
	
		assertEquals(0, 2.0,obj.performOperation(1, 1, '+'));
	}

	@org.junit.Test
	public void SubtractTest() {
		Arithmetic obj = new Arithmetic();
	
		assertEquals(0, 0.0,obj.performOperation(1, 1, '-'));
	}
	
	@org.junit.Test
	public void MultiplyTest() {
		Arithmetic obj = new Arithmetic();
	
		assertEquals(0, 0,obj.performOperation(0, 1, '*'));
		assertEquals(0, 0,obj.performOperation(1, 0, '*'));
		assertEquals(0, 0,obj.performOperation(0, 0, '*'));
		assertEquals(0, 25,obj.performOperation(5, 5, '*'));
	}
	
	@org.junit.Test
	public void DivideTest() {
		Arithmetic obj = new Arithmetic();
	
		assertEquals(0, 1,obj.performOperation(2, 2, '/'));
		assertEquals(0, 0,obj.performOperation(0, 1, '/'));
		assertEquals(0, 5,obj.performOperation(25, 5, '/'));
	}
	//TODO divide by zero and so on

}
