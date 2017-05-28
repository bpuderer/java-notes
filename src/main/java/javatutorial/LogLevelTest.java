package javatutorial;

public class LogLevelTest {

	public static void main(String[] args) {

		for (LogLevel level : LogLevel.values()) {
			System.out.println(level + ": " + level.code());
		}

		// string to enum
		LogLevel level = LogLevel.valueOf("error".toUpperCase());
		System.out.println(level);
		if (level == LogLevel.ERROR) {
			System.out.println("call support");
		}

	}
}
