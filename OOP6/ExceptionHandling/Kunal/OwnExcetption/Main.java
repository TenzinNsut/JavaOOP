package com.OOP6.ExceptionHandling.Kunal.OwnExcetption;

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        try{
            checkName(name);
        }catch (NameException e){
            System.out.println(e.getMessage());//Name must != Tenzin
        }finally {
            System.out.println("Finally: will be called no matter what."); //Finally: will be called no matter what.
        }
    }

    static String checkName(String name) throws NameException{
        if(name.equals("Tenzin")){
            throw new NameException("Name must != Tenzin");
        }
        return name;
    }

}
