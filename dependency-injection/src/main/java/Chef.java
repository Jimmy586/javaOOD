import static java.lang.System.*;

public class Chef {
    Food food;
    public Chef(Food food){
        this.food = food;
    }
    public void makeFood(){
        out.println("Food for today is " + this.food.toString());
    }
}
