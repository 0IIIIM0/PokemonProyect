public class Potion extends Item{
    public Potion(double price, int quantity, String name, String type) {
        super(price, quantity, name, type);
    }



    // effect -String
    //duration -int

    private String effect;
    private int duration;
    //use -
        //healing
            //increase 20% health
        //Strong
            //increase attack 20%
        //Speed
            //increase 20% ,


    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Potion(double cost, int quantity, String name, String type, String efecto, int duracion) {
        super(cost, quantity, name, type);
        this.effect = efecto;
        this.duration = duracion;
    }
    @Override
    public boolean use(Pokemon pokemon) {
        if (this.effect.equals("hp")){
            pokemon.setHp(pokemon.getHp()+20);
            return true;
        }else if (this.effect.equals("strength")){
            pokemon.getAbility().setBasicAttack(pokemon.getAbility().getBasicAttack()+20);
            return true;
        }else if (this.effect.equals("Speed")){
            pokemon.setSpeed(pokemon.getSpeed()+20);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Potion{" +
                "cost=" + cost +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", duration=" + duration +
                '}';
    }
}
