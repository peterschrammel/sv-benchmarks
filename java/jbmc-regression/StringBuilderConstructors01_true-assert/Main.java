/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/jbmc-strings/StringBuilderConstructors01
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main
{
   public static void main(String[] args)
   {
      if(args.length < 1 || args[0] == null || args[0].length() < 1)
        return;

      StringBuilder buffer1 = new StringBuilder();
      StringBuilder buffer2 = new StringBuilder(10);
      StringBuilder buffer3 = new StringBuilder(args[0]);

      assert buffer1.length()==0;
      assert buffer2.length()==0;
      assert buffer3.length()>0;
   }
}
