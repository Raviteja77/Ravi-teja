package com.Raviteja.EpamHomeTask6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemoveFirst2Occurance_ATest {
	/*
	 * 1. ABCD => BCD
	 * 2. AABB => BB
	 * 3. BACD => BCD
	 * 4. BBAA => BBAA
	 * 5. BCDE => BCDE
	 */
	
	RemoveFisrt2Occurance_A removefirst2occurance_A;
	
	@BeforeEach
	public void setup() {
		removefirst2occurance_A = new RemoveFisrt2Occurance_A();
	}
	
	@Test
	void firstLetter_A() {
		
		assertEquals("BCD", removefirst2occurance_A.Remove_a("ABCD"));
	}
	
	@Test
	void firstTwoLetters_A() {
		
		assertEquals("BB", removefirst2occurance_A.Remove_a("AABB"));
	}
	
	@Test
	void secondLetter_A() {
		
		assertEquals("BCD", removefirst2occurance_A.Remove_a("BACD"));
	}
	
	@Test
	void lastLetters_A() {
		
		assertEquals("BBAA", removefirst2occurance_A.Remove_a("BBAA"));
	}
	
	@Test
	void noLetters_A() {
		
		assertEquals("BCDE", removefirst2occurance_A.Remove_a("BCDE"));
	}

}
