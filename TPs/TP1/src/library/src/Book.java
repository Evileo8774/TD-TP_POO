package library.src;

/**
 * books for simple object manipulations
 * 
 * @author jc
 */

public class Book {
   /**
    * book is defined by its author, its title, and its publication year
    * 
    * @param author the author of this book
    * @param title  the title of this book
    * @param year   the publication year of this book
    */
   public Book(String title, Author author, int publicationYear) {
      this.title = title;
      this.author = author;
      this.publicationYear = publicationYear;
      this.nbPages = 0;
   }

   public Book(String title, Author author, int publicationYear, int nbPages) {
      this.title = title;
      this.author = author;
      this.publicationYear = publicationYear;
      this.nbPages = nbPages;
   }

   // les attributs de la classe Book

   private Author author;
   private String title;
   private int publicationYear;

   private int nbPages;

   // les méthodes de la classe Book

   /**
    * get book information as a String
    * 
    * @return description for this book
    */
   public String toString() {
      if(nbPages > 0){
         return this.title + " by " + this.author + " published in " + this.publicationYear + " is composed of " + nbPages + " pages";
      } else {
         return this.title + " by " + this.author + " published in " + this.publicationYear;
      }

   }

   /**
    * reads this book (simply displays a text)
    */
   public void read() {
      System.out.println("I read : " + this.title);
   }

   /**
    * returns this book's author
    * 
    * @return this book's author
    */
   public Author getAuthor() {
      return this.author;
   }

   public int getNbPages() {
      return nbPages;
   }

   public void setNbPages(int nbPages) {
      this.nbPages = nbPages;
   }
}
