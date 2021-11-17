
public class Morse{
	public static void main(String Args[]){
		/*Concaténation de chaînes avec + */
		/*for(var i = 0; i < Args.length; i++){
			System.out.print(Args[i] + " Stop. ");
		}*/
		StringBuilder builder = new StringBuilder(" Stop. ");
		System.out.print(Args[0]);
		for(var i = 1; i < Args.length; i++){
			builder.append(Args[i]);
			System.out.print(builder);
		}
	}
}

/*
======================
REPONSES AUX QUESTIONS
======================
Rq : concaténer des chaînes de caractères avec des + dans une boucle prend bcp de temps.(nbrx string tprr sont produits)
2-La classe java. lang. StringBuilder permet de concaténer des chaînes de caractères de manière optimisée.
   (Limite les allocations mémoires et les recopies de chaînes)
  La méthode append(String) renvoie un objet de type StringBuilder car elle renvoie directement le StringBuilder. 
3-L'avantage est : 
*/