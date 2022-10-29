public class Pizza implements Food{
    @Override
    public double priceCalculator(int number){
        return 2.50 * number;
    }
}
