package com.example.oop.basic.error;


public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try{
            System.out.println(divide(a,b));
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("this is finally block");
        }

    }

    static int divide(int a,int b) throws CustomException {
        if(b==0){
            throw new CustomException("can not divide by pls give another number");
        }

        return a/b;
    }
}
