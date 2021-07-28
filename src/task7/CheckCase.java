package task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckCase {
    Pattern pattern = Pattern.compile("^[A-Z].*\\.$");
   // Matcher matcher = pattern.matcher("");


    public boolean check(String str){
        Matcher matcher = pattern.matcher(str);

        return matcher.find();
    }
}
