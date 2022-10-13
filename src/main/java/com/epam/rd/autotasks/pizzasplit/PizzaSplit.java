package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner x = new Scanner(System.in);
        int numbers_of_people = x.nextInt();
        int pieces_of_pizza = x.nextInt();
        int pizzas = 1;

       if ((pieces_of_pizza % numbers_of_people != 0)) {
//            while (pieces_of_pizza % numbers_of_people != 0) {
           while (pizzas * pieces_of_pizza % numbers_of_people != 0 ) {
                pizzas++;
//           pieces_of_pizza += pieces_of_pizza ;
            }
        }
        System.out.println(pizzas);



    }
}
