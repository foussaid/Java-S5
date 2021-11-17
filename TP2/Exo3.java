import java.util.regex.*;
import java.util.Scanner;
public class Exo3{
	private static Pattern pattern;
    private static Matcher matcher;
	public static void main(String Args[]){
        pattern = Pattern.compile("([0-9]+)[a-zA-Z]*");/*Compiler l'expression régulière pour en faire un objet java*/
        /*Lecture au clavier*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un mot :");
        String str = sc.nextLine();

        matcher = pattern.matcher(str); /*Appliquer l'expression régulière*/
        if(matcher.matches()){/*matches() permet de vérifier si une chaîne de caractères correspond à l'expresion régulière*/
        	System.out.println(matcher.group(1));
        }
	}
}

/*
======================
REPONSES AUX QUESTIONS
======================

1-java.util.regex.Pattern représente un automate créé à partir d'une expression régulière
  Sa méthode compile sert à chercher la chaîne de caractères prise en paramètre
  java.util.regex.Matcher parcourt l’automate créé sur un texte. 
*/