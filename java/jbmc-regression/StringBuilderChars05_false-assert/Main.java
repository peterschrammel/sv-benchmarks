/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/jbmc-strings/StringBuilderChars05
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main
{
   public static void main(String[] args)
   {
      if(args.length < 1 || args[0] == null)
        return;

      StringBuilder buffer = new StringBuilder(args[0]);
      buffer.setCharAt(0, 'H');
      buffer.setCharAt(6, 'T');
      assert buffer.toString().equals("HiffBllTe Limited");
   }
}
