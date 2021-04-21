public class Pizza {
    //Attributes (Things pizzas have)
    private String name;
    private String[] toppings;
    private char size;
    private int slices;
    // This allows us to incrament the total pizzas.  
    // We can do this because we used static in the code below.
    static int totalPizzas;

    //Methods (Things you can do with the pizza object)
    //Constructor
    public Pizza(String name, String[] toppings, char size, int slices){
        this.name = name;
        this.toppings = toppings;
        this.size = size;
        this.slices = slices;
        //incrament the number of pizzas 
        this.totalPizzas = this.totalPizzas +=1;
    }

    // Getter and Setter methods allow us to access these private attributes 
    // from elsewhere in the program.  Write a getter and setter for each 
    // individual attribute so that you can return the value.  This allows
    // us to access the attributes from anywhere in the program even though 
    // they are private.  All getters and setters will be public.

    public String getName(){
        return this.name;
    }
    public String [] getToppings(){
        return this.toppings;
    }
    public char getSize(){
        return this.size;
    }
    public int getSlices(){
        return this.slices;
    }

    // Settters: Take in a 
    // parameter to this method 
    // and append it if we want 
    // to use the setter to alter 
    // any of these values later 
    // on in the controller.  
    // Setters are set in the main 
    // program, and getters are written in the controller.

    public void setName(String name){
    //if statement works as an access control 
    // modifyer, and provides a level of security
    // regarding what the user can get and set.  Setting the 
    //controll access modifyer as a blank string means that 
    // no one can submit a blank string.
        if(name.equals("")){
            System.out.println("Name cannot be blank");
            // This statement exits from the application due to no name.
            return;
        }
        this.name = name;
    }
    public void setToppings(String[] toppings) {

        this.toppings = toppings;
    }
    public void setSize(char size){
        this.size = size;
    }
    public void setSlices(int slices){
        this.slices = slices;
    }

    //Things you can do with the Pizza object
    // Advertise()
    // Eat()
    public void displayPizza(){
        //System.out.printf prints out with no actual return, so you must include escape \n in order to return something.
        System.out.printf("This is a %s pizza with %d slices \n", this.name, this.slices);
    }

    //method that alters objects and object attributes
    //cause objects to interact by using getters and setters already created.
    public void pizzaFight(Pizza otherPizza){
        int otherSlices = otherPizza.getSlices();
        otherPizza.setSlices(otherPizza.getSlices() + 1);
        otherPizza.setSlices(otherSlices - 1);
        System.out.println(this.name + "just took a slice out of " + otherPizza.getName());
        System.out.println(otherPizza.getName() + "now has " + otherPizza.getSlices() + " slices.");
    }
    
    //Static affixes a method to the class itself, and not the object.
    public static void advertise(){
        System.out.println("Hey, come to my pizza shop");
    }
}