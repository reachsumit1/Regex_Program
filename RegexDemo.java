package RegexProgram;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    ArrayList<String> list= new ArrayList<>();
    public void firstname(){
        list.add("Abhi");
        list.add("Sanay");
        list.add("Bridge");

        String regex = "[A-Z]{1}[a-z]{3,6}";
        Pattern pattern= Pattern.compile(regex);
        for(int i=0;i< list.size();i++){
            Matcher matcher= pattern.matcher(list.get(i));
            System.out.println("The first Name is: ");
            System.out.println(list.get(i)+ "->" +matcher.matches());
        }

    }
    public static void main(String[] args) {
        RegexDemo regexDemo=new RegexDemo();
        regexDemo.firstname();

    }
}
