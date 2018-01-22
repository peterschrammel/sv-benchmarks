public class Main {
    int x;
    Main(int x) { this.x = x; }

    public static void main(String[] args) {
        int i;
        Main[] tests = new Main[30];
        for(i = 0; i < 30; ++i) {
            tests[i] = new Main(i);
        }
        assert i == tests[0].x;
    }
}
