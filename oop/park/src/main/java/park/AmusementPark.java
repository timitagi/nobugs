package park;

public class AmusementPark {
    private Attraction attraction;

    public void setAttraction(Attraction attraction){
        this.attraction = attraction;
    }
    public void operateAttraction(){
        System.out.println(attraction.info());
        attraction.maintain();
    }
}
