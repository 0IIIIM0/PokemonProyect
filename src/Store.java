import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    //attributes
    //Name- String
    // object available-ArrayList<Objets>

    //methods
    //buy
    //sell

    private String name;
    private ArrayList<Item> objectsAvailable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Item> getObjectsAvailable() {
        return objectsAvailable;
    }

    public void setObjectsAvailable(ArrayList<Item> objectsAvailable) {
        this.objectsAvailable = objectsAvailable;
    }

    public Store(String name, ArrayList<Item> objectsAvailable) {
        this.name = name;
        this.objectsAvailable = objectsAvailable;
    }


    //before userbuy we need to show show available
    public boolean userBuy (double dinero, int cantidad, int indexObject) {
        //todo Excepcion
        //metoth to show the dispo item
        if (indexObject > objectsAvailable.size()) {
            System.out.println("Mistake, it doesnt exist that object");
            return false;

        } else {

            if (objectsAvailable.get(indexObject).quantity >= cantidad) {
                double totalPrice = cantidad * objectsAvailable.get(indexObject).cost;

                if (dinero >= totalPrice) {
                    System.out.println("you are buying "+cantidad+""+objectsAvailable.get(indexObject).name+"by $"+totalPrice);
                    System.out.println("your change is:"+(dinero-totalPrice));
                    return true;

                } else {
                    System.out.println("you dont have enough money, missing : " + (totalPrice - dinero));
                    return false;

                }
            } else {
                System.out.println("there is not enought cuantity");
                return false;
            }
        }
        //para cada objeto llamado x dentro de...

        //validate that there are enough objects of the required type
        //object and money
        //if yes, validates that the money is sufficient
        //if it´s sufficient, I sell to him
        //else
        //make exception that there's not the sufficient quantity type
        //repeat the question


    }
    public boolean userSell (Item item,int cuantity){

        if (item.getClass().equals(Berry.class)){
            System.out.println("you can´t sell berry");
            return false;
        }else{
            for (Item element :objectsAvailable ) {
                if(element.name.equals(item.name)){
                    element.quantity+=cuantity;
                    System.out.println("buying an existing item");
                    return true;
                }
                
            }
            objectsAvailable.add(item);
            objectsAvailable.get(objectsAvailable.size()-1).quantity=cuantity;
            System.out.println("buying a new item from store");
            return true;


        }


        /*if(item.name.equals("pokeball"))
            System.out.println("True");

        if(item.name.equals("potion"))
            System.out.println("True");

        if(item.name.equals("berry"))
            System.out.println("false");
        */


       /* Scanner leer = new Scanner(System.in);
        System.out.println("Which item do you want to sell ? \n " +
                "1° pokeball " +
                "2° potion ");
        int option = leer.nextInt();
        if (option==1){
            System.out.println("How many pokeballs do you want to sell ?");
            int numPoke= leer.nextInt();
            if (numPoke>numerodepokebolasenmochila){
                System.out.println("you dont have enough pokeballs");

            }
        }*/



        //potion pokeball
        //inverse logic of buy
        //infinite money (store)
        // recive object and give money
        //System.out.println(item.getClass());


    }

    @Override
    public String toString() {
        return this.getClass().toString().substring(5) +
                "name='" + name + '\'' +
                ", objectsAvailable=" + objectsAvailable +
                '}';
    }

    public void showAvailable(){
        //todo metodo para mostrar objetos dsponibles
        System.out.println("the items available are: ");
        int indice=1;
        for (Item item:objectsAvailable) {
            System.out.println(indice +" - ");
            System.out.println(item);//falta implementar el toString
            indice++;

        }
    }

}

