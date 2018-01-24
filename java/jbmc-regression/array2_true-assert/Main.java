/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/array2
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main {

  public void f(String[] args) {
    int unknown = args.length;
    int[] arr;
    if(unknown > 0)
      arr = new int[1];
    else
      arr = new int[0];

    if(unknown > 0)
      arr[0]=1;

    if(unknown > 0)
        assert arr.length == 1 && arr[0] == 1;
    else
        assert arr.length == 0;
  }

}
