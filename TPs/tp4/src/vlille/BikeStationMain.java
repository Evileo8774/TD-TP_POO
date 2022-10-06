package vlille;

import com.sun.jdi.event.ExceptionEvent;
import vlille.util.*;

public class BikeStationMain {
    public static void main(String[] args){
        BikeStation b = new BikeStation("timoleon", 10);

        Bike b1 = new Bike("b001", BikeModel.CLASSIC);
        Bike b2 = new Bike("b002", BikeModel.ELECTRIC);

        b.dropBike(b1);
        b.dropBike(b2);

        if(args.length < 1){
            System.out.println("Vous devez choisir un vélo");
        } else {
            try{
                Bike myBike = b.takeBike(Integer.parseInt(args[0]));
                if(myBike != null) System.out.println(myBike.getId());
                else System.out.println("Aucun vélo connu à cet emplacement");
            } catch(Exception e){
                System.out.println(e);
            }
        }

    }



}
