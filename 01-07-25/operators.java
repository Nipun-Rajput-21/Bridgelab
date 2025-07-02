public class opertors {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Assignment Operators
        int c = 5;
        System.out.println("\nAssignment Operators:");
        c += 2;
        System.out.println("c += 2: " + c);
        c -= 1;
        System.out.println("c -= 1: " + c);
        c *= 3;
        System.out.println("c *= 3: " + c);
        c /= 2;
        System.out.println("c /= 2: " + c);
        c %= 2;
        System.out.println("c %= 2: " + c);

        // Unary Operators
        int d = 7;
        System.out.println("\nUnary Operators:");
        System.out.println("d++: " + (d++));
        System.out.println("++d: " + (++d));
        System.out.println("d--: " + (d--));
        System.out.println("--d: " + (--d));

        // Conditional Operator
        int max = (a > b) ? a : b;
        System.out.println("\nConditional Operator:");
        System.out.println("Max of a and b: " + max);
    }
}
