package difficulty6kyu.SumOfDigits_DigitalRoot;

public class DRoot {

    public static int digital_root(int n) {
        String number = "" + n;
        int answer = number.chars().map(Character::getNumericValue).sum();

        if ((answer + "").length() > 1) answer = digital_root(answer);

        return answer;
    }
}
