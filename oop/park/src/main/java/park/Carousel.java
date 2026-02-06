package park;

public class Carousel implements Attraction{
    @Override
    public String info(){
        return "Карусель это спокойный аттракцион";
    }

    @Override
    public void maintain(){
        System.out.println("На карусели выполняется техническое обслуживание");
    }
}
