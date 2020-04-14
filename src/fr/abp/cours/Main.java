package fr.abp.cours;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        char operateur;
        double calcul = 0;

        Scanner lectureClavier = new Scanner(System.in);

        System.out.println("Entrer la première valeur:");
        a = lectureClavier.nextInt();

        System.out.println("Entrer la seconde valeur:");
        b = lectureClavier.nextInt();

        System.out.println("Type de l'opération (+,-,/,*)");
        operateur = lectureClavier.next().charAt(0);

    }
}
