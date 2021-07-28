package task10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Expressions {

    private String[] regexes = new String[]{
            "^Java", "\\Breg.*", "n.w\\s+h(a|i)s", "s?", "s*", "s+", "s{4}", "S{1}", "s{0,3}"};
    private String testString = "Java now has regular expressions";

    public boolean test(String regex){
       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(testString);

       return matcher.find();
    }


    public String[] getRegexes() {
        return regexes;
    }
}

