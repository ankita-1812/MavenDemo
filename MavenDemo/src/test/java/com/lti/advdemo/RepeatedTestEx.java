package com.lti.advdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestEx {
	
	@DisplayName("Repeat the test 5 times")
	@RepeatedTest(5)
	public void shouldRepeat() {
		int a=20,b=20;
		assertEquals(400,a*b,"should repeat test -passed");
		
		
	}

}
