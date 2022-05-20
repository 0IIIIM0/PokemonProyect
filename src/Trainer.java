import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Trainer<pokedex1, pokedex2> extends Character {

    //Region - String
    //PokemonPet - Pokemon
    //TournamentWon - Int
    //Pokedex - ArrayList<Pokemon>
    //Backpack - ArrayList<Item>
    private String region;
    private Pokemon pokemonPet;
    private int tournamentsWin;
    ArrayList<Pokemon>pokedex;
    ArrayList<Item>backpack;
    private int money;

    public Trainer(String name,String level, char genre,String region, Pokemon pokemonPet,int tournamentsWin, ArrayList pokedex, ArrayList backpack, int money) {
        super(name,level,genre);
        this.region = region;
        this.pokemonPet = pokemonPet;
        this.tournamentsWin = tournamentsWin;
        this.pokedex = pokedex;
        this.backpack = backpack;
        this.money = money;

    }



    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Pokemon getPokemonPet() {
        return pokemonPet;
    }

    public void setPokemonPet(Pokemon pokemonPet) {
        this.pokemonPet = pokemonPet;
    }

    public int getTournamentsWin() {
        return tournamentsWin;
    }

    public void setTournamentsWin(int tournamentsWin) {
        this.tournamentsWin = tournamentsWin;
    }

    public ArrayList<Pokemon> getPokedex() {
        return pokedex;
    }

    public void setPokedex(ArrayList<Pokemon> pokedex) {
        this.pokedex = pokedex;
    }

    public ArrayList<Item> getBackpack() {
        return backpack;
    }

    public void setBackpack(ArrayList<Item> backpack) {
        this.backpack = backpack;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    //Fight - Abstraction Implemented
    //Choose a Pokemon from the Pokedex
    //If the HP is over 15
    //Choose 2 doves and 1 weak randomly
    //If don´t have doves, choose 3 randomly

    //Call to the fight method of the Pokemon



//if you choose to heal
    // validate if there are potions/healing basins, use
    //if you choose to increase attack
    // to validate if there are potions/attack rays, use
    //if you choose speed
    // validate if there are potions/ speed bays, use

    //win --> when the opposite trainer runs out of pokemons
    //level 1 -> 10 XP
    //level n+1 -> 10 XP * 1.5

    //lose --> when you run out of pokémon

    //drop item
    //show items in the backpack
    //let the user choose which one to throw

    //swap // recibe a trainar - pokedex
    //opposite trainer shows pokedex
    //specify the pokemon i want
    //propose a pokemon from the pokedex
    //and with random true or false accept
    //if true

    @Override
    public String  toString() {
        return this.getClass().toString().substring(5) +
                "region='" + region + '\'' +
                ", pokemonPet=" + pokemonPet +
                ", tournamentsWin=" + tournamentsWin +
                ", pokedex=" + pokedex +
                ", backpack=" + backpack +
                ", money=" + money +
                '}';
    }

    public void deleteItem(Item item){
        for (int i =0;i<backpack.size();i++){
            if (item.name.equals(item.name)) {
                backpack.remove(i);
                System.out.println("item remove");
            }
        }



    }

    public void displaybackpack(){
        System.out.println("you have this Items: ");
        int index=1;
        for (Item item : backpack){
            System.out.println(index+" - ");
            System.out.println(item);//missing apply to String methods
            index++;
        }
    }

    public void displayPokedex(ArrayList<Pokemon> pokemons){
        System.out.println("you have this pokemones: ");
        int index=1;
        for (Pokemon pokemon : pokemons){
            System.out.println(index+" - ");
            System.out.println(pokemon);//missing apply to String methods
            index++;
        }
    }


    public boolean exchangePokemon(ArrayList <Pokemon> backpackOposite){
        System.out.println("Items are: ");
        int index=1;
        for (Pokemon pokemon : backpackOposite){
            System.out.println(index+"-");
            System.out.println(pokemon); //missing apply to String methods
            index++;
        }
        Scanner read = new Scanner(System.in);
        System.out.println("choose the pokemon from your opponent :");
        int choosenOpossite = read.nextInt()-1;
        displayPokedex(pokedex);

        System.out.println("choose the pokemon you want to exchange :");
        int choosenMine = read.nextInt()-1;
        System.out.println("I exchange you for : "+pokedex.get(choosenMine));
        boolean acept= false;
        Random random=new Random();
        int value =random.nextInt(5)+1;
        //operador temario : asignar valor a una variable dependiendo del resultado de una condición
        // nombrVariable = (Condición) ? valorSiVerdadero : valorSiFalso;
        //                  ojo debe retornar verdadero o falso
        acept=(value==1);
        if (acept){
            Pokemon aux= pokedex.get(choosenMine);
            pokedex.set(choosenMine,backpackOposite.get(choosenMine));
            backpackOposite.remove(choosenOpossite);
            backpackOposite.add(aux);
            System.out.println(" sucessful exchange ");
            return true;
        }else {
            System.out.println("he didnt want to change");
            return false;

        }






    }
    @Override//opposite
    public boolean fight(Pokemon pokemonOpposite) {
        ArrayList<Pokemon>forFight=new ArrayList<>();
        displayPokedex(pokedex);
        System.out.println("choose 3 pokemons");
        Scanner read =new Scanner(System.in);

        for (int i =0; i<3;i++){
            System.out.println("ingrese the pokemon");
            forFight.add(pokedex.get(read.nextInt()-1));
        }
        int resoult=0;
        do{
            if (forFight.size()!=0) {
                System.out.println("1 fight");
                System.out.println("2 use berry/potion");
                System.out.println("3 go away");
                resoult=read.nextInt();

                if (resoult == 1) {
                    System.out.println("chose the pokemon for fight");
                    displayPokedex(forFight);
                    int select = read.nextInt();
                    if (!forFight.get(select).fight(pokemonOpposite)){
                        forFight.remove(select);
                    }else {
                        return true;
                    }


                } else if (resoult == 2) {
                    displaybackpack();
                    System.out.println("select the berry o the potion for your poke");
                    int selerct = read.nextInt();
                    System.out.println("choose the berry o potion for your poke");
                    displayPokedex(forFight);
                    backpack.get(selerct - 1).use(forFight.get(read.nextInt()));

                } else {
                    System.out.println("going away");
                    return false;
                }
            }else {
                return false;
            }
        } while (resoult!=0);
        return false;
    }
}
