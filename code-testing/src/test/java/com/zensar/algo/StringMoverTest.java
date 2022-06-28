package com.zensar.algo;

import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class StringMoverTest
{

	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		System.out.println("runs before all test once");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception 
	{
		System.out.println("runs after all test once");
	}

	@BeforeEach
	void setUp() throws Exception 
	{
		System.out.println("runs before every test");
	}

	@AfterEach
	void tearDown() throws Exception
	{
		System.out.println("runs after every test");
	}
	
	@Test
	@Timeout(value = 3000, unit = TimeUnit.MILLISECONDS)
	void testMoveTwoChars()
	{
		StringMover obj = new StringMover();
		String actual = obj.moveTwoChars("hello");
		String expected = "llohe";
		assertEquals(expected, actual);	
	}
	
	@Test
	void testExceptionForTwoChars()
	{
		assertThrows(Exception.class,() -> {
			StringMover obj = new StringMover();
			String actual = obj.moveTwoChars("a");	
		});
	}
	
	@Test
	void testMoveTwoChars2() 
	{
		StringMover obj = new StringMover();
		String actual = obj.moveTwoChars("ab");
		String expected = "ab";
		assertEquals(expected, actual);
	}
	
	@ParameterizedTest
	@MethodSource(value = "stringProvider")
	void testOneAllInput(String input, String expected)
	{
		StringMover obj = new StringMover();
		String actual = obj.moveTwoChars(input);
		System.out.println("test for " + input + "," + expected);
		assertEquals(expected , actual);
	}
	
	public static Stream<Arguments> stringProvider()
	{
		return Stream.of(
				Arguments.of("hello", "llohe"),
				Arguments.of("ab", "ab"),
				Arguments.of("java", "vaja"),
				Arguments.of("go", "go"),
				Arguments.of("test", "stte"),
				Arguments.of("ramsingh", "msinghra"),
				Arguments.of("ganesh", "neshga")
				);
	}
}	
