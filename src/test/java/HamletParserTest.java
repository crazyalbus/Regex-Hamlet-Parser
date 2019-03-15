import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        //Given
        String nameToSearchFor = "Hamlet";
        String nameToSubstitute = "Leon";
        String newHamlet = "";

        //When
        newHamlet = NameReplaceTools.exactMatch(nameToSearchFor, nameToSubstitute, hamletText);
        newHamlet = NameReplaceTools.allUpperCaseMatch(nameToSearchFor, nameToSubstitute, newHamlet);

        Boolean containsHamlet = NameReplaceTools.findName(nameToSearchFor, newHamlet);
        Boolean containsHAMLET = NameReplaceTools.findName(nameToSearchFor.toUpperCase(), newHamlet);
        //Then
        Assert.assertFalse(containsHamlet);
        Assert.assertFalse(containsHAMLET);

    }

    @Test
    public void testChangeHoratioToTariq() {
        //Given
        String nameToSearchFor = "Horatio";
        String nameToSubstitute = "Tariq";
        String newHamlet = "";

        //When
        newHamlet = NameReplaceTools.exactMatch(nameToSearchFor, nameToSubstitute, hamletText);
        newHamlet = NameReplaceTools.allUpperCaseMatch(nameToSearchFor, nameToSubstitute, newHamlet);

        Boolean containsHoratio = NameReplaceTools.findName(nameToSearchFor, newHamlet);
        Boolean containsHORATIO = NameReplaceTools.findName(nameToSearchFor.toUpperCase(), newHamlet);
        //Then
        assertFalse(containsHORATIO);
        assertFalse(containsHORATIO);

    }

    @Test
    public void testFindHoratio() {
        //Given
        String nameToSearchFor = "Horatio";

        //When
        Boolean containsHoratio = NameReplaceTools.findName(nameToSearchFor, hamletText);
        Boolean containsHORATIO = NameReplaceTools.findName(nameToSearchFor.toUpperCase(), hamletText);

        //Then
        Assert.assertTrue(containsHoratio);
        Assert.assertTrue(containsHORATIO);

    }

    @Test
    public void testFindHamlet() {
        //Given
        String nameToSearchFor = "Hamlet";

        //When
        Boolean containsHamlet = NameReplaceTools.findName(nameToSearchFor, hamletText);
        Boolean containsHAMLET = NameReplaceTools.findName(nameToSearchFor.toUpperCase(), hamletText);

        //Then
        Assert.assertTrue(containsHamlet);
        Assert.assertTrue(containsHAMLET);

    }
}
