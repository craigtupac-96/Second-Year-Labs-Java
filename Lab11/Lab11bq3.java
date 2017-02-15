/*
Craig Lawlor
C00184465
*/
package Lab11;
import java.util.Scanner;

public class Lab11bq3 {

	public static void main(String[] args) {
		int arrSize;
		int high;
		int low;
		int hCount;
		int lCount;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many elements in the array?");
		arrSize = input.nextInt();
		
		int myArr[] = new int[arrSize];
		
		for(int index = 0; index < myArr.length; index++){
			System.out.println("Enter an integer");
			myArr[index] = input.nextInt();
		}
		for(int index = 0; index < myArr.length; index++){
			System.out.println(myArr[index]);
		}
		
		high = findHighest(myArr);
		low = findLowest(myArr);
		hCount = count(high, myArr);
		lCount = count(low, myArr);
		
		System.out.println("The highest number " + high +" appears " + hCount + " time(s) in the array");
		System.out.println("The lowest number " + low +" appears " + lCount + " time(s) in the array");
		input.close();
	}
	
	public static int findHighest(int[] theArray){
		int high = theArray[0];
		
		for(int index = 0; index < theArray.length; index++){
			if(theArray[index] > high){
				high = theArray[index];
			}
		}
		
		return high;
	}
	
	public static int findLowest(int[] theArray){
		int low = theArray[0];
		
		for(int index = 0; index < theArray.length; index++){
			if(theArray[index] < low){
				low = theArray[index];
			}
		}
		
		return low;
	}
	
	public static int count(int number, int[] theArray){
		int count = 0;
		
		for(int index = 0; index < theArray.length; index++){
			if( theArray[index] == number){
				count++;
			}
		}
		return count;
	}
}