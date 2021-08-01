package javatutorial;

public class RegEx {

    public static void main(String[] args) {

        // does string match regex, yes/no
        String re = "007[0-9]{7}";
        System.out.println("0078956230".matches(re));
        System.out.println("00789562".matches(re));

        String timeOfDay = "([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]";
        System.out.println("23:05:06".matches(timeOfDay));

        String dayOfWeek = "mon|tue|wed|thu|fri|sat|sun";
        System.out.println("Wed".matches(dayOfWeek));

        //TODO: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/regex/Pattern.html

    }

}
