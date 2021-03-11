package com.exercise.reflection;

public class Main {

    public static SampleAPI getSampleAPI(){
        return new SampleAPIImpl();
    }

    public static void main(String[] args) {

        SampleAPI sampleAPI = getSampleAPI();

        sampleAPI.exposedMethod();;

        // write your code here

        // 1.) Call "nonExposedMethod" of SampleAPIImpl


        // 2.) Call "privateMethod" of SampleAPIImpl


    }

}
