package com.asima;

public class HelloWorld {

	/**
	 * @param arg
	 */
	public static void main(String arg[]) {
		System.out.println("Hello");
		String prtstr="nic";
		Until until = new Until();
		String abc=until.com(prtstr);
		System.out.println("result=" + abc);
	}
}
