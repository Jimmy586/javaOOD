public class Burger  implements  Food{
    @Override
    public double priceCalculator(int number){
        return 2.30 * number;
    }
}
