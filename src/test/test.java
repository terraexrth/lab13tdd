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
		@Test
		@DisplayName("test input 15")
		void FIZZBUZZ15() {
			fizz = new FizzClass(15);
			assertEquals("FizzBuzz", fizz.FizzBuzzCal());
			System.out.println("15 = "+ fizz.FizzBuzzCal());
			
		}
		@Test
		@DisplayName("test input 20")
		void FIZZBUZZ20() {
			fizz = new FizzClass(20);
			assertEquals("Buzz", fizz.FizzBuzzCal());
			System.out.println("20 = "+ fizz.FizzBuzzCal());
			
		}
		@Test
		@DisplayName("test input 88")
		void FIZZBUZZ88() {
			fizz = new FizzClass(88);
			assertEquals("88", fizz.FizzBuzzCal());
			System.out.println("88 = "+ fizz.FizzBuzzCal());
			
		}
		@Test
		@DisplayName("test input 105")
		void FIZZBUZZ105() {
			fizz = new FizzClass(105);
			assertEquals("its over than 100", fizz.FizzBuzzCal());
			System.out.println("105 = "+ fizz.FizzBuzzCal());
			
		}
		@Test
		@DisplayName("test input 0")
		void FIZZBUZZ0() {
			fizz = new FizzClass(0);
			assertEquals("its should over than 1", fizz.FizzBuzzCal());
			System.out.println("its should over than 1 = "+ fizz.FizzBuzzCal());
			
		}
		
		
		
	}


