package task19;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNamesInSourceCode {

    public String findAllClassNames(){

        Pattern pattern = Pattern.compile(".*class\\s.*\\{");
        String classes = "";
        String temp = "notNull";
        Matcher matcher = pattern.matcher("");

        try{
            FileReader fileReader = new FileReader("E:\\University\\Programming\\JavaDirectory\\Strings\\src\\Main.java");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while (temp != null){
                temp = bufferedReader.readLine();
                if (temp != null) matcher.reset(temp);

                if (matcher.find()){
                    classes += temp.replaceAll("\\{","") + '\n';
                }
            }



        } catch (IOException e){
            e.printStackTrace();
        }

        return classes;
    }
}
