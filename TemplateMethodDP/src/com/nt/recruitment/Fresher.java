package com.nt.recruitment;

public abstract class Fresher {
	
	/*
	 * here the concrete methods are declared as private to stop others 
	 * seeing the process, but the abstract methods are not decalred private because it will be implemented
	 * in subclass.
	 */
	private boolean conductAptitudeTest() {
		System.out.println("Fresher::Conducting Aptitude Test");
		return true;
	}
	
	private boolean conductGDTest() {
		System.out.println("Fresher::Conducting GD Test");
		return true;
	}
	
	public abstract boolean conductTechnicalInterview();
	
	public abstract boolean conductSystemTest();

	private boolean conductHRInterview() {
		System.out.println("Fresher::conducting HR Interview");
		return true;
	}
	
	//Template Method
	public boolean fresherRecruitmentDrive() {
		boolean flag=false;
		flag=conductAptitudeTest();
		if(flag)
			flag=conductGDTest();
		if(flag)
			flag=conductTechnicalInterview();
		if(flag)
			flag=conductSystemTest();
		if(flag)
			flag=conductHRInterview();
		return flag;
	}
}
