package org.example;

import java.lang.reflect.Method;
import java.util.Set;

public class DocumentationProcessor {
    public static void main(String[] args) {
        // Scan the codebase for classes and methods with annotations
        var reflections = new org.reflections.Reflections("com.example");
        Set<Class<?>> classes = reflections.getTypesAnnotatedWith(ClassDocumentation.class);
        Set<Method> methods = reflections.getMethodsAnnotatedWith(MethodDocumentation.class);

        // Process the annotated classes
        System.out.println("Annotated classes:");
        for (Class<?> clazz : classes) {
            System.out.println("Class: " + clazz.getName());
        }

        // Process the annotated methods
        System.out.println("\nAnnotated methods:");
        for (Method method : methods) {
            System.out.println("Method: " + method.getName() + " in class: " + method.getDeclaringClass().getName());
        }
    }
}
