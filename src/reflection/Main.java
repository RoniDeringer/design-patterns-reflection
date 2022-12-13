package reflection;
public class Main {
	public static void main(String[] args) throws Exception {

		String className= "/pessoa";
//		String className= "/teste"; //Class: TesteController not found!

		
		InstanceClass i = new InstanceClass();
		
		System.out.println(i.instance(className));
	}
}