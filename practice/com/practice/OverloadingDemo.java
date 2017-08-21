package practice;

/**
 * Demo program on scenario on Method overloading
 * @author PrashantChitte
 *@see static polymorphism
 *
 */
public class OverloadingDemo {

	public void calculate(Integer a,float b)
	{
		System.out.println("calculate(int a,float b)");
	}
	/*public void calculate(Integer a,Float b)
	{
		System.out.println("calculate(Integer a,Float b)");
	}*/
	public void calculate(int a,Float b)
	{
		System.out.println("calculate(int a,Float b)");
	}
	public void calculate(Long a,Float b)
	{
		System.out.println("calculate(Long a,Float b)");
	}
	public void calculate(long a,float b)
	{
		System.out.println("calculate(long a,float b)");
	}
	
	public static void main(String[] args) {
		OverloadingDemo o=new OverloadingDemo();
		o.calculate(10l, 2f);
	}

}
