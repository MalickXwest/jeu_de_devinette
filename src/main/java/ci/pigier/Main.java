package ci.pigier;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // Générer un nombre aléatoire entre 1 et 100
                Random random = new Random();
                int randomNumber = random.nextInt(100) + 1;

        // Initialiser le scanner pour lire l'entrée utilisateur
                Scanner scanner = new Scanner(System.in);
                // Nombre maximal d'essais
                final int nombreMax_ESSAIS = 10;
                int essais = 0;
                boolean aGagne = false;

                System.out.println("Bienvenue au jeu de devinettes !");
                System.out.println("J'ai choisi un nombre entre 1 et 100. Vous avez " +nombreMax_ESSAIS + " essais pour le deviner.");

                // Créer une boucle qui demande à l'utilisateur de deviner un nombre
                while (essais< nombreMax_ESSAIS) {
                    essais++;
                    System.out.print("Essai #" + essais + " : Devinez le nombre : ");

                    //  Lire l'entrée de l'utilisateur
                    int devinette;
                    try {
                        devinette = scanner.nextInt();
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Entrée invalide. Veuillez entrer un nombre entier.");
                        scanner.next();
                        essais--;
                        continue;
                    }


                    // Comparer l'entrée au nombre aléatoire
                    if (devinette == randomNumber) {
                        aGagne = true;
                        break;
                    } else if (devinette< randomNumber) {
                        // Indiquer à l'utilisateur si le nombre deviné est supérieur ou inférieur
                        System.out.println("Trop bas ! Essayez un nombre plus grand.");
                    } else {
                        System.out.println("Trop haut ! Essayez un nombre plus petit.");
                    }
                }

                // Afficher le résultat final après la boucle
                if (aGagne) {
                    System.out.println("\nFélicitations ! Vous avez deviné le bon nombre (" + randomNumber + ") en " + essais + " essais.");
                } else {
                    System.out.println("\nDommage ! Vous avez épuisé vos " + nombreMax_ESSAIS + " essais.");
                    System.out.println("Le nombre que j'avais choisi était : " + randomNumber);
                }
                scanner.close();
            }
        }
