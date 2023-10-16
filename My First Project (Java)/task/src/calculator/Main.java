package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double income = 0.0;

        System.out.println("Earned amount:");
        System.out.println("""
                Bubblegum: $202
                Toffee: $118
                Ice cream: $2250
                Milk chocolate: $1680
                Doughnut: $1075
                Pancake: $80 """);

        double Bubblegum = 202;
        double Toffee = 118;
        double IceCream = 2250;
        double MilkChocolate = 1680;
        double DoughNut = 1075;
        double PanCake = 80;


        income = Bubblegum + Toffee + IceCream + MilkChocolate + DoughNut + PanCake;
        System.out.println("Income: $"+ income);


        Scanner in = new Scanner(System.in);
        System.out.println("Staff expenses:");
        String staffExpenses = in.nextLine();
        System.out.println("Other expenses:");
        String otherExpenses = in.nextLine();

        double netIncome = income    - (Integer.parseInt(staffExpenses) + Integer.parseInt(otherExpenses));
        System.out.println("Net income: $"+ netIncome);

    }
}