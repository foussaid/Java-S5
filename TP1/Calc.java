import java.util.Scanner;

public class Calc{
	public static void main(String[] args){
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		System.out.print("Veuillez entrer la première valeur : ");
		int value1 = scanner1.nextInt();
		System.out.print("Veuillez entrer la deuxième valeur : ");
		int value2 = scanner2.nextInt();
		System.out.println("Vous avez entré : " + value1);
		System.out.println("Leur somme : " + (value1 + value2));
		System.out.println("La différence entre les deux : " + (value1 - value2));
		System.out.println("Leur produit : " + (value1 * value2));
		System.out.println("Leur division donne : " + (value1 / value2) + " et le reste de la division est : " + (value1 % value2));
	}
}

/*
======================
REPONSES AUX QUESTIONS
======================
-Les variables sont : 
    •scanner : qui est de type Scanner
    •value : de type int 

-nextIn() n'est pas une fonction car on ne peut pas l'appliquer librement dans un programme, 
il faut toujours l'appliquer à une variable. C'est une méthode.

-Scanner est une classe qui ne fait pas partie du package java.lang(ensemble des classes automatiquement
importées par java), en effet elle se retrouve dans le package java.util. Pour l'utiliser, il faut l'importer 
avec l'instruction import.*/
