import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item>forStore=new ArrayList<>();
        Potion potion1= new Potion(30.3,2,"potion","hp","add hp",10);//potion
        Pokeball pokePruve = new Pokeball(20,1,"pokeball","normal",.20);//pokeball
        Berry berryProve =new Berry(0,1,"berry","classic","increase hp",5);
        forStore.add(potion1);
        Store myStore = new Store("My Store",forStore);
        myStore.showAvailable();
        System.out.println(myStore.userBuy(30.0,2,0));
        myStore.userSell(potion1,4);
        Ability pokemonAbility = new Ability("el chacachaca","thow 2 thunder",2);
        Pokemon chorizo = new Pokemon("Pikachu","1", 'h',"watter",pokemonAbility,10,false,"wood","iron");
        Trainer pedro= new Trainer("Uruapan","CHORI","0","0","",100);


    }
}
