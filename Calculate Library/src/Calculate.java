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
//string(letter variable) must be entered with its own set of round brackets and quotes in method entered
	public static String foil(int a, int b, int c, int d, String variable) {
//(ax+b)(cx+d)=acx^2+adx+bcx+bd
		return (a*b+variable+"^2" )+"+"+((a*d)+(b*c)+variable)+"+"+(b*d);
	}
	public static String toMixedNum(int numerator, int denominator) {
		return numerator/denominator+"_"+numerator%denominator+"/" + denominator;
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
// 10 sep 2017
	public static double exponent (double base, int exponent) {
		double result=1; 
			for (int n=1; n<=exponent; n++) {
				result  *= base;		
			}
			return result; 
	}
	public static int factorial (int x) {
		int result = x;
		for (int i = 1; i < x; i++) {
			result *= x - i;
		}
		return result;
	}

//think of as a set of filters
//eliminate obvious numbers first such as even numbers 
	public static boolean isPrime(int x) {
		if(x < 2) {
			return false;
		} else if(x == 2) {
			return true;
		} else if(isDivisibleBy(x,2)) {
			return false;
		} else {
			for(int i = 3; i < x; i++) {
				if(x % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
	public static int gcf(int x, int y) {
		int i
		for((i=1, x%i==0 ,i++) && (i=1)
	}
}