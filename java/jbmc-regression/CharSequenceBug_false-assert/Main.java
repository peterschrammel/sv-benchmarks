public class Main {
    public static void main(String[] args) {
        if (args.length < 1)
            return;
        String s = args[0];
        CharSequence target = "b";
        String replaced = "";
        if (target.length() == 1)
            replaced = s.replace('b', 'c');
        assert replaced.indexOf('b') != -1;
    }
}
