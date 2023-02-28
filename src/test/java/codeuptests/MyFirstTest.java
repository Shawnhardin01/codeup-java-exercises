import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

public class MyFirstTest {
    @Test
    public void testCodeupString(){
        String codeup ="Codeup";
        assertSame("Codeup",codeup);
    }
    @Test
    public void testEmptyStringArrayList(){
        List<String> languages = new ArrayList<>();
        List<String> morelanguages = new ArrayList<>();

        assertNotSame(languages,morelanguages);
    }

}
