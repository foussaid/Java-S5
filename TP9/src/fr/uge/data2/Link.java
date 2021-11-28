package fr.uge.data2;

import java.util.Objects;


record Link<E>(E valeur, Link<E> next) { //visibilité : package
	public Link{
		Objects.requireNonNull("maillon ne doit pas être null");
	}
	public static void main(String[] args) {
		Link<Integer> a;
		Link<Integer> b;
		a = new Link<Integer>(13, null);
		b = new Link<Integer>(144, a);
	}
}