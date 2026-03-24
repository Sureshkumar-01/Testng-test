import org.testng.Assert;

public class Example1 {
	
@Test
		int a=10,b=20;
		int expected=30;
		int result=a+b;
		
		Assert.assertEquals(result, expected, "Addition result is incorrect!");
		
}

	/*    // Method to perform addition
	    public int add(int a, int b) {
	        return a + b;
	    }

	    @Test
	    public void testAddition() {
	        int result = add(10, 20);
	        int expected = 30;
	        Assert.assertEquals(result, expected, "Addition result is incorrect!");  */


