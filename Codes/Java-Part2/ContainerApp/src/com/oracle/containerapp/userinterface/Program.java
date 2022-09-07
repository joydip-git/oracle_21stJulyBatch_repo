package com.oracle.containerapp.userinterface;

import com.oracle.containerapp.container.Factory;

public class Program {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, NoSuchMethodException, SecurityException {
		SampleInter obj = Factory.createInstance(SampleInter.class, Sample.class);
		obj.show();
	}
}
