package task19;

import java.io.*;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNamesInSourceCode {

    public String findAllClassNames() {

        Pattern pattern = Pattern.compile(".*class\\s.*\\{");
        Pattern patternImportClasses = Pattern.compile("import\\s.*;");
        Matcher matcher = pattern.matcher("");
        Matcher matcherImportClasses = patternImportClasses.matcher("");

        Properties properties = new Properties();

        String temp = "notNull";
        StringBuilder classes = new StringBuilder();



        try {
            FileInputStream stream = new FileInputStream("src\\app.properties");
            properties.load(stream);
            FileReader fileReader = new FileReader(properties.getProperty("path"));


            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while (temp != null) {
                temp = bufferedReader.readLine();
                if (temp != null) {
                    matcher.reset(temp);
                    matcherImportClasses.reset(temp);

                    if (matcher.find()) {
                        classes.append('\n').append((temp.replaceAll(".*class\\s", "")).replaceAll("\\{", "")).append('\n');

                    } else if (matcherImportClasses.find()) {
                        classes.append('\n').append(temp.replaceAll("import\\s", "")).append('\n');
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return classes.toString();
    }
}
