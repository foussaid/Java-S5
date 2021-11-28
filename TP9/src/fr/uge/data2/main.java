package fr.uge.data2;

public class main {
	public static void main(String[] args) {
		LinkedLink<String> str = new LinkedLink<String>();
		Link<String> str1 = new Link<String>("TP9", null);
		Link<String> str2 = new Link<String>("java", str1);
		str.add("Hello");
		str.add(str2.valeur());
		System.out.println(str.get(0).length());
	}
}
