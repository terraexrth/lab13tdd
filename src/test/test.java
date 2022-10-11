package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import lab13.Fizz;

class test {

	@Test
	void test() {
		FizzClass fizz;
		
		@Test
		@DisplayName("test input 1")
		void FIZZBUZZ1() {
			fizz = new FizzClass(1);
			assertEquals("1", FizzBuzzCal());
			
		}
	}

}
