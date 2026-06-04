public class Telephone {
    public static void main(String[] arg) {
        int num = 5;
        num = subNum(num);
        num = modNum(num);
        num = (int)squareRoot(num);
        
    }

    public static int subNum(int y) {
        return 20 - y;
    }

    public static int modNum(int z) {
        return z % 10;
    }

    public static double squareRoot(int s) {
        return (int)Math.sqrt(s);
    }
    
}
