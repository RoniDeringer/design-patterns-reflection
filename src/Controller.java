import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Controller {

	private String pathClass;
	private String error;
	public Class<?> classT;
	public Object objeto;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getPathClass() {
		return pathClass;
	}

	public void setPathClass(String pathClass) {
		this.pathClass = pathClass;
	}

	public Controller(String pathClass) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		setPathClass(pathClass);
		this.verificationPath();
		this.instanceClassPath();
	}

	public void instanceClassPath() throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Constructor<?> constT = classT.getDeclaredConstructor();

		System.out.println(constT);

		objeto = constT.newInstance();
	}

	public void verificationPath() {
		try {
			classT = Class.forName(this.getPathClass());
		} catch (ClassNotFoundException e) {
			this.setError("File Path");
		}

	}

}