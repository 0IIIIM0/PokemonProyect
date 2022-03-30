import java.util.ArrayList;

public class Store {
    //attributes
    //Name- String
    // object available-ArrayList<Objets>

    //methods
    //buy
    //sell

    private String name;
    private ArrayList<Object> objectsAvailable;

    public boolean userBuy (double dinero,int cantidad,int indexObject){
        //validate that there are enough objects of the required type
        //object and money
            //if yes, validates that the money is sufficient
                //if it´s sufficient, I sell to him
        //else
            //make exception that there's not the sufficient quantity type
            //repeat the question
        return false;

    }
    public boolean userSell (){
        //inverse logic of buy
        //infinite money (store)
        // recive object and give money
        return false;
    }

}
