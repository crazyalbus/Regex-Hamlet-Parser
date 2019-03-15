import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameReplaceTools {

    public static String exactMatch(String nameToSearchFor, String nameToSubstitute, String textToSearch) {
        Pattern p = Pattern.compile(nameToSearchFor);
        Matcher m = p.matcher(textToSearch);
        return m.replaceAll(nameToSubstitute);
    }

    public static String allUpperCaseMatch(String nameToSearchFor, String nameToSubstitute, String textToSearch) {
        Pattern p = Pattern.compile(nameToSearchFor.toUpperCase());
        Matcher m = p.matcher(textToSearch);
        return m.replaceAll(nameToSubstitute.toUpperCase());
    }

    public static boolean findName(String nameToSearchFor, String textToSearch) {
        Pattern p = Pattern.compile(nameToSearchFor);
        Matcher m = p.matcher(textToSearch);
        return m.find();
    }

}
