//Patrick FOng
// sep 5 2017
//calc squre of a variable
//library that will contain various mathematical methods 
public class Calculate {
	
//method takes int and returns its square
	public static int square (int x) {
		return x*x;
	}
//return cube of int
	public static int cube (int x) {
		return x*x*x;
	}
//returns avg of two doubles 
	public static double avg (double a, double b) {
		return (a+b)/2;
	}
//returns avg of three doubles
	public static double avg (double a, double b, double c) {
		return (a+b+c)/3;
	}
//converts double from radian to degrees
	public static double toDegrees(double x) {
		return (x*180)/3.14159;
	}
//converts double from degree to radians
	public static double toRadians( double x) {
		return (x*3.14159)/180; 
	}
//b^2-4ac
	public static double discriminant(double a, double b, double c) {
		return (b*b)-(4*a*c);
	}
	public static String toImproperFrac(int coefficient, int numerator, int denominator) {
		return ((coefficient*denominator)+numerator)+"/"+denominator; 
	}		
//returns string after foil
//must enter in specific order 
//string must be entered with its own set of round brackes and quotes in method entered
	public static String foil(int a, int b, int c, int d, String letter) {
//(ax+b)(cx+d)=acx^2+adx+bcx+bd
		return (a*b+letter+"^2" )+"+"+((a*d)+(b*c)+letter)+"+"+(b*d);
	}
	public static String toMixedNum(int numerator, int denominator) {
		return numerator/denominator+"_"+numerator%denominator+"/2";
	}
//sep 6 2017
	public static boolean isDivisibleBy(int dividend, int divisor) {	
		if(dividend % divisor == 0) {
			return true;
		}else{
			return false;
//LOL
		}
	
	}
	public static double absValue (double x) {
			if(x>=0) {
		return x;
			}else{
		return -x;
			}
	}
	public static double max (double x, double y) {
		if(x>y) {
			return x; 
		} else {
			return y;
		}
	}
	public static double max (double x, double y, double z) {
		if (x>y) {
			return x;
		} else if(y>z) {
			return y;
		} else { 
			return z;
		}
			
	}
	public static int min(int x, int y) {
		if(x>y) {
			return y;
		} else {
			return x;
		}
	
	}
	public static double round2 (double x) {
		if((x*1000) % 10 < 5) {
			return ((x*1000)-((x*1000)%10))/1000;
		} else {
			return ((10-((x*1000)%10))+(x*1000))/1000;
		}
		
	}
	
}
