package com.exercise.reflection;

public class SampleAPIImpl implements SampleAPI {

    @Override
    public void exposedMethod() {
        System.out.println("exposed method of: " + this.getClass().getSimpleName());
    }

    public void nonExposedMethod() {
        System.out.println("Non exposed method of: " + SampleAPIImpl.class.getSimpleName());
    }

    private void privateMethod() {
        System.out.println("Private method of: " + SampleAPIImpl.class.getSimpleName());
    }

}
