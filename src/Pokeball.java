import java.util.Random;

public class Pokeball extends Item{
    //efficiency - double
    private double efficiency;

    public Pokeball(double cost, int quantity, String name, String type, double efficiency) {
        super(cost, quantity, name, type);
        this.efficiency = efficiency;
    }

    @Override
    public boolean use(Pokemon pokemon) {
        if (pokemon.isLegendary()){
            this.efficiency-=40;
        }
        Random random = new Random();
        int auxValue = random.nextInt(1,100);
        if (auxValue>=1 && auxValue<=this.efficiency){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.getClass().toString().substring(5) +
                "cost=" + cost +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", efficiency=" + efficiency +
                '}';
    }
    //throw
    //review the type of poke-ball
        // how many types of poke-ball do we are going to have (classic effectivity
    //review the type of Pokemon


    //catch- return boolean
    // review type of pokemon
        //if is legendary -40% efectivity

    //make a random 1-100
        // if we obtain a nomber between 1 and the efectivity
            //we catch
            //we rest one poke-ball
        // else
            // try again
            //exit   ,

}

