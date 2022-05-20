public abstract class Character {
    //Atributes
    //Name - String protected
    //Level -Int protected
    //Gender - Char protected

    //Create a constructor
    protected String name;
    protected String level;
    protected char genre;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public Character(String name, String level, char genre) {
        this.name = name;
        this.level = level;
        this.genre = genre;
    }
    //fight - Abstract
    public abstract boolean fight(Pokemon pokemon);

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", genre=" + genre +
                '}';
    }
}
