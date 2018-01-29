/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/jbmc-strings/SubString01
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main
{
    public static void main(String[] args)
    {
        String letters = "automatictestcasegenerationatdiffblue";

        String tmp=org.cprover.CProverString.substring(letters, 20);
        assert tmp.equals("erationatdiffblue");
        tmp=org.cprover.CProverString.substring(letters, 9, 13);
        assert tmp.equals("test");
    }
}
