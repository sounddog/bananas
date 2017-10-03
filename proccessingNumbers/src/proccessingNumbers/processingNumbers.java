package proccessingNumbers;
import java.util.*;
public class processingNumbers {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//call all variables in here
		boolean donezo=false;
		int evenSum=0;
		System.out.println("Enter one data point pls");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		int min=x;
		int max=x;
		int evenMax = 0; //TODO resolve initialization complications
		if (x%2==0) {
		evenMax=x;
		evenSum += x;
		
		}
		int n;
		while(!donezo) {
			System.out.println("Enter another data point pls");
			
			n = input.nextInt();
			if(n<min) {
				min=n;
			}
			if(n>max) {
				max=n;
			}
			if(n%2==0) {
				evenSum += n;
				if(n>evenMax) {
					evenMax=n;
				}
			}
			System.out.println("u done bih? true/false");
			donezo = input.nextBoolean();
		}
		System.out.println("min: " + min + "\n max: "+ max + "\n max of the even numbers: "+ evenMax + "\n sum of the even numbers:" + evenSum);
	}
}
