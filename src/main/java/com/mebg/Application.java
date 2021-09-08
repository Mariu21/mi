package com.mebg;

public class Application {

    public static void main (String[] args){

        System.out.println("Hola que tal estás");

        Operations calculadora =new Operations();

        int result1 = calculadora.add(10,3);
        System.out.println("El resultado es" + result1);

        int result2 = calculadora.rest(10,3);
        System.out.println("El resultado es" + result2);

        int result3 = calculadora.multiply(10,3);
        System.out.println("El resultado es" + result3);

        int result4 = calculadora.divide(10,3);
        System.out.println("El resultado es" + result4);



    }


}
