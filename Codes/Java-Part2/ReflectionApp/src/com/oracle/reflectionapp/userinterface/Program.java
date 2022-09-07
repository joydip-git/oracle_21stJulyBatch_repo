package com.oracle.reflectionapp.userinterface;

/*import com.oracle.reflectionapp.entities.ISample;
import com.oracle.reflectionapp.entities.Sample;*/
import java.lang.Class;
import java.lang.reflect.*;
/*import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;*/


public class Program {

	public static void main(String[] args) {
		/*
		 * Sample sample = new Sample(); sample.setName("joydip");
		 * sample.setSalary(1000); System.out.println(sample.print());
		 */
		try {
			Class objOfClassStoringSampleInfo = Class.forName("com.oracle.reflectionapp.entities.Sample");
			// Class objOfClassStoringSampleInfo = ISample.class;
			System.out.println("Name: " + objOfClassStoringSampleInfo.getName());
			System.out.println("interface? " + objOfClassStoringSampleInfo.isInterface());
			System.out.println("Local Class? " + objOfClassStoringSampleInfo.isLocalClass());

			// Object obj = objOfClassStoringSampleInfo.newInstance();
			/*
			 * Constructor[] constructorsInfo =
			 * objOfClassStoringSampleInfo.getConstructors(); List<Constructor>
			 * constructorList = Arrays.asList(constructorsInfo); constructorList.forEach(c
			 * -> { int parameterCount = c.getParameterCount(); if(parameterCount>0) {
			 * System.out.println("parameterized ctor: "+c.getName()); List<Class>
			 * parameterTypes = Arrays.asList(c.getParameterTypes());
			 * parameterTypes.forEach(p->System.out.println(p.getName())); } });
			 */
			
			/*Class[] types = { String.class, float.class };
			Constructor parameterizedCtor = objOfClassStoringSampleInfo.getConstructor(types);
			Object[] parameters = { "Joydip", 2000 };
			Object obj = parameterizedCtor.newInstance(parameters);*/
			
			Class[] salaryParamType ={float.class};
			Class[] nameParamType ={String.class};
			Method setSalaryMethod = objOfClassStoringSampleInfo.getMethod("setSalary", salaryParamType);
			Method setNameMethod = objOfClassStoringSampleInfo.getMethod("setName", nameParamType);
			
			Object obj = objOfClassStoringSampleInfo.newInstance();
			create(obj);

			setNameMethod.invoke(obj, "Joydip");
			setSalaryMethod.invoke(obj, 2000);
			
			Method methodInfo = objOfClassStoringSampleInfo.getMethod("print", null);
			Object result = methodInfo.invoke(obj, null);
			System.out.println(result);
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException ex) {
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		/*
		 * Sample s = new Sample(); create(s);
		 */
	}

	static void create(Object obj) {
		Class c = obj.getClass();
		System.out.println(c.getName());
	}

}
