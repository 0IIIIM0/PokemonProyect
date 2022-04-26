public class Pokemon extends Character {

    //type - String
    //ability -ability
    //Hp- double
    //isLegendary - boolean
    // weakness (elements make your pokemon is weak) - String
    // stronger- String
    //attack- int
    //velocity-int
    private String type;
    private Ability ability;
    private int hp;
    private boolean isLegendary;
    private String weakOf;
    private String stronger;

    public Pokemon(String name, String level, char genre, String type, Ability ability, int hp, boolean isLegendary, String weakOf, String stronger) {
        super(name, level, genre);
        this.type = type;
        this.ability = ability;
        this.hp = hp;
        this.isLegendary = isLegendary;
        this.weakOf = weakOf;
        this.stronger = stronger;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isLegendary() {
        return isLegendary;
    }

    public void setLegendary(boolean legendary) {
        isLegendary = legendary;
    }

    public String getWeakOf() {
        return weakOf;
    }

    public void setWeakOf(String weakOf) {
        this.weakOf = weakOf;
    }

    public String getStronger() {
        return stronger;
    }

    public void setStronger(String stronger) {
        this.stronger = stronger;
    }
    //fight
    //use potion for the attack?
    //if yes attack base +20

     //if my pkoemon is stronger get more power to the atack
     // if my pokemon is weaker get less power to the attack
    //else normal attack

    //when we attack we need to subtract the hp of the other pokemon the same of the attack



}
