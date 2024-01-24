package komalpractis;

import java.util.Arrays;
public class ReverseArray {
	public static void main(String[] args){ 
	int[] originalArray = {1, 2, 3, 4, 5};
	int[] reversedArray = new int[originalArray.length];
	for (int i = 0, j = originalArray.length - 1; i < originalArray.length; i++, j--) { 
	reversedArray[j] = originalArray[i];
	}
	
	System.out.println("Original Array: " + Arrays.toString(originalArray)); 
	System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
	}
	}
