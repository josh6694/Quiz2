package MainPackage;
import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

// Here I test my methods to make sure calculations are correct


public class TuitionJunit {

// Test generateTuition() Method
	@Test
	public void testgenerateTuition() {
		
		Tuition Student1 = new Tuition(12350,.5, .3, 10);
		Tuition Student3 = new Tuition(10000,.06, .30, 10);
		assertTrue("Works", ((Student1.generateTuition())==41681.25));

		assertTrue("Works", ((Student3.generateTuition())==11910.16));

		}
	// Test generatePayment() Method
	@Test
	public void testgeneratePayment() {
		Tuition Student1 = new Tuition(12350,.5, .3, 10);
		Tuition Student3 = new Tuition(10000,.06, .30, 10);
		assertTrue("Works", ((Student1.generatePayment())==10371.046531962826));

		assertTrue("Works", ((Student3.generatePayment())==2963.462553621169));

	}

}
