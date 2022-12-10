import java.lang.reflect.InvocationTargetException;

public class Main {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {


//		String pathClass = "design-patterns-reflection.Lugar"; //error
		String pathClass = "design-patterns-reflection.Pessoa";

		Controller c = new Controller(pathClass);

		System.out.println(c.objeto);

	}
}