public class House {

    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingroom;
    private RestRoom[] restRooms;
    private BedRoom[]  bedRooms;
    private Yard yard;

    public House(){

    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setDiningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public void setLivingroom(LivingRoom livingroom) {
        this.livingroom = livingroom;
    }

    public LivingRoom getLivingroom() {
        return livingroom;
    }

    public void setRestRooms(RestRoom[] restRooms) {
        this.restRooms = restRooms;
    }

    public RestRoom[] getRestRooms() {
        return restRooms;
    }

    public void setBedRooms(BedRoom[] bedRooms) {
        this.bedRooms = bedRooms;
    }

    public BedRoom[] getBedRooms() {
        return bedRooms;
    }

    public void setYard(Yard yard) {
        this.yard = yard;
    }

    public Yard getYard() {
        return yard;
    }

    public void addRoom(BedRoom bedRoom){

    }
    public void addRoom(RestRoom bedroom){

    }

}