package com.oracle.databaseapp.container;

/*import java.lang.instrument.ClassDefinition;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;

import com.oracle.databaseapp.bo.EmployeeBusinessComponent;
import com.oracle.databaseapp.bo.Abstractions.BusinessAbstractions;
import com.oracle.databaseapp.dao.EmployeeDataAccess;
import com.oracle.databaseapp.dao.Abstractions.DataAccessAbstraction;
import com.oracle.databaseapp.entities.Employee;*/

public class IocContainer {

	private static IocContainer _container;

	private IocContainer() {
		System.out.println("container created");
	}

	public static IocContainer createContainer() {
		if (_container == null) {
			_container = new IocContainer();
		}
		return _container;
	}

	/*
	 * public DataAccessAbstraction<Employee> createDaoInstance() {
	 * DataAccessAbstraction<Employee> dao = new EmployeeDataAccess(); return dao; }
	 * public BusinessAbstractions<Employee> createBusinessInstance() {
	 * BusinessAbstractions<Employee> bo = new EmployeeBusinessComponent(); return
	 * bo; }
	 */
	@SuppressWarnings("unchecked")
	public <TInterface, TClass> TInterface createInstance(Class<TInterface> interfaceType, Class<TClass> clsType)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, NoSuchMethodException,
			SecurityException {

		TInterface classObj = null;
		boolean isImplemented = false;
		Class[] interfaces = clsType.getInterfaces();
		for (Class iType : interfaces) {
			if (iType.getName() == interfaceType.getName()) {
				isImplemented = true;
				break;
			}
		}
		if (isImplemented) {
			classObj = (TInterface) clsType.newInstance();
		}

		return classObj;
	}
}
