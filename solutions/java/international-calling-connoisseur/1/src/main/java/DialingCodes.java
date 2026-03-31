import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

    private Map<Integer, String> countryCodeMap = new HashMap<>();
    private Map<String, Integer> reversedMap = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return countryCodeMap;
    }

    public void setDialingCode(Integer code, String country) {
        countryCodeMap.put(code, country);
        reversedMap.put(country, code);
    }

    public String getCountry(Integer code) {
        return countryCodeMap.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (!countryCodeMap.containsKey(code) && !reversedMap.containsKey(country)) {
            setDialingCode(code, country);
        }
    }

    public Integer findDialingCode(String country) {
        return reversedMap.get(country);
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer existingCode = reversedMap.get(country);
        if(existingCode != null) {
            countryCodeMap.put(code, country);
            reversedMap.put(country, code);
            countryCodeMap.remove(existingCode);
        }
    }
}
