public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("10 + 9 = " + calc.add(10, 9));
        System.out.println("10 - 8 = " + calc.subtract(10, 8));
    }
}
