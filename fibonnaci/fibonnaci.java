public class fibonnaci {
    public static void start(int count) {
        int y[] = new int[count];
        y[0] = 0;
        y[1] = 1;
        y[2] = 1;
        for (int i = 0; i < y.length - 2; i++) {
            y[i+2] = y[i] + y[i+1];
        }
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }
    }

    public static void main(String [] args) {
        start(68);
    }
}
