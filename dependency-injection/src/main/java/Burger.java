public class Burger  implements  Food{
    @Override
    public double priceCalculator(int number){
        if(number<0)return 0;
        return 2.30 * number;
    }
}
