import org.junit.Assert;
import org.junit.Before;
import sample.Main;

import java.util.Map;

import static org.junit.Assert.*;

public class WordTest {

    public void counter_stringA_returnOne() throws Exception {
        Main counter = null;
        Map<String, Integer> countA = counter.buildWordMap("C:/users/David/documents/MacBeth.txt");
        Assert.assertEquals(100, countA);
    }

    @Before
    public void count_stringAA_string_returnTwo () throws Exception {
        Main counter = null;
        Map<String, Integer> countA = counter.buildWordMap("C:/users/David/documents/MacBeth.txt");
        Assert.assertEquals(200, countA);

    }
}