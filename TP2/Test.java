/*Question 4 exercice 2*/

public class Test{
    public static void main(String[] Args) {
         var first = args[0];
         var second = args[1];
         var last = args[2];
         System.out.println(first + ' ' + second + ' ' + last);
    }
} 
/*
======================
REPONSES AUX QUESTIONS
======================
4-On peut utiliser ' ' à la place de " " parce que une espace représente un caractère, 
  et les caractères on peut les mettre entre ''.
  On peut déduire que si on met plusieur '+' sur une seule ligne, java ne fait qu'une seule allocation.

5-On doit utiliser StringBuilder.append() plutôt que le '+' dnas les boucles, 
  ou lorsqu'on fait des concaténations sur plusieurs lignes.

  Si j'écris un '+' dans un appel à la méthode alors on ajoute une allocation dans le append
*/
    