class A {
    int i;
}

public class Main {
    public static void main(String[] args) {
        A a=null;
        try {
            int i=a.i;
        }
        catch (NullPointerException exc) {
            assert false;
        }
    }
}
