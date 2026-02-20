package practice_collection.cost_counter;

public class Main {
    public static void main(String[] args){
        CostCounter costCounter = new CostCounter();
        costCounter.addCosts(1, 123.12);
        costCounter.addCosts(2, 1233.43);
        costCounter.addCosts(3, 125.12);
        costCounter.addCosts(4, 1285435.3);
        costCounter.addCosts(5, 2342.33);
        costCounter.addCosts(6, 111123.22);
        costCounter.addCosts(7, 188.22);
        costCounter.addCosts(8, 125.23);

        System.out.println(costCounter.getCosts(3));
        System.out.println(costCounter.minCostsPerMonth());
    }
}
