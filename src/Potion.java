public class Potion extends Item{
    public Potion(double price, int quantity, String name, String type) {
        super(price, quantity, name, type);
    }

    // effect -String
    //duration -int

    private String efecto;
    private int duracion;
    //use -
        //healing
            //increase 20% health
        //Strong
            //increase attack 20%
        //Speed
            //increase 20% ,


    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Potion(double cost, int quantity, String name, String type, String efecto, int duracion) {
        super(cost, quantity, name, type);
        this.efecto = efecto;
        this.duracion = duracion;
    }
}
