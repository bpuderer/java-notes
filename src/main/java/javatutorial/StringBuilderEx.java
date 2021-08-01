package javatutorial;

public class StringBuilderEx {

    public static void main(String[] args) {

        // MUTABLE
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StringBuilder.html
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        System.out.format("%s length:%d capacity:%d%n", sb, sb.length(), sb.capacity());
        sb.append(" world good to see you");
        System.out.format("%s length:%d capacity:%d%n", sb, sb.length(), sb.capacity());
        sb.insert(sb.indexOf("world"), "awesome ");
        System.out.println(sb);

        int awesomeLocation = sb.indexOf("awesome");
        sb.replace(awesomeLocation, awesomeLocation+"awesome".length(), "amazing");
        System.out.println(sb);

        sb.delete(sb.indexOf(" good"), sb.length());
        System.out.println(sb);

        System.out.println(addSpaces("HelloMeIt'sMeAgain"));
    }


    /**
     * Add space before capitalized letter except first
     * @param text jumbled text
     * @return corrected text
     */
    public static StringBuilder addSpaces(String text) {
        StringBuilder sb = new StringBuilder();

        for (var i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i)) && i != 0) {
                sb.append(" ");
            }
            sb.append(text.charAt(i));
        }

        return sb;
    }

}
