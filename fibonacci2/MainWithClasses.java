class mainfun {
    public void myint(int i) {
        int prev = 0, prev2 = 1;
        for (int j = 0; j < i; j++) {
            int newfib = prev + prev2;
            System.out.println(newfib);
            prev2 = prev;
            prev = newfib;
        }
    }    
}

class recursive {
    public int stop;
    public int jse=0, prev=0, prev2=1;

    public void isthis() {
        if (jse < stop) {
            int newfib = prev+prev2;
            System.out.println(newfib);
            prev2 = prev;
            prev=newfib;
            jse++;
            isthis();
        }
    }
}

public class MainWithClasses {
    public int js;

    public static void main(String[] args) {
        recursive fn = new recursive();
        fn.stop = 9;
        fn.isthis();
    }
}
