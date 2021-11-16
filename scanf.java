import java.util.Scanner; 
/*La classe Scanner se trouve dans le package java.util
elle n'est pas automatique à importer comme les classes qui sont dans le package java.lang
Pour importer toutes les classes de java.util, on écrit java.util.* */

public class scanf{
	public static void main(String[] args){
		Scanner msg = new Scanner(System.in); /*déclaration de la variable qui sauvegardera le message à entrer */
		System.out.print("Veuillez saisir un mot : ");
		/*Pour récupérer une chaîne de caractères*/
		String str = msg.nextLine(); /*Grâce à nextLine() on fait entrer un str*/
		System.out.println("Vous avez saisi : " + str); /*Affichage final*/

		Scanner message = new Scanner(System.in);
		System.out.print("Entrez qqch : ");
		String ms = message.nextLine();
		System.out.println("Vous avez inséré : " + ms);


		/*Insérer un entier*/
		Scanner entier = new Scanner(System.in);
		System.out.print("Veuillez saisir un entier : ");
		int i = entier.nextInt(); /*Grâce à nextInt(), on fait entrer un int*/
		System.out.println("Vous avez saisi : " + i); /*Affichage final*/
	}
}