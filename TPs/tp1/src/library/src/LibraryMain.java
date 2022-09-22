package library.src;

import java.util.Arrays;

public class LibraryMain {
    public static void main(String[] args){
        /*Author a1 = new Author("Tolkien", "JRR", 1892);
        Author a2 = new Author("Herbert", "Frank", 1920);

        Book b1 = new Book("Le Seigneur des Anneaux", a1, 1954, 1600);
        Book b2 = new Book("Bilbo le Hobbit", a1, 1937, 408);
        Book b3 = new Book("Dune", a2, 1965);

        Library l1 = new Library();
        l1.addBook(b1);
        l1.addBook(b2);
        l1.addBook(b3);

        int nbLivres = 0;
        for(int i = 0; i < l1.getNbBooks(); i++){
            if(l1.getBook(i).getNbPages() > 0){
                nbLivres++;
            }
        }

        System.out.println("Il y a "+nbLivres+" dont on connait le nombre de pages");*/


        int[] tab = new int[10];

        tab[0] = 4;
        tab[1] = 75;
        tab[2] = 2;
        tab[3] = 765;
        tab[4] = 1;
        tab[5] = 11;
        tab[6] = 345;
        tab[7] = 9;
        tab[8] = 564;
        tab[9] = 356;


        int tmp = 0;
        for(int i=0; i < tab.length; i++){
            for(int j=1; j < (tab.length-i); j++){
                if(tab[j-1] > tab[j]){
                    tmp = tab[j-1];
                    tab[j-1] = tab[j];
                    tab[j] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(tab));

    }
}
