public class Ex4 {
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Veuillez entrer les paramètres");
        } else {
            int count = 0;
            char c = 'a';

            if(args.length == 2) c = args[1].charAt(0);

            for(int i = 0; i < args[0].length(); i++){
                char tmp = args[0].charAt(i);
                if(tmp == c) count++;
            }

            System.out.println("Il y a "+count+" '"+c+"' dans "+args[0]);
        }
    }
}
