package practice_collection.cost_counter;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class CostCounter {

    //массив, индекс = номер месяца
    private ArrayList<Double> costsPerMonth;

    public CostCounter(){
        this.costsPerMonth = new ArrayList<>();
    }
    public void addCosts(int month, Double costs){
        costsPerMonth.add(month-1, costs);
    }
    //метод получения значения
    public  Double getCosts(int month){
        return  costsPerMonth.get(month-1);
    }

    //считать месяц с минимальным расходом
    public Double minCostsPerMonth(){
        AtomicReference<Double> min = new AtomicReference(costsPerMonth.getFirst());
        costsPerMonth.forEach(
                costsPerMonth -> {
                    if(costsPerMonth<min.get()){
                        min.set(costsPerMonth);
                    }
                }
        );
        return min.get();
    }
}
