import java.util.ArrayList;
import java.util.Arrays;
import org.junit.*;
import static org.junit.Assert.*;

public class AnagramTest {

  @Test
    public void isAnagram_forInputSplitIntoArray_False(){
      Anagram anagram = new Anagram();
      assertEquals(false, Anagram.isAnagram("dogs cats"));
    }

}
