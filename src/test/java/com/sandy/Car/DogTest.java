package com.sandy.Car;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class DogTest {

Dog myDog;
	
	@BeforeClass
	
	public static void before() {
		System.out.println("before any tests");
		
	}
	
	@AfterClass
	public static void after() {
		System.out.println("after whole tests are completed");
	}
	
	//function that will before every test is called as setUp
	//function that will run after every test is called as teatDowns
	@Before
	public void setUp() {
		System.out.println("This is run before");
		myDog=new Dog("tommy","bernard");
		//since we are creating an object in each of our testcase we will create the object using the @before annotation
	}
	
	@After
	public void tearDown() {
		System.out.println("testcase is finished running");
	}
	
	@Test
	public void mDogNameTest() {
		
		String mdogName=myDog.getName();
		
		assertEquals("Error name is different","tommy",mdogName);
		
		//second parameter is the expected value and third is the actual value
		
		
	}
	
	@Test
	public void myDogBreedTest() {
		String breed=myDog.getBreed();
		assertEquals("Breed not same","bernard",breed);
		
	}
	
}
