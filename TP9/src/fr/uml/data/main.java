package fr.uml.data;

public class main {
	public static void main(String[] args) {
		//Exercice 1
		LinkedLink listeChainee = new LinkedLink();
		Link elem1 = new Link(1, null);
		Link elem2 = new Link(3, elem1);
		listeChainee.add(elem1.valeur());
		listeChainee.add(elem2.valeur());
		System.out.println(listeChainee); //3->1->
		System.out.println(listeChainee.get(1));//1
		
		//Exercice 2
		LinkedLink str = new LinkedLink();
		str.add("TP9");
		str.add("java");
		System.out.println(((String)str.get(1)).length());
		
		//Exercice 3 : 
		System.out.println(str.contains("TP9"));
		System.out.println(str.contains(1));
	}
}
