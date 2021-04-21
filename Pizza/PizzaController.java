public class PizzaController{
    public static void main(String[] args) {
        //Create a new object (class name, variable name = new class name)
        //Seet attributes value parameters
        Pizza cheesePizza = 
            new Pizza("Cheese Pizza", 
            new String[] {"cheese"}, 'L', 10);
            //This is an instance.  The list is passing in perameters to the constructor over in the main program.
        Pizza hawaiian = new Pizza("Hawaiiian", 
            new String[] {"pineapple", "canadian bacon", "pepperoni", "jalapenos"}, 'L', 10);

            //set attributes (object.attribute = value)
            
            // cheesePizza.setSlices = (8);
            // System.out.println(cheesePizza.getslices());
            // cheesePizza.setName("");
            // System.out.println(cheesePizza.getName());
            // cheezePizza.setName("The best cheese pizza ever!")
            // System.out.println(cheesePizza.getName());

            // Another way to set attributes is once you set the delimiter you can:
            cheesePizza.displayPizza();

            Pizza.advertise();
            System.out.println(Pizza.totalPizzas);
            hawaiian.pizzaFight(cheesePizza);
    }
    
}