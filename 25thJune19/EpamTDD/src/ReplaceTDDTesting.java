import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReplaceTDDTesting {

	ReplaceTDD rt = new ReplaceTDD();
	

	@Test
	public void testWord() {
		assertEquals("abdc",rt.word("abcd"));
	}
	@Test
	public void testTwoLetterWord() {
		assertEquals("ba",rt.word("ab"));
	}
	@Test
	public void testOneLetterWord() {
		assertEquals("a",rt.word("a"));
	}
	@Test
	public void testEmptyString() {
		assertEquals("",rt.word(""));
	}
	@Test
	public void testt() {
		assertEquals("a",rt.word("a"));
	}
	
	@Test
	public void RemovingA() {
		assertEquals("BCD",rt.RemoveAFromString("abcd"));
		assertEquals("CD",rt.RemoveAFromString("aacd"));
		assertEquals("BCD",rt.RemoveAFromString("bacd"));
		assertEquals("BBAA",rt.RemoveAFromString("bbaa"));
		assertEquals("BAA",rt.RemoveAFromString("aabaa"));
	}
	
	
	
	

}
