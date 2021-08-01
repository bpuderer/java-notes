package javatutorial;

public class EnumLogLevelTest {

	public static void main(String[] args) {

		System.out.println(EnumLogLevel.WARNING.ordinal());

		for (EnumLogLevel level : EnumLogLevel.values()) {
			System.out.println(level + ": " + level.code());
		}

		// string to enum
		EnumLogLevel level = EnumLogLevel.valueOf("error".toUpperCase());
		System.out.println(level);
		if (level == EnumLogLevel.ERROR) {
			System.out.println("call support");
		}

	}
}
