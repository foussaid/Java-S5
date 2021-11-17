public class Exo1{
	public static void main(String Args[]){
		var s4 = "toto";
		var s5 = new String(s4); /*Création d'une nvlle chaîne de caractère. Les sting c'est comme une classe !*/
        System.out.println(s4.equals(s5));
        var s6 = "toto";
        var s7 = "toto";
        System.out.println(s6 == s7);
        var s8 = "hello";
        s8.toUpperCase();/*convertit une chaîne en lettres majuscules.*/
        System.out.println(s8);
	}
}

/*
======================
REPONSES AUX QUESTIONS
======================
1-Le type de 's' est un caractère. 

2-Le code affiche true et false
  Explication : 
               System.out.println(s1 == s2); affiche true parce que s1 et s2 ont la même adresse dans la mémoire.
               System.out.println(s1 == s3); affiche false parce que s1 et s3 ont deux adresses différentes

3-Pour tester si le contenu des chaînes de caractères est le même, on utilise la méthode equals() qui renvoie un booléen

4-Le code affiche true parce que les deux chaînes s6 et s7 ont la même adresse en mémoire. 

5-Il est important que java.lang.String ne soit pas mutable parce que : 

6-Le code affiche seulement "hello world", parce qu'on a demandé s'afficher s8. 
  Si on veut afficher S8 en majuscule, soit on fait : 
  s8 = s8.toUpperCase();
  quand on l'affiche, on aura s8 mais en majuscule. 
  Sinon, on peut directement : System.out.println(s8.toUpperCase()); 
*/
