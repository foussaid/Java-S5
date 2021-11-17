public class Book2 {
  private final String title;
  private final String author;

  public Book2(String title, String author) {
    this.title = title;
    this.author = author;
  }
  
  /*redéfnition de la classe equals*/
  @Override
  public boolean equals(Object obj) {
      if (this.title.equals(((Book2)obj).title) && this.author.equals(((Book2)obj).author)){
          return true;
      }
      else{
          return false;
      }
  }
  public static void main(String[] args) {
    var book1 = new Book2("Da Vinci Code", "Dan Brown");
    var book2 = new Book2("Da Vinci Code", "Dan Brown");
    var bool = book1.equals(book2);
    System.out.println(bool);/*false*/
  }
}
/*
======================
REPONSES AUX QUESTIONS
======================
1-Le problème est : la classe equals doit être redéfinie.
Pour régler le problème, il faut redéfinir la classe equals() 
  
*/