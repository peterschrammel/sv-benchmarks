/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/jbmc-strings/TokenTest02
 * The benchmark was taken from the repo: 24 January 2018
 */
import java.util.StringTokenizer;

public class Main
{
   public static void main(String[] args)
   {
      if(args.length < 1 || args[0] == null)
        return;

      String sentence = args[0];
      String[] tokens = sentence.split(" ");
 
      int i=0;
      for (String token : tokens)
      {
         if (i==3) assert token.equals("genneration");
         ++i;
      }
   }
}
