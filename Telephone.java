public class Telephone {
    public static void main(String[] arg) {
        int num = 3;
        num = subNum(num);
        num = modNum(num);
        num = (int)squareRoot(num);
        num = expNum(num);


    }

    public static int subNum(int y) {
        return 20 - y;
    }

    public static int modNum(int z) {
        return z % 10;
    }

    public static double squareRoot(int s) {
        return (int) Math.sqrt(s);
    }
    
    public static int expNum(int k) {
        return (int) Math.pow(k, 4);
    }
}
