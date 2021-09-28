package com.shiva.programs.masterclass.chapter3;

import java.util.Scanner;

/**
 * @author : Shivakumar Desai
 * @project : JavaPractices
 * @created : 2021-09-16 10:19
 **/


public class OperatorPrecendence {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please Enter Name ");
       String inputParam = scanner.nextLine();
       System.out.println("inputParam = "+inputParam);
       scanner.close();
       System.out.println("Operator Precedence Challenge");
       double variableOne = 20.00d;
       double variableTwo = 80.00d;
       double variableThree =((variableOne+variableTwo)*100.00d);
       System.out.println("variableThree is "+variableThree);
       double variableFour = variableThree%40.00d;
       System.out.println("variableFour is "+variableFour);
       boolean isZero = (variableFour==0) ? true : false;
       System.out.println("isZero is "+isZero);
       if(!isZero) {
           System.out.println("Got Some reminder");
       }
   }

}
