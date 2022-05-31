import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class Main implements Util {
    static ArrayList<Ability> habilidades = new ArrayList<>();
    static Ability hability1 = new Ability("FLYING KICK","DEADLY KICK WITH DOUBLE HOOK",40);
    static Ability hability2 = new Ability("FIRE FIST", "HIT WITH A FIERY AURA",40);
    static Ability hability3 = new Ability("PSYCHIC ATTACK", "MENTAL ATTACK", 50 );
    static Ability hability4 = new Ability("CREEPER", "ENTANGLE THE ENEMY", 50 );

    public static void main(String[] args) throws InterruptedException {
        habilidades.add(hability1);
        habilidades.add(hability2);
        habilidades.add(hability3);
        habilidades.add(hability4);






        /*ArrayList<Item>forStore=new ArrayList<>();
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



        ArrayList<Pokemon>pokedexOppositetrainer = new ArrayList<>();
        ArrayList<Pokemon>pokedexMine = new ArrayList<>();
        Ability hi = new Ability("patata","fuaaa",10);

        Pokemon prove1 = new Pokemon("Pipo","2", 'f',"fire",hi,100,false,"papa","lala");
        Pokemon prove2 = new Pokemon("furious","2",'f',"fire",hi,100,false,"papa","lala");
        Pokemon prove3 = new Pokemon("nightmare","2",'f',"fire",hi,100,false,"papa","lala");
        Pokemon prove4 = new Pokemon("chispi","2",'f',"fire",hi,100,false,"papa","lala");

        pokedexOppositetrainer.add(prove1);
        pokedexOppositetrainer.add(prove2);

        pokedexMine.add(prove3);
        pokedexMine.add(prove4);











        Trainer pedro= new Trainer("MEFOX","1",'f',"dsd",prove1,1,pokedexMine,null,0);
        System.out.println( pedro.exchangePokemon(pokedexOppositetrainer));*/






    }

    @Override
    public void timer(long initialTime, long finalTime) throws InterruptedException {

        initialTime = System.currentTimeMillis();
        Thread.sleep(2000);
        finalTime= System.currentTimeMillis();
        float presentTime= (float) ((finalTime-initialTime/1000));
        System.out.println("you have been playing "+presentTime);


    }

    @Override
    public void displayMenu() {
        System.out.println("1- Explore");
        System.out.println("2- Enter to Store");
        System.out.println("3- Delete Item");
        System.out.println("4-  Time playing ");

    }

    @Override
    public Pokemon createPokemonAleatory() {
        Random randompoke= new Random();
        int value= randompoke.nextInt(1,100);
        int hp= randompoke.nextInt(75,250);
        int force=randompoke.nextInt(30,90);
        int speed=randompoke.nextInt(1,80);
        char genre=randompoke.nextInt(1,2)==1?'m':'f';

        return null;
    }

    @Override
    public <G> G takeoutaleatory(ArrayList<G> metothauxarray) {
        return null;
    }

    @Override
    public String[] weaknessAndStreightaleatory(String type){
        String[] types=new String[2];
        switch (type){
            case "watter":
                types[0]="plant";
                types[1]="fire";
                break;
            case "fire":
                types[0]="watter";
                types[1]="plant";
                break;
            case "land":
                types[0]="fire";
                types[1]="plant";
                break;
            case "plant":
                types[0]="fire";
                types[1]="land";
                break;
            default:
                types[0]="WATA";
                types[1]="MATTA";
                break;
        }
        return types;
    }

    @Override
    public String[] aleatorynames(String type) {
        String[] names =new String[4];
        switch (type){
            case "watter":
                names[0]="splash";
                names[1]="whale";
                names[2]="poseidon";
                names[3]="rockshok";
                break;
            case "fire":
                names[0]="volcano";
                names[1]="fireflanc";
                names[2]="fenix";
                names[3]="fireball";
                break;
            case "land":
                names[0]="strapper";
                names[1]="coutch";
                names[2]="pldiform";
                names[3]="paladinum";
                break;

            case "plant ":
                names[0]="sludge ";
                names[1]="root";
                names[2]="groot";
                names[3]="tree";
                break;
            default:
                names[0]="papito";
                names[1]="cash";
                names[2]="Irinishqui";
                names[3]="Kaio";
                break;
        }

        return names;
    }
}
