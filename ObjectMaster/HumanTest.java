public class HumanTest {
    public static void main(String[] args){

        Human aHuman = new Human(); 
        Human target = new Human(); 

        System.out.println(aHuman);
        System.out.println(target);

        aHuman.attack(target);

    }
}