public class Berry extends Item{
    //effect
    //duration

    private String effect;
    private int duration;

    //use
    //if healing
    //increase 20 HP
    //if strength
    //increase attack 20
    //if speed
    //increase speed 20

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

    public Berry(double cost, int quantity, String name, String type, String effect, int duration) {
        super(cost, quantity, name, type);
        this.effect = effect;
        this.duration = duration;
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
        return this.getClass().toString().substring(5) +
                "effect='" + effect + '\'' +
                ", duration=" + duration +
                '}';
    }
}
