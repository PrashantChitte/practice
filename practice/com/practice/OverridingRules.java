package practice;

import java.io.InterruptedIOException;

class parent{
	public void cal()throws Exception{
		System.out.println("parent method");
	}
}
public class OverridingRules extends parent{

	public void cal()throws RuntimeException{
		System.out.println("child method");
	}
	
	
	public static void main(String[] args) {

		OverridingRules o=new OverridingRules();
		
	}

	//IndexOutOfBoundsException
	//StringIndexOutOfBoundsException
	
}
