package fr.uge.data2;

import java.util.Objects;


public class LinkedLink<E> {
	private Link<E> Liste; //ma liste chaînée : ne pas la définir sous la structure d'une liste !!
	private int size;
	
	public void add(E value) {
		Objects.requireNonNull(value);
		Liste = new Link<E>(value, Liste);
		size++;
	}
	
	@Override
	public String toString() {
		Link<E> premier = Liste;
		String s = premier.valeur() + "->";
		while(premier.next() != null) {
			premier = premier.next();
			s += premier.valeur() + "->";
			
		}
		return s;
	}
	public E get(int index){
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		else {
			int i;
			Link<E> premier = Liste;
			for(i = 0; i < index; i++) {
				premier = premier.next();
			}
			return premier.valeur();
		}
	}
}
