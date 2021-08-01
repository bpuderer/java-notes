package javatutorial;

public enum EnumLogLevel {
	CRITICAL(50), ERROR(40), WARNING(30), INFO(20), DEBUG(10), NOTSET(0);

	private final int code;
	
	private EnumLogLevel(int code) {
		this.code = code;
	}
	
	 public int code() {
		return this.code;
	}
}
