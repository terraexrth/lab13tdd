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
		@Test
		@DisplayName("test input 3")
		void FIZZBUZZ3() {
			fizz = new FizzClass(3);
			assertEquals("Fizz", fizz.FizzBuzzCal());
			System.out.println("3 = "+ fizz.FizzBuzzCal());
			
		}
		@Test
		@DisplayName("test input 5")
		void FIZZBUZZ5() {
			fizz = new FizzClass(5);
			assertEquals("Buzz", fizz.FizzBuzzCal());
			System.out.println("5 = "+ fizz.FizzBuzzCal());
			
		}
		
	}


