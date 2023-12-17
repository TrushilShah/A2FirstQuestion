ppackage org.example;

@ClassDocumentation
public class SampleClass {

    @MethodDocumentation
    public void annotatedMethod() {
        System.out.println("Executing annotatedMethod");

        // Sample business logic for annotatedMethod
        int result = performCalculation(5, 10);
        System.out.println("Result of calculation: " + result);
    }

    public void nonAnnotatedMethod() {
        System.out.println("Executing nonAnnotatedMethod");

        // Sample business logic for nonAnnotatedMethod
        String greeting = createGreeting("John");
        System.out.println("Greeting: " + greeting);
    }

    private int performCalculation(int a, int b) {
        // Some calculation logic
        return a + b;
    }

    private String createGreeting(String name) {
        // Some greeting creation logic
        return "Hello, " + name + "!";
    }
}

