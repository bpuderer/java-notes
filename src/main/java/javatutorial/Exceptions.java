package javatutorial;

import java.io.IOException;
import java.util.Random;

public class Exceptions {

    public static void main(String[] args) {

        // also see try-with-resources.  Resources are declared in try and closed when leaving try/catch.
        // Resources must implement Autocloseable or Closable interfaces
        // Like Python's context management protocol

        try {
            throwException();
        }
        catch (UnsupportedOperationException | IOException e) {
            System.out.println("Caught either UnsupportedOperationException or IOException!");
            e.printStackTrace();
        }
        catch (Exception e){
            System.out.println("Caught unexpected exception");
        }
        finally {
            System.out.println("Finally clauses **always** execute regardless if exception thrown");
        }
    }

    public static void throwException() throws UnsupportedOperationException, IOException {
        Random random = new Random();
        if (random.nextBoolean()) throw new UnsupportedOperationException();
        throw new IOException("Thrown by luck");
    }

}
