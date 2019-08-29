package com.company;

public class ExceptionHandlingEx {
    public static void main(String[] args) {
        try{
            int a =1/0;
            System.out.println(a);

        }catch (Exception e){
            System.out.println(e);


       // }catch (ArithmeticException r){
       //    System.out.println(r);

        }
    }
}
