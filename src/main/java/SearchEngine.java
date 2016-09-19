import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The class contains a string search algorithm, it will find the first occurrence of a word in a text string.
 *
 * @autor JuanaRodriguez on 9/2/2016.
 */
public class SearchEngine {
    /**
     * @param needle   is the search word
     * @param haystack is the whole text
     * @return the start position if the word is found, if no match return -1
     */
    public int find(String needle, String haystack) {
        final String regex = "\\Q" + needle.replaceAll("_", "\\\\E.\\\\Q") + "\\E";
        Matcher matcher = Pattern.compile(regex).matcher(haystack);
        return matcher.find() ? matcher.start() : -1;
    }
}
