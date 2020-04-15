package fr.abp.cours;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i;
        int nombreLu = -1;
        int boucle = 0;
        i = (int) (10 * Math.random());
        Scanner lectureClavier = new Scanner(System.in);
        System.out.println("J'ai tiré un entier au hasard entre 0 et 10, devinez lequel !");

        while (nombreLu != i) {
            System.out.print("Votre choix : ");
            nombreLu = lectureClavier.nextInt();
            boucle = boucle + 1;
        }
        System.out.print("Trouvé ! ");
        System.out.println("vous avez reussi en " + boucle + " fois");
    }
}
