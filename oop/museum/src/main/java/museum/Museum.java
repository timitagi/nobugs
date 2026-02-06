package museum;

public class Museum {
    private Exhibit exhibit;

    public void setExhibit(Exhibit exhibit){
        this.exhibit = exhibit;
    }

    public void showExhibit(){
        System.out.println(exhibit.describe());
        exhibit.preserve();
    }
}
