public class PrintArgs{
	public static void main(String[] args){
		System.out.println(args[0]); /*Affichage su premier argument*/

		/*affichage de tous les arguments avec 

		for(int i = 0; i < args.length; i++){
			System.out.println(args[i]);

		}*/

			/*Utilisation de la syntaxe for each*/

			for( String value : args ) {
                System.out.println( value );
        }
	}
}
/*
======================
REPONSES AUX QUESTIONS
======================

-Si on ne met pas d'arguments à l'exécution, on obtient le message suivant : 
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
	at PrintArgs.main(PrintArgs.java:3)

-for each permet de parcourir des tableaux et les manipuler. Pas de mot clé "foreach" en java !
La syntaxe est : for(variable : montableau){opérations à faire sur le tableau};
*/
