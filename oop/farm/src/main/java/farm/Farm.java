package farm;

public class Farm {
    private FarmAnimal farmAnimal;

    public void setFarmAnimal(FarmAnimal farmAnimal){
        this.farmAnimal = farmAnimal;
    }

    public void serviceAnimal(){
        farmAnimal.feed();
        farmAnimal.care();
        farmAnimal.produce();
    }
}
