import AllInOneAlgo.Algos;

public class Test {
    public static void main(String[] args) {
        Algos alg = new Algos();
        alg.stop = 99;
        System.out.println(alg.GreatestCommonDivisor(48, 18));
    }
}
