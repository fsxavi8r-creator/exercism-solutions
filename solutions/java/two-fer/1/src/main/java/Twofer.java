public class Twofer {
    public String twofer(String name) {
        
        String placeholder = new String();
        
        if (name == null || name.isEmpty()) {
            placeholder = "you";
        } else {
            placeholder = name;
        }
        
        return "One for " + placeholder + ", one for me.";
    }
}
