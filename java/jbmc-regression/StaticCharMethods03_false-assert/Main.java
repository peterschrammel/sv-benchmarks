/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/jbmc-strings/StaticCharMethods03
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main
{
   public static void main(String[] args)
   {
      if(args.length < 1 || args[0] == null || args[0].length() < 1)
        return;
      char c = args[0].charAt(0);
      assert Character.isDefined(c)==false;
   }
}
