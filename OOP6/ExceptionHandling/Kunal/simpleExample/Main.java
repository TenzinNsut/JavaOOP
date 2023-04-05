package com.OOP6.ExceptionHandling.Kunal.simpleExample;
//E C E P T I O N - H A N D L I N G

class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {divide(a,b);}
//      NOTE: add more restricted exception first.
        catch (ArithmeticException e){System.out.println(e.getMessage());}
//      catch (Exception e){System.out.println(e.getMessage());}
        finally {System.out.println("Finally: will be called no matter what.");}

//        OR

//        try {
//            int divide = a/b;
//        }catch (Exception ex){
//            System.out.println(ex.getMessage()); // "/ by zero"
//        }finally {
//            System.out.println("Will run no matter what");
//        }
    }

    static void divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please assign any value greater than 0");
        }
    }
}
