package com.demo.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Reflection1 {

    public static void main(String[] args) {

        Class<Test> testClass = Test.class;

        // get all public constructors
        Constructor[] testClassPublicConstructors = testClass.getConstructors();
        System.out.println("Test Class Public Constructors:");
        System.out.println(Arrays.toString(testClassPublicConstructors));

        // get all constructors including private constructors
        Constructor[] testClassConstructors = testClass.getDeclaredConstructors();
        System.out.println("List of all constructors available in Test class");
        System.out.println(Arrays.toString(testClassConstructors));

        // get specific constructor
        try {
            Constructor<Test> testClassDeclaredConstructor = testClass.getDeclaredConstructor(String.class, String.class);

            // make it accessible as it is private, otherwise IllegalAccessException will be thrown
            testClassDeclaredConstructor.setAccessible(true);

            // pass the correct arguments, otherwise IllegalArgumentException will be throws
            Test instanceFromPrivateConstructor = testClassDeclaredConstructor.newInstance("privateString", "publicString");
            System.out.println("publicField value: " + instanceFromPrivateConstructor.publicField);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}
