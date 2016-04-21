import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Anagram {
  public static void main(String[] arg) {}

  public static Boolean isAnagram(String input) {
    String[] anagramList = input.split(" ");
    System.out.println(anagramList[0]);
    System.out.println(anagramList[1]);
    return anagramList[0].equals(anagramList[1]);
  }
}
