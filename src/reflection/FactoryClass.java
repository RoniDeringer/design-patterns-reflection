package reflection;

public class FactoryClass {
	
	public Class<?> createClass(String className) throws Exception {
		
		FilterClassName filter = new FilterClassName(className);
		String classNameFormated = filter.formatStringClass();

		try {
			Class<?> classT = Class.forName("reflection." + classNameFormated);
			return classT;
		} catch (Exception e) {
			throw new Exception("Class: " + classNameFormated + " not found!");
		}
	}

}
