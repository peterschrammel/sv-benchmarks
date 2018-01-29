/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/jbmc-strings/RegexSubstitution02
 * The benchmark was taken from the repo: 24 January 2018
 */
import java.util.Arrays;

public class Main
{
   public static void main(String[] args)
   {
      if(args.length < 2 || args[0] == null || args[1] == null)
        return;

      String firstString = args[0];
      String secondString = args[1];

      firstString = firstString.replaceAll("\\*", "^");

      secondString = secondString.replaceAll("Automatic", "Automated");

      System.out.printf(
         "\"Automatic\" substituted for \"Automated\": %s\n", secondString);
      secondString.equals("Automated Test Case Generation");

      System.out.printf("Every word replaced by \"word\": %s\n\n",
         firstString.replaceAll("\\w+", "word"));

      System.out.printf("Original String 2: %s\n", secondString);
      secondString.equals("Automated Test Case Generation");

      for (int i = 0; i < 3; i++)
         secondString = secondString.replaceFirst("\\A", "automated");

      System.out.print("String split at commas: ");
      String[] results = secondString.split(" \\s*");
      System.out.println(Arrays.toString(results));
      assert results[0].equals("automatedautomatedautomatedaAutomated");
   }
}
