package vlille;


public class BikeStation {

   /** array of slots for bikes in the station */
   private Bike[] bikes;
   /** name of the station */
   private String name;

   /**
    * creates a bike station
    *
    * @param name is the name of the bike station
    * @param capacity is the capacity of bikes of the station
    */
   public BikeStation(String name, int capacity) {
      this.name = name;
      this.bikes = new Bike[capacity];
   }

   /**
    * get the name of the bike station
    *
    * @return the bike station name
    */
   public String getName() {
      return name;
   }

   /**
    * get the bike capacity of a station
    *
    * @return bike capacity of the station
    */
   public int getCapacity() {
      return bikes.length;
   }

   /**
    * get the number of bike in a station
    *
    * @return the amount of bikes in a station
    */
   public int getNumberOfBikes() {
      int tmp = 0;
      for(int i = 0; i < bikes.length; i++){
         if(bikes[i] != null) tmp++;
      }
      return tmp;
   }

   /**
    * get the first free slot in the station
    *
    * @return the index of the slot, -1 if the station is full
    */
   public int firstFreeSlot() {
      int freeSlot = -1;
      for(int i = 0; i < bikes.length; i++){
         if(bikes[i] == null) {
            freeSlot = i;
            break;
         }
      }
      return freeSlot;
   }

   /**
    * drop a bike in the station
    *
    * @return true if the bike has been drop or false if it couldn't
    */
   public boolean dropBike(Bike bike) {
      int slot = firstFreeSlot();
      if(slot == -1){
         return false;
      } else {
         bikes[slot] = bike;
         return true;
      }
   }

   /**
    * Allows to take a bike in the station
    *
    * @param i index of the bike in the station
    *
    * @return the bike taken
    */
   public Bike takeBike(int i) throws BikeNotAvailableException {
      if( i < 0 || i >= bikes.length || bikes[i] == null){
         throw new BikeNotAvailableException("Il n'y a pas de vélo à cet emplacement");
      } else {
         Bike tmp = bikes[i];
         bikes[i] = null;
         return tmp;
      }
   }

}
