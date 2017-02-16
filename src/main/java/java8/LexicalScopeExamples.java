package java8;

class Hello {
    public Runnable r = new Runnable() {
        public void run() {
            System.out.println(this);
            System.out.println(toString());
        }
    };

    public String toString() {
        return "Hello's custom toString()";
    }
}

public class LexicalScopeExamples {
    public static void main(String... args) {
        Hello h = new Hello();
        h.r.run();
    }
}
