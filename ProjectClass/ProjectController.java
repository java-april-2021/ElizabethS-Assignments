public class ProjectController {
    public static void main(String[] args){
        Project p = new Project();
        Description d = new Description();

        String name = p.proj();
        String descriptionWithName = p.description(name + description);
        System.out.println(descriptionWithName);

        // if (name.equals("") || name.equals("")){
        //     System.out.println(name);

        // } else{
        //     System.out.println(name + description);
        // }
    }  
}

