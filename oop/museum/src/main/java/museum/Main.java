package museum;

public class Main {
    public static void main(String[] args){
        Museum museum = new Museum();
        Manuscript manuscript = new Manuscript();
        Sculpture sculpture = new Sculpture();
        museum.setExhibit(manuscript);
        museum.showExhibit();
        museum.setExhibit(sculpture);
        museum.showExhibit();
    }
}
