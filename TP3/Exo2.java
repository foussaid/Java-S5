public class Exo2{
	public static void main(String[] args){
		var b1 = new Book("Da Java Code", "Duke Brown");
	    var b2 = b1;
	    var b3 = new Book("Da Java Code", "Duke Brown");
	    System.out.println(b1 == b2); /*true : */
	    System.out.println(b1 == b3);/*false */
	}
}


/*
======================
REPONSES AUX QUESTIONS
1-Le code affiche true et false.
  b3 est une nouvelle instance de Book, son adresse est différente de celle de b1, ce sont deux objets différents
  contrairement à b2 qui est le même que b1

2-Pour tester si deux objets ont le même contenu, on utilise la méthode equals().

6-L'anotation @Override permet d'aider à la lecture, faire la différence entre une nouvelle
  méthode et le remplacement d'une méthode existante.
*/