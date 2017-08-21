package practice;

import log.LoggingTestNGDemo;

public class Temp {

	public static void main(String[] args) {
		try {
			String s = "asd";
			int i = Integer.parseInt(s);
			int x = Integer.valueOf(s);
			System.out.println(i + "   " + x);
		}
		  catch(Exception e) { 
			  System.out.println(e.toString());
			  }
		 
		finally {

			System.out.println("xxxxxxxxxxxxx");
		}
		LoggingTestNGDemo lt=new LoggingTestNGDemo();
		
	}

}
