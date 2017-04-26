package javatutorial;

public class LogLevelsTest {

	public static void main(String[] args) {

		for (LogLevels level : LogLevels.values()) {
			System.out.println(level + ": " + level.getLevelCode());
		}

		// string to enum
		LogLevels level = LogLevels.valueOf("error".toUpperCase());
		if (level == LogLevels.ERROR) {
			System.out.println("call support");
		}
	}
	
}
