package java8;


public class EffectivelyFinalExample {
    public static void main(String[] args) {
        String  name = "Yagiz"; //Compile error in Java 7...
        final String  nameForJava7 = "New Name"; //Successfully compile in Java 7...
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Name is " + name);
            }
        };

        runnable.run();
    }
}

