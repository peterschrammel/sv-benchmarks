/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/jbmc-strings/StaticCharMethods06
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main
{
   public static void main(String[] args)
   {
      if(args.length < 1 || args[0] == null || args[0].length() < 1)
        return;

      char c = args[0].charAt(0);
      Character c1 = c;
      Character c2 = c;

      if (c1.equals(c2))
      {
         System.out.println("c1 and c2 are equal\n");
         assert true;
      }
      else
      {
         System.out.println("c1 and c2 are not equal\n");
         assert false;
      }
   }
}
