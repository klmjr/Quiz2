package quiz2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Quiz2Test {
	
	@Test
	public void quizTesting() {
		Quiz2 q = new Quiz2(10000, 5000, 10, .1);
		Quiz2 q1 = new Quiz2(35000, 0, 60, .1);
		
		assertEquals(523.20, Quiz2.monthlyCarPayment(q), 2);
		assertEquals(9618.79, Quiz2.compoundInterest(q1), 2);
		
		
	}
	


}
