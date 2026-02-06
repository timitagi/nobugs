package park;

public class Main {
    public static void main(String[] args){
        AmusementPark amusementPark = new AmusementPark();
        RollerCoaster rollerCoaster = new RollerCoaster();
        Carousel carousel = new Carousel();
        amusementPark.setAttraction(rollerCoaster);
        amusementPark.operateAttraction();
        amusementPark.setAttraction(carousel);
        amusementPark.operateAttraction();
    }
}
