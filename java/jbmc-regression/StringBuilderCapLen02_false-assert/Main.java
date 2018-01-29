/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/jbmc-strings/StringBuilderCapLen02
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main
{
   public static void main(String[] args)
   {
      if(args.length < 1 || args[0] == null)
        return;

      StringBuilder buffer = new StringBuilder(args[0]);
      assert buffer.toString().equals("Diffblue  is leader in automatic test case generation");
   }
}
