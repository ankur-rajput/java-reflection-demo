package com.demo.reflection;

public class Test {

    private String privateField;
    public String publicField;

    public Test() {

    }

    private Test(String privateField, String publicField) {
        this.privateField = privateField;
        this.publicField = publicField;
    }

    private void privateMethod() {
        System.out.println("private method called");
    }

    protected void protectedMethod() {
        System.out.println("protected method called");
    }

}
