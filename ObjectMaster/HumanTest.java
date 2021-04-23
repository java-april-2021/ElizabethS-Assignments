public class HumanTest {
    public static void main(String[] args){

        Human aHuman = new Human(); 
        Human target = new Human(); 
        Samurai aSamurai = new Samurai();
        Wizard aWizard = new Wizard();
        Ninja aNinja = new Ninja();

        System.out.println(aHuman);
        System.out.println(target);

        aHuman.attack(target);
        aSamurai.meditate();

    }
}