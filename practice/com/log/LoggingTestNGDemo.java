package log;
import org.apache.log4j.Logger;

public class LoggingTestNGDemo {
	
/**
 * 
 * @author PrashantJaydeep Logging and TestNG
 * @see log4j and TestNG
 * 
 */
	
 static Logger log=Logger.getLogger(LoggingTestNGDemo.class);
	
 	private static String userName="abc";
 	private static String userPass="abc123";
 	
 	private int testid;
	private String testName;
	private String Result;
	
	public static boolean checkLogin(String uname,String pass)
	{
		if(LoggingTestNGDemo.userName==uname && LoggingTestNGDemo.userPass==pass)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public void showTest()
	{
		System.out.println("Test ID:"+this.testid);
		System.out.println("Test ID:"+this.testName);
		System.out.println("Test ID:"+this.Result);
	
	}
	public static boolean calculate(int a,int b)
	{
		System.out.println("Addition ="+a+b);
		return true;
		
	}
	
	public  boolean findTest(int id)
	{
		if(this.testid==id)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
}
