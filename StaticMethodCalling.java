package Basics;

public class StaticMethodCalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Java entered into main method");
System.out.println(addOftwoNumbers(10,2.5));
StaticMethodCalling obj1=new StaticMethodCalling(); 
double result=obj1.multiplicationOftwoNumbers(10,2.5);
String totalResult=result+"----------->"+result;
System.out.println(totalResult);
System.out.println("Jvm exit from main method");
	}
public static String addOftwoNumbers(int numberOne,double numberTwo)
{
	double result=numberOne+numberTwo;
	return "The sum of "+ numberOne +" and "+ numberTwo +" is "+result;
}
public double multiplicationOftwoNumbers(int numberOne,double numberTwo)
{
	double result=numberOne*numberTwo;
	return result;
}
	}
