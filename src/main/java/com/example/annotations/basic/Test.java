package com.example.annotations.basic;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@MyAnno(str="test",val = 0)
public class Test {

    @MyAnno(str = "Hello",val = 1)
    public static void myMeth(){
        Test test = new Test();

        try{

             // this for just annotation seeing purpose
//            Annotation[] annotations = test.getClass().getAnnotations();
//            for(Annotation annotation : annotations){
//                System.out.println(annotation.toString());
//            }
            // First, get a Class object that represents this class
            Class <?> c = test.getClass();

            //Now Get the method that represents this method
            Method method = c.getMethod("myMeth");

            //Get the annotation for this class
            MyAnno myAnno = method.getAnnotation(MyAnno.class);
            System.out.println(myAnno.str() + " " + myAnno.val());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        myMeth();
    }
}
