package day23_ArraySecondDay;

public class Average {
    public static void main(String[] args) {

    //    double[] prices ={13.99, 19.14, 3.112, 65.332};
    //    double sum = 0;
     //   for(double eachPrice :prices){
      //      sum += eachPrice;
     //   }
       // System.out.println(sum/prices.length);


         double[] prices ={13.99, 19.14, 3.112, 65.332};
        double sum = 0;
        for(int i = 0; i<prices.length; i++){
            sum += prices[i];
        }
        System.out.println(sum/prices.length);


        // eachPrice == prices[i] ---> same
    }
}
