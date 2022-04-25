import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item>forStore=new ArrayList<>();
        Potion potion1= new Potion(30.3,2,"potion hp","hp","add hp",10);
        forStore.add(potion1);
        Store myStore = new Store("My Store",forStore);


    }
}
