package project.TDD;

import static org.junit.Assert.*;

import org.junit.Test;

public class First2CharsTest {
	/* TODO list for my feature
	 * 1. 2 Chars: AB => B          Success
	 * 2. 2 Chars: AA => ""         Success
	 * 3. 4 chars: AABC => BC       Success
	 * 4. 4 chars: BADC => BDC      Success
	 * 5. n Chars: AABAA => BAA     Success
	 * 6. 1 Chars: B => B           Success
	 * 7. 1 Chars: A => ""          Success
	 * 8. empty Char: "" => ""      Success
	 * 9. 4 Chars: ABCD => BCD      Success
	 * 10. 4 Chars: BBAA => BBAA    Success
	 */

	First2Chars first2Chars=new First2Chars();
	
	@Test
	public void test2Chars() {
		assertEquals("B",first2Chars.check("AB"));
	}
	
	@Test
	public void testtwoChars() {
		assertEquals("",first2Chars.check("AA"));
	}
	
	@Test
	public void test4Chars() {
		assertEquals("BC",first2Chars.check("AABC"));
	}
		
	@Test
	public void testfourChars() {
		assertEquals("BDC",first2Chars.check("BADC"));
	}
	
	@Test
	public void testNChars() {
		assertEquals("BAA",first2Chars.check("AABAA"));
	}

	@Test
	public void test1Chars() {
		assertEquals("",first2Chars.check("A"));
	}
	
	@Test
	public void testoneChars() {
		assertEquals("B",first2Chars.check("B"));
	}
	
	@Test
	public void test0Chars() {
		assertEquals("",first2Chars.check(""));
	}

	@Test
	public void testFOURChars() {
		assertEquals("BCD",first2Chars.check("ABCD"));
	}
	
	@Test
	public void testFourChars() {
		assertEquals("BBAA",first2Chars.check("BBAA"));
	}
}
