
public enum SingletonEnum {

	INSTANCE;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void connect() {
		System.out.println("service is running...");
	}
}
