# Junit4 

1. This project is build just to test the working of the junit3 with the java project

### Working

1. first create a project using maven choosing archtetype to be quickstart
2. Second Create a class in the project with some data in our case it is out Dog with getters and setters
3. now click on the default package and create the jnuit test cases 
4. Above option will automatically create the class
5. we just have to add the test cases to our class
4. @BeforeClass --> will run before any test case will run --> its name should be before
5. @AfterClass  --> will run at the last of the test cases --> Its name should be after
4. @Before      --> will run before every test cases       --> Its name should be setUp
5. @After       --> will run after every test cases        --> Its name should be tearDown
6. @Test        --> is used to create a test case          --> just put this above any of the function
7. 

#### How to create a test case

1. Add the annotaion @Test above any funciton with void return type
2. In this function we will compare some values using **assert.Equals** like there are other methods that can be used.

    ```java
		assertEquals("Error name is different","tommy",mdogName);
    ```

3. full example of the test case is 
```java
   	public void myDogBreedTest() {
           
		String breed=myDog.getBreed();
		assertEquals("Breed not same","bernard",breed);
		
	}
```
   
