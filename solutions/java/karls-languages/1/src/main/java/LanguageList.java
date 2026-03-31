import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languageList = new ArrayList<>();

    public boolean isEmpty() {
        return languageList.isEmpty();
    }

    public void addLanguage(String language) {
        languageList.add(language);
    }

    public void removeLanguage(String language) {
        languageList.remove(language);
    }

    public String firstLanguage() {
        return languageList.get(0);
    }

    public int count() {
        return languageList.size();
    }

    public boolean containsLanguage(String language) {
        return languageList.contains(language);
    }

    public boolean isExciting() {
        return (languageList.contains("Java") || languageList.contains("Kotlin"));
    }
}
