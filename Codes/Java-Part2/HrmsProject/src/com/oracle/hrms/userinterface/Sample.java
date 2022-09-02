package com.oracle.hrms.userinterface;
//public final class Program {
public class Sample extends A{

	final int a;

	public Sample() {
		a = 100;
		System.out.println(a);
	}

	public Sample(int a) {
		this();
		// this.a = a;
	}

	//public void foo() {
	@Override()
	 public final void foo() {	
		System.out.println(a);
	}

	/**
	 * @param args
	 */
	public void Main() {
		// TODO Auto-generated method stub
		// Employee emp = new Employee();
		final int x = 10;
		// x=20;
		System.out.println(x);
		Sample p = new Sample(120);
		p.foo();
		// p.a=200;
	}
}


