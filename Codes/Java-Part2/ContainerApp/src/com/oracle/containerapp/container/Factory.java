package com.oracle.containerapp.container;

public class Factory {
	@SuppressWarnings("unchecked")
	public static <TInterface, TClass> TInterface createInstance(Class<TInterface> interfaceType, Class<TClass> clsType)
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
