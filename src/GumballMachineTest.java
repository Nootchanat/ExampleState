import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GumballMachineTest {

	@Test
	void testInsertQuarter() {
		GumballMachine gm1 = new GumballMachine(2);
		gm1.insertOuarter();
		gm1.turnCrank();
		gm1.turnCrank();
		gm1.insertOuarter();
		gm1.turnCrank();
		gm1.insertOuarter();
		gm1.turnCrank();
	}

}
