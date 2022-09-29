public class RectangleMain {
    public static void main(String[] args){

        Rectangle r1 = new Rectangle(0, 0);
        Rectangle r2 = new Rectangle(0, 0);
        switch(args.length){
            case 0:
                throw new RuntimeException("Un paramètre est requis");
            case 1:
                r1 = new Rectangle(Double.parseDouble(args[0]), Double.parseDouble(args[0]));
                r2 = new Rectangle(17, 15);
                break;
            case 2:
                r1 = new Rectangle(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
                r2 = new Rectangle(17, 15);
                break;
        }

        System.out.println(r1.toString());
        System.out.println(r2.toString());

        System.out.println(" R1 - Aire:"+r1.area()+" Périmètre:"+r1.perimeter());

        System.out.println("r1:"+r1.isSquare()+" r2:"+r2.isSquare());

        System.out.println(r1.equals(r2));
    }

}
