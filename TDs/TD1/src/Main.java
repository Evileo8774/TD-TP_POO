import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        test1();
    }

    public static void test1(){
        int a = 1;
        int b = 2;

        System.out.println(a+" "+b);

        int c = b;
        b = a;
        a = c;

        System.out.println(a+" "+b);
    }

    public static void test2(){
        String s1 = "Chaine de caracteres";
        String s2 = "n";

        boolean b = s1.indexOf(s2) != -1;

        System.out.println(b);
    }

    public static void test3(){
        int a = 3;
        int b = 1;
        int c = 2;

        int x = (a > b ? a : b);
        int res = (x > c ? x : c);


        System.out.println("Le nombre le plus grand est : "+res);
    }

    public static void test4(){
        int a = 221;
        int b = 782;

        int res;
        while(a != 0 && b != 0){
            if(a > b){
                res = a % b;
                a = b;
                b = res;
                System.out.println(a+" "+b);
            } else {
                res = b % a;
                b = a;
                a = res;
                System.out.println(b+" "+a);
            }
        }
        if(a == 0) res = b;
        else res = a;

        System.out.println("Le PGCD est : "+res);
    }

    public static void test5(){
        int a = 4;

        int half = a / 2;
        int i = 2;
        boolean premier = true;
        do{
            if(a % i == 0){
                premier = false;
            }
        } while(premier != false && i != half);

        if(premier == true){
            System.out.println(a+" est un nombre premier");
        } else {
            System.out.println(a+" n'est pas un nombre premier");
        }
    }

    public static void test6(){
        String s = "chaine de caracteres";
        char c = 'c';

        int amount = 0;
        for(int i = 0; i < s.length(); i++){
            char tmp = s.charAt(i);
            if(tmp == c) amount++;
        }

        System.out.println(amount);
    }

    public static void test7(){
        int[] tab;
        int a = 9;

        tab = new int[a];
        for(int i = 0; i < tab.length; i++){
            tab[i] = i+1;
        }

        System.out.println(Arrays.toString(tab));
    }

    public static void test8(){
        int[][] tab = new int[3][];
        tab[0] = new int[]{4, 8, 9};
        tab[1] = new int[]{7, 6, 2};
        tab[2] = new int[]{1, 3, 5};

        int min = 0;

        min = tab[0][0];

        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j < tab[i].length; j++){
                if(tab[i][j] < min){
                    min = tab[i][j];
                }
            }
        }

        System.out.println("le minimum est : "+min);
        System.out.println(Arrays.deepToString(tab));
    }

    public static void test9(){
        char[] tab = {'a', 'z', 'd', 'f', 'g', 's', 'h', 'v', 'b', 'm', 'i', 'j', 't'};
        int index = -1;
        char myChar = 'b';

        for(int i = 0; i < tab.length; i++){
            if(tab[i] == myChar){
                index = i;
                break;
            }
        }

        System.out.println("Mon caractère se trouve à l'index "+index);
    }

    public static void test10(){
        String s = "chaine de caractères";
        char c = 'n';
        String[] tab = new String[2];


        tab[0] = s;
        for(int i = 0; i < s.length(); i++){
            char tmp = s.charAt(i);
            if(tmp == c){
                tab[0] = s.substring(0, i+1);
                tab[1] = s.substring(i+1);
                break;
            }
        }

        System.out.println(Arrays.toString(tab));
    }

    public static void test11(){
        int[] tab = {3, -6, 7, -4, 2};

        int count = 0;
        for(int t : tab){
            if(t >= 0) count++;
        }

        System.out.println(count);
    }

    public static void test12(){
        int[] tab = {-3, 3, 7, -4, 2};

        int amount = 0;
        int count = 0;
        for(int t : tab){
            if(t > 0) count++;
            else count = 0;

            if(count > amount) amount = count;
        }

        System.out.println(amount);
    }

    public static void test13(){
        int[][] tab = new int[2][];

        tab[0] = new int[]{1, 2};
        tab[1] = new int[]{3, 4};

        int res = 1;
        for(int y = 0; y < tab.length; y++){
            for(int x = 0; x < tab[y].length; x++){
                res *= tab[y][x];
            }
        }

        System.out.println(res);
    }

    public static void test14(){
        int[][] tab = new int[2][];

        tab[0] = new int[]{1, 2};
        tab[1] = new int[]{3, 4};

        int res = 0;
        for(int i = 0; i < tab.length; i++){
            res += tab[i][i];
        }

        System.out.println(res);
    }

    public static void test15(){
        int[] tab = {4, 6, 8, 2, 7, 9, 1, 3};

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

    public static void test16(){
        int[][] tab = new int[5][];
        tab[0] = new int[]{1};
        System.out.println(Arrays.toString(tab[0]));
        for(int y = 1; y < tab.length; y++){
            tab[y] = new int[y+1];
            for(int x = 0; x < tab[y].length; x++){
                if(x == 0 || x == tab[y].length-1) tab[y][x] = 1;
                else tab[y][x] = tab[y-1][x-1] + tab[y-1][x];
            }

            System.out.println(Arrays.toString(tab[y]));
        }
    }


}
