import java.util.Objects;
public record Book(String title, String author)/*argument author supprimé pour faire la q6*/{

    /*Constructeur canonique*/
    public Book(String title, String author) {
        this.title = Objects.requireNonNull(title, "title must not be null");
        this.author = Objects.requireNonNull(author, "author must not be null");
    }

    /*Le constructeur compacte*/
    /*public Book {
        Objects.requireNonNull(title, "title must not be null");
        Objects.requireNonNull(author, "author must not be null");
    }*/

    /*Constructeur prenant juste le titre*/
   public Book(String title){
   	/*Ici on ne me demande pas de renvoyer une erreur mais s'il n'y a pas d'auteur au livre on met <no_author>*/
        this(title,"<no author>");
    }
   
  /*public void withTitle(Book book, String title) {
        book.title = title; 
        /* on change pas la valeur d'un champ,mais on renvoie un nouveau objet avec la nouvelle valeur. 
    }*/
    public Book withTitle(String title) {
    	/*Créer une nouvelle instance avec la nouvelle valeur*/
        return new Book(title,this.author);
    }
    
    public boolean isFromTheSameAuthor(Book other){
        return author.equals(other.author);
    }

    @Override
    public String toString(){
        return title + " by " +author;
    }
    
    public static void main(String[] args){
        var book = new Book("Da Vinci Code", "Dan Brown");
        System.out.println(book.title + ' ' + book.author);

        /*tester si b1, b2 et b3 ont le même contenu*/
        var b1 = new Book("Da Java Code", "Duke Brown");
	    var b2 = b1;
	    var b3 = new Book("Da Java Code", "Duke Brown");

	    var book1 = new Book("Da Vinci Code", "Dan Brown");
        var book2 = new Book("Angels & Demons", new String("Dan Brown"));
	    System.out.println("Booléen");
	    System.out.println(b2.equals(b3));/*true*/
	    System.out.println(b1.equals(b3));
	    System.out.println(b1.equals(b2));
	    System.out.println(book1.isFromTheSameAuthor(book2));/**/
    }
}

/*
======================
REPONSES AUX QUESTIONS
======================
Exercice 1 :
1-Le programme affiche le titre et l'autre de la nouvelle instance Book qu'on a créée.

2-En important le classe main du fichier Book.java, dans le main de la classe Main, on obtient une erreur,
  parce que les arguments title et author ne sont pas accessibles en dehors du record. 

  Pour le corriger : Il suffit d'écrire book.title() dans Main.java au lieu de book.title.

4-Pour éviter ce problème, on utilise la méthode Objects.requireNonNull lors de la définition des
  deux arguments title et author et mettre une contrainte qu'ils ne soient pas à null. 

7-Pour savoir quel constructeur appeler, le compilateur:
  du coup il faut pas commenter les constructeur précédents ? 

8-Le code ne marche pas parce qu'on ne peut pas changer directement un objet.
  Du coup il faut créer une nouvelle instance de Book et lui donner le nouveau titre.

Exercice 2:
1-Le code affiche true et false.
  b3 est une nouvelle instance de Book, son adresse est différente de celle de b1, ce sont deux objets différents
  contrairement à b2 qui est le même que b1

2-Pour tester si deux objets ont le même contenu, on utilise la méthode equals().

6-L'anotation @Override est utilisé pour définir une méthode qui est héritée de la classe parente. 
  Permet de préciser qu'il s'agit d'une redéfinition d'une méthode de la superclasse, et force le 
  compilateur à vérifier que la méthode a été redéfinie correctement.

*/