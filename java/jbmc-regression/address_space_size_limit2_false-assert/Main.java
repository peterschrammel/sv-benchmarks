/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/address_space_size_limit2
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main {
    int x;
    Main(int x) { this.x = x; }

    public static void main(String[] args) {
        int size = args.length;
        if(size < 1)
          return;
        int i;
        Main[] tests = new Main[size];
        for(i = 0; i < size; ++i) {
            tests[i] = new Main(i);
        }
        assert i == tests[0].x;
    }
}
