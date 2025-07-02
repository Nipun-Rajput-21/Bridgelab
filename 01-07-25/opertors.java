public class opertors {
    public static void main(String[] args) {
        // Arithmetic operator
        int a = 5, b = 2;
        System.out.println("Sum: " + (a + b));

        // Relational operator
        System.out.println("Is a greater than b? " + (a > b));

        // Logical operator
        boolean x = true, y = false;
        System.out.println("x and y: " + (x && y));

        // Assignment operator
        int c = 10;
        c = c + 3;
        System.out.println("Value of c: " + c);

        // Unary operator
        int d = 4;
        d++;
        System.out.println("d after increment: " + d);

        // Conditional operator
        int max = (a > b) ? a : b;
        System.out.println("Max is: " + max);
    }
}
