package museum;

public class Manuscript implements Exhibit{
    @Override
    public String describe(){
        return "Манускрипт это древний текст";
    }
    @Override
    public void preserve(){
        System.out.println("Для сохранения манускрипта необходима контролируемая влажность");
    }
}
