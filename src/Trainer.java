import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

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
    public void deleteItem(Item item){
        for (int i =0;i<backpack.size();i++){
            if (item.name.equals(item.name)) {
                backpack.remove(i);
                System.out.println("item remove");
            }
        }



    }
    public void exchangePokemon(ArrayList pokedex1,ArrayList pokedex2,int pos1,int pos2){


        pokedex1.add(pos2,pokedex2);
        pokedex2.add(pos1,pokedex1);

        pokedex1.remove(pos1);
        pokedex2.remove(pos2);



    }


}
