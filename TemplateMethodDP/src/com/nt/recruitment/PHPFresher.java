package com.nt.recruitment;

public class PHPFresher extends Fresher{

	/*
	 * here the methods couldnot be taken as private as per overriding rules
	 * implementing methods should be higher type modifier
	 */
	
	@Override
	public boolean conductTechnicalInterview() {
		System.out.println("PHPFresher::conductTechnicalInterview()");
		return true;
	}
	
	@Override
	public boolean conductSystemTest() {
		System.out.println("PHPFresher::conductSystemTest()");
		return true;
	}
}
