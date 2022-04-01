public class Item {
    //cost-double
    //quantity-int
    //name -String

    private double cost;
    private int quantity;
    private String  name;
    private String type;

    //getters and setters
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //constructor
    public Item(double cost, int quantity, String name, String type) {
        this.cost = cost;
        this.quantity = quantity;
        this.name = name;
        this.type = type;
    }




}
