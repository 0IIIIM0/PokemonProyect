public class Ability {
    //name - string
    //description-string
    //attack base- int
 private String name;
 private String description;
 private int basicAttack;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBasicAttack() {
        return basicAttack;
    }

    public void setBasicAttack(int basicAttack) {
        this.basicAttack = basicAttack;
    }

    public Ability(String name, String description, int basicAttack) {
        this.name = name;
        this.description = description;
        this.basicAttack = basicAttack;
    }
}
