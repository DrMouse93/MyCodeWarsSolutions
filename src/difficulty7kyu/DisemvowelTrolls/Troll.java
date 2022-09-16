package difficulty7kyu.DisemvowelTrolls;

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeuioAEUIO]", "");
    }
}
