public class Ex5 {
    public static void main(String[] args){
        LightBulb l = new LightBulb(4, 1200, "blanc");
        LightSwitch ls = new LightSwitch(l);
        System.out.println(l.toString());
        System.out.println("-----------------------------");
        ls.push();
        System.out.println(l.toString());
    }
}
