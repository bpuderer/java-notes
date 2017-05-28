package javatutorial;

public enum LogLevel {
	CRITICAL(50), ERROR(40), WARNING(30), INFO(20), DEBUG(10), NOTSET(0);

	private final int code;
	
	LogLevel(int val) {
		this.code = val;
	}
	
	int code() { return code; }
}
