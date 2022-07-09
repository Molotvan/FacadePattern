public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String result1 = bins.mult("1000", "10");
        String result2 = bins.sum("111", "10");
        System.out.println(result1 + " " + Integer.parseInt(result1, 2));
        System.out.println(result2 + " " + Integer.parseInt(result2, 2));
    }

}
