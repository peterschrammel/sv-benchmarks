/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/jbmc-strings/StringMiscellaneous02
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main
{
   public static void main(String[] args)
   {
      if(args.length < 1 || args[0] == null)
        return;

      String s1 = args[0];
      assert s1.length()==24;
   }
}
