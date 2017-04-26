package javatutorial;

public enum LogLevels {
	CRITICAL(50), ERROR(40), WARNING(30), INFO(20), DEBUG(10), NOTSET(0);

	private final int levelCode;
	
	LogLevels(int val) {
		this.levelCode = val;
	}
	
	int getLevelCode() {
		return this.levelCode;
	}
	
}
