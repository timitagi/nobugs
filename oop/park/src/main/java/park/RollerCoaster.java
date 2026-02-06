package park;

public class RollerCoaster implements Attraction{
    @Override
    public String info(){
        return "На американских горках ты получишь острые ощущения";
    }

    @Override
    public void maintain(){
        System.out.println("На американских горках выполняется регулярная проверка безопасности");
    }
}
