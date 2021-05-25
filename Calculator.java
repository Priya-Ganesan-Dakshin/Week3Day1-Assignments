package week3day1;

public class Calculator {
public void add(int num1, int num2) {
	System.out.println("The Addition of 2 num is" + " " + (num1+num2));
	
}
public void add(int num1, int num2, int num3) {
	System.out.println("The Addition of 3 num is" + " " + (num1+num2+num3));
}
	
public void multiply(int num1, int num2)
		{
			System.out.println("The Product of 2 num is" + " " + (num1*num2));
			
			
		}
		public void multiply(int num1, double num2) {
			System.out.println("The Product of 2 num is" + " " + (num1*num2));
		}
		public void Subtract(int num1, int num2)
		{
			System.out.println("The subtraction of 2 num is" + " " + (num1-num2));
			
			
		}
		public void Subtract(double num1, double num2) {
			System.out.println("The subtraction of 2 num is" + " " + (num1-num2));
		}
		public void divide(int num1, int num2)
		{
			System.out.println("The subtraction of 2 num is" + " " + (num1/num2));
			
			
		}
		public void divide(double num1, int num2) {
			System.out.println("The subtraction of 2 num is" + " " + (num1/num2));
		}
		public static void main(String[] args) {
			Calculator func = new Calculator();
			func.add(1,1);
			func.add(1,1,2);
			func.multiply(2, 3);
			func.multiply(6, 2.3);
			func.Subtract(2.5, 2.1);
			func.Subtract(2, 4);
			func.divide(1.1, 5);
			func.divide(2.2, 3);
			
			
			
		}
	}

