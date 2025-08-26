public class Main {

    public static void main(String[] args) {
        myint(8);
    }
    static int myint(int i) {
        int prev = 0, prev2 = 1;
        for (int j = 0; j < i; j++) {
            int newfib = prev + prev2;
            System.out.println(newfib);
            prev2 = prev;
            prev = newfib;
        }
        return 0;
    }
}