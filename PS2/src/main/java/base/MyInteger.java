package base;

public class MyInteger {
	private int iValue;

	public MyInteger() {
		
	}
	
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	//////////////////////////////////////////// real methods below here
	
	public boolean isEven() {
		if (iValue%2 == 0)
			return true;
		else
			return false;
	}
	
	public boolean isOdd() {
		return !isEven();
	}
	
	public boolean isPrime() {
		   switch (iValue) {
		   case 0: case 1: case 9: // deals with odd non-primes before 15
				return false;
			case 2: case 3: case 5: case 7: case 11: case 13:
				return true; // deals with primes before 15
			default:
				if (iValue%2 == 0) // gets rid of all even cases
					return false;
				else
					for (int a = 3; a <= (iValue/5.0); a=a+2) {
						//finds factors "a" for iValue
						//"a" is 3 to iValue/5 to avoid retests for factors 4, 3, and 2.
						if (iValue%a == 0)
							return false;
					}
				return true; // any iValue that reaches here must be prime
		   }
	}

	public static boolean isEven(int iValue) {
		MyInteger instance = new MyInteger(iValue);
		return instance.isEven(); //uses isEven()
	}
	
	public static boolean isOdd(int iValue) {
		return !isEven(iValue);
	}
	
	public static boolean isPrime(int iValue) {
		MyInteger instance = new MyInteger(iValue);
		return instance.isPrime(); //uses isPrime()
	}
	
	public static boolean isEven(MyInteger myIntegerInstance)  {
		return isEven(myIntegerInstance.getiValue());
		// uses isEven() through isEven(int)
	}
	
	public static boolean isOdd(MyInteger myIntegerInstance) {
		return !isEven(myIntegerInstance);
	}
	
	public static boolean isPrime(MyInteger myIntegerInstance) {
		return isPrime(myIntegerInstance.getiValue());
		// uses isPrime() through isPrime(int)
	}
	
	public boolean isEquals(int iValue) {
		if (this.iValue == iValue)
			return true;
		else
			return false;
	}
	
	public boolean isEquals(MyInteger myIntegerInstance) {
		return isEquals(myIntegerInstance.getiValue()); //uses isEquals(int)
	}
}
