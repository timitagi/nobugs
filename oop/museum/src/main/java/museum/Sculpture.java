package museum;

public class Sculpture implements Exhibit{
    @Override
    public String describe(){
        return "Скульптура это объект времен античности";
    }
    @Override
    public void preserve(){
        System.out.println("Для сохранения скульптуры необходима регулярная реставрация");
    }
}
