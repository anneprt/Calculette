package fr.abp.cours;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        char operateur;
        double calcul = 0;
        boolean OK = true;

        Scanner lectureClavier = new Scanner(System.in);

        System.out.println("Entrer la première valeur:");
        a = lectureClavier.nextInt();
        System.out.println("Entrer la seconde valeur:");
        b = lectureClavier.nextInt();
        System.out.println("Type de l'opération (+,-,/,*)");
        operateur = lectureClavier.next().charAt(0);


        switch (operateur) {
            case '+':
                calcul = a + b;
                break;
            case '-':
                calcul = a - b;
                break;
            case '/':
                if (b != 0) {
                    calcul = a / b;
                } else {
                    OK = false;
                }
                break;
            case '*':
                calcul = a * b;
                break;
            default:
                break;
        }
        if (OK) {
            System.out.println("Cette opération a pour résultat: " + a + operateur + b + "=" + calcul);
        } else {
            System.out.println("Opération non conforme !");
        }
    }

}



