package io.quind.calculator;

import io.quind.calculator.domain.Calculate;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {


	//Arr
	int op1=3;
	int op2=4;
	int result;
	Calculate obj = new Calculate();


	@Test
	void testAdd() {
		result=7;
		//Act
		int res = obj.addTwoNumber(op1,op2);

		//Ass
		assertEquals(result,result);
	}

	@Test
	void testSub() {
		result=-1;
		//Act
		int res = obj.subTwoNumber(op1,op2);

		//Ass
		assertEquals(result,result);
	}

	@Test
	void testDiv() {
		result=0;
		//Act
		int res = obj.subTwoNumber(op1,op2);

		//Ass
		assertEquals(result,result);
	}

	@Test
	void testMult() {
		result=12;
		//Act
		int res = obj.subTwoNumber(op1,op2);

		//Ass
		assertEquals(result,result);
	}

}
