public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        String a = "0101";
        String b = "1010";
        String sumResult = bins.sum(a,b);
        System.out.println("Сумма чисел " + a + " + " + b + " = " + sumResult);
        String multResult = bins.mult(a,b);
        System.out.println("Произведение: " + a + " * " + b + " = " + multResult);
    }
}