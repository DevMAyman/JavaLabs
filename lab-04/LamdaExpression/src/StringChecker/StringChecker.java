package StringChecker;
import Interface.ITwoInputSingleOut;
import Interface.IsingleInputBooleanOut;

public class StringChecker {
    public  static boolean functionWillbeSentAsLamda(String s1, String s2){
        return s1.length()>s2.length();
    }
    public static String betterString(String s1, String s2, ITwoInputSingleOut iTwoInputSingleOut){
       if(iTwoInputSingleOut.filterString(s1,s2)){
           return s1;
        }
        else{
                return s2;
        }
    }

    public static boolean isCharachter(String s1){
        if(s1 != null){
            for(int i=0; i<s1.length();i++){
                if(! Character.isLetter(s1.charAt(i))) {
                    return false;
                }
            }
            return true;


        }
        else {
            return false;
        }
        }

        public static String containLetter(String s1, IsingleInputBooleanOut isingleInputBooleanOut){
        if(isingleInputBooleanOut.filterString(s1)){
            return "It contains letters only";
        }
        else{
            return "It does not contain letters only";
        }
    }
}
