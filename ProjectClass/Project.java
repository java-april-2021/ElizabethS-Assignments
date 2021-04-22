public class Project {
    public String proj(String name){
        return createProject(name);
    }
    public String proj() {
        return createProject("My project");
    }
    
    public String proj(String description) {
        return createProject(name + " " + description);
    }

    private String createProject(String toBeCreated){
        return "My project" + toBeCreated + ", was successfully created";
    }


    public String getName() {
        return this.name;
    }
    public String getDescription() {
        return this.description;
    }


    public void setName(String name) {
        this.name = name; 
        }
        
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
}