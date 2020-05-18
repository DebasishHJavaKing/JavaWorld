package com.nt.factory;

import com.nt.recruitment.DotNetFresher;
import com.nt.recruitment.Fresher;
import com.nt.recruitment.JavaFresher;
import com.nt.recruitment.PHPFresher;

public class FresherFactory {

	public static Fresher getInstance(String fresherType) {
		Fresher fresher=null;
		
		if(fresherType.equalsIgnoreCase("java"))
			fresher=new JavaFresher();
		else if(fresherType.equalsIgnoreCase("dotNet"))
			fresher=new DotNetFresher();
		else if(fresherType.equalsIgnoreCase("PHP"))
			fresher=new PHPFresher();
		else
			throw new IllegalArgumentException("Invalid Fresher type");
		
		return fresher;
	}
}
