public class Twofer {

    public String twofer(String name) {
        String placeholder = new String();        
        placeholder = (name == null || name.isEmpty()) ? "you" : name;
        return "One for " + placeholder + ", one for me.";
    }

}
