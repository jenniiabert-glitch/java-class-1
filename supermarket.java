public class supermarket {
    public static void main(String[] args){
          //no0fItems, pricePerItems, currency, totalprice
    int no0fCheeseballs =  50;
    float pricePerItems = 9.99f;
    char currency = '$';
    float totalpriceOfChballs = no0fCheeseballs * pricePerItems;

    int noOFruitballs = 12;
    float priceOfFruitballs =  10.99f;
    float totalFruitballPrice = noOFruitballs * priceOfFruitballs;
    

    int noOfballs = 10;
    float costPerBall =  5.98f;
    float totalCostofBalls =  noOfballs * costPerBall;

    float completeTotalCost = totalpriceOfChballs + totalFruitballPrice + totalCostofBalls;
    System.out.println("Total cost of all your cheeseballs are " + totalpriceOfChballs + currency);
    System.out.println("Total cost of all your fruitballs are " + totalFruitballPrice + currency);
    System.out.println("Total cost of all your regular balls are " + totalCostofBalls + currency);
    System.out.println("Total cost of all your items are " + completeTotalCost + currency);

    
    }
}
