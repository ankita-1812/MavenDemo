package com.lti.advdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;

class ExceptionEx {

	Calculator c =new Calculator();
	@Disabled
	@Test
    void testException1() {



       Calculator c= new Calculator();
        
        final Exception e = assertThrows(ArithmeticException.class, () -> {
            c.searchEmpId(1);
      
      });
        
        
      Assertions.assertEquals("u enetered zero",e.getMessage());
    }


}
