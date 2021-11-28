package fr.uml.data;

import java.util.Objects;

/*
 * EXERCICE 1
 record Link(int valeur, Link next) { //visibilité : package
	public Link{
		Objects.requireNonNull("maillon ne doit pas être null");
	}
	public static void main(String[] args) {
		Link a, b;
		a = new Link(13, null);
		b = new Link(144, a);
	}
}*/

/*EXERCICE 02*/

record Link(Object valeur, Link next) { //visibilité : package
	public Link{
		Objects.requireNonNull("maillon ne doit pas être null");
	}
	public static void main(String[] args) {
		Link a, b;
		a = new Link(13, null);
		b = new Link(144, a);
	}
}


/*REPONSES AUX QUESTIONS
 * 
 * EXERCICE 1 : 
 * 
 *		1. La visibilité du record doit être package
 *		
 *		2. Pour exécuter le main du record Link, on utilise la méthode : *.java -d bin
 *
 *		3. 
 * EXERCICE 2 :
 * 
 * 		1. Si l'indice n'est pas valide : on renvoie une exeption IAE
 * 
 * 		2. 
 * 
 * 		4. On ajoute un cast dans la méthode main car : la méthode length() n'est pas défini sur les variables de type Object
 * 		   On n'aime pas les casts en java, car : 
 * 
 * 
 *  EXERCICE 3 :
 *  
 *  		1. L'intér^t d'utiliser un type paramétrer est de pouvoir mettre dans la liste chaînée n'importe quel type d'éléments
 *  		
 *  		4. La méthode contains prend Object en paramètre et pas un E ou un T, car on a pas appliqué la généricité sur Link et LinkedLink dans ce package.
 * */
