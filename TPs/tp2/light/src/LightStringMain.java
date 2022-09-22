public class LightStringMain {
    public static void main(String[] args){

        LightString l = new LightString(Integer.parseInt(args[0]));
        l.turnOn();
        System.out.println("La guirlande consomme "+l.getCondumedPower());

        LightBulb lb = new LightBulb(2, 120, "blanc");
        l.changeLightbulb(4, lb);
        System.out.println("La guirlande consomme "+l.getCondumedPower());
    }
}
