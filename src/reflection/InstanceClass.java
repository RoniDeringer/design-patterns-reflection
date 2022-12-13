package reflection;
import java.lang.reflect.Constructor;

public class InstanceClass {
	
	public Object instance(String stringClass) throws Exception {

		FactoryClass factory = new FactoryClass();
		Class<?> classT = factory.createClass(stringClass);
		
		try {
			Constructor<?> constT = classT.getDeclaredConstructor();
			Object obj = constT.newInstance();
			return obj;

		} catch (Exception e) {
			throw new Exception("Erro ao instanciar a classe!");
		}
	}
}
