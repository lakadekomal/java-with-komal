package komalpractis;

import java.util.Arrays;
public class InsertElementInArraay {
public static void main(String[] args){
int[] originalArray = {1, 2, 3, 4, 5};
int elementToInsert = 10; 
int positionToInsert = 2;
int[] newArray = new int[originalArray.length + 1];
System.arraycopy(originalArray, 0, newArray, 0, positionToInsert);
newArray[positionToInsert] = elementToInsert;
System.arraycopy(originalArray, positionToInsert, newArray, positionToInsert + 1,
originalArray.length - positionToInsert);
System.out.println("Original Array: " + Arrays.toString(originalArray));
System.out.println("Array afterinsertion: " + Arrays.toString(newArray));
}
}

