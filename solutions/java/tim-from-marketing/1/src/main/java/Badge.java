class Badge {
    // === Declared here so all methods in the class can see it
    StringBuilder builder = new StringBuilder();
    
    public String print(Integer id, String name, String department) {
        // === TASK 1 
        if (id != null){
            prependId(id);
        }
        
        // We will always have a name
        builder.append(name + " - ");
        
        // The employee is either an owner or a member of a department
        if (department == null){
            builder.append("OWNER");
        } else {
            builder.append(department.toUpperCase());
        }
        return builder.toString();
    }

    // Before we do anything else, we have to know
    // whether to add the [id] prefix or not
    public void prependId(Integer id){
        builder.append("[");
        builder.append(id);
        builder.append("] - ");
    }

}
