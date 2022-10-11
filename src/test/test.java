package test;

import static org.junit.jupiter.api.Assertions.*;

import main.FizzClass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class test {

		FizzClass fizz;
		
		@Test
		@DisplayName("test input 1")
		void FIZZBUZZ1() {
			fizz = new FizzClass(1);
			assertEquals("1", fizz.FizzBuzzCal());
			System.out.println("1 = "+ fizz.FizzBuzzCal());
			
		}
	}


