public class Ex3 {
    public static void main(String[] args){
        if(args.length != 0){
            int count = 0;

            for(int i = 0; i < args[0].length(); i++){
                char tmp = args[0].charAt(i);
                if(tmp == 'a') count++;
            }

            System.out.println("Il y a "+count+" 'a' dans "+args[0]);
        } else {
            System.out.println("Veuillez entrer un paramètre");
        }
    }
}
