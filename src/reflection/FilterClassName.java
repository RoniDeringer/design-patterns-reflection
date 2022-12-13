package reflection;

public class FilterClassName {
	private String className;

	public FilterClassName(String className) {
		setClassName(className);
	}

	public String formatStringClass() {
		this.removeBarra();
		this.addUpperCase();
		this.addController();

		return this.getClassName();
	}

	private void removeBarra() {
		this.setClassName(this.getClassName().replaceAll("\\/", ""));
	}

	private void addUpperCase() {
		this.setClassName(this.getClassName().substring(0, 1).toUpperCase().concat(this.getClassName().substring(1)));
	}

	private void addController() {
		this.setClassName(this.getClassName() + "Controller");
	}

	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}
