package TestCases;




import java.util.Arrays;

import org.testng.annotations.Test;

import Constant.BaseTest;

public class Jeethu extends BaseTest{
	
	@Test(enabled = true)
	public void testing()
	{
	    
        int[] arrayOne = {24, 10, 11, 37, 21, 57};
          
        int[] arrayTwo = {21, 57, 37, 24, 11 , 10};
          
        boolean equalOrNot = Arrays.equals(arrayOne, arrayTwo);
          
        System.out.println("Input Arrays :");
         
        System.out.println("First Array : "+Arrays.toString(arrayOne));
         
        System.out.println("Second Array : "+Arrays.toString(arrayTwo));
         
        if (equalOrNot)
        {
            System.out.println("Two Arrays Are Equal");
        }
        else
        {
            System.out.println("Two Arrays Are Not equal");
        }
		
	}
	}
    
	
