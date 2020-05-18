package com.nt.test;

import com.nt.factory.FresherFactory;
import com.nt.recruitment.Fresher;

public class Company1 {

	public static void main(String[] args) {
		
		Fresher fresher=null;
		boolean flag=false;
		
		fresher=FresherFactory.getInstance("php");
		flag=fresher.fresherRecruitmentDrive();
		
        if(flag)
        	System.out.println("fresher recruited");
        else
        	System.out.println("fresher failed in recuitment");
	}

}
