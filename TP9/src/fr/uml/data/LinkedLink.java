package fr.uml.data;
import java.util.*;

public class LinkedLink {
	private Link Liste; //ma liste chaînée : ne pas la définir sous la structure d'une lsite !!
	private int size;
	
	public void add(Object value) {
		Objects.requireNonNull(value);
		Liste = new Link(value, Liste);
		size++;
	}
	@Override
	public String toString() {
		Link premier = Liste;
		String s = premier.valeur() + "->";
		while(premier.next() != null) {
			premier = premier.next();
			s += premier.valeur() + "->";
			
		}
		return s;
	}
	public Object get(int index){
		/**/
		if(index < 0 || index > size) {
			throw new IndexOutOfBoundsException();
		}
		else {
			int i;
			Link premier = Liste;
			for(i = 0; i < index; i++) {
				premier = premier.next();
			}
			return premier.valeur();
		}
	}
	public  boolean contains(Object o){
		Objects.requireNonNull(o);
		Link premier = Liste;
		while(premier != null) { //si je fais premier.next() il ne vérifie pas le dernier élément de la liste
			if(premier.valeur().equals(o)) { 
				return true;
			}
			else {
				premier = premier.next();
			}
		}
		return false;
	}
}
