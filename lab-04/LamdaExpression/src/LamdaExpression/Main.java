package LamdaExpression;
import StringChecker.StringChecker;

public class Main {

    public static void main(String[] args) {
        System.out.println("Using lamda expression");
        String betterOne = StringChecker.betterString("Mohamed","Ayman",(s1,s2)->s1.length()>s2.length());
        System.out.println(betterOne);
        System.out.println("Using Method refernce");
        String betterOne2 = StringChecker.betterString("Mohamed","Ayman",StringChecker::functionWillbeSentAsLamda);
        System.out.println(betterOne2);
        System.out.println("Using Method refernce");
        String betterOne3 = StringChecker.containLetter("M1o2hamed",StringChecker::isCharachter);
        System.out.println(betterOne3);
    }
}
