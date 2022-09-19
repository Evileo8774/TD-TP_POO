package library.src;

/**
 * Define author of books
 */

public class Author {
   /**
    * an Author is defined by its lastname, firstname, and birth year
    * 
    * @param lastname  author's lastname
    * @param firstname author's firstname
    * @param birthyear author's birth year
    */
   public Author(String lastname, String firstname, int birthYear) {
      this.lastname = lastname;
      this.firstname = firstname;
      this.birthYear = birthYear;
   }

   private String lastname;
   private String firstname;
   private int birthYear;

   /**
    * this author's lastname
    * 
    * @return this author's lastname
    */
   public String getLastname() {
      return this.lastname;
   }

   /**
    * get author information as a String
    * 
    * @return description for this author
    */
   public String toString() {
      return this.firstname + " " + this.lastname + " born in " + this.birthYear;
   }

   /**
    * get author name as a String
    *
    * @return name of the author
    */

   public String getFullName(){
      return this.firstname+" "+this.lastname;
   }


   public String getFirstname() {
      return firstname;
   }

   public int getBirthYear() {
      return birthYear;
   }
}
