/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/jbmc-strings/StringCompare05
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main
{
   public static void main(String[] args)
   {
      if(args.length < 1 || args[0] == null)
        return;
      String string = args[0];

      String s1 = new String(string);
      if (s1 == string)  // false; they are not the same object
         assert true;
      else
         assert false;
   }
}
