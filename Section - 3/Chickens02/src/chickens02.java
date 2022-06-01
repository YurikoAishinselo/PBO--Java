package pertemuan03;

public class Pertemuan03 {

    public static void main(String[] args) {
        int monday = 100, 
            tuesday = 121, 
            wednesday = 117;
        float dailyAverage, monthlyAverage, monthlyProfit;

        dailyAverage = (float) (monday + tuesday + wednesday)/3;
        monthlyAverage = dailyAverage*30;
        monthlyProfit = (float) (monthlyAverage * 0.18);

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
