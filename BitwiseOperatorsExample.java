public class BitwiseOperatorsExample {
    public static void main(String[] args) {
        // Bitwise AND (&)
        int a = 5;  // Binary representation: 0101
        int b = 3;  // Binary representation: 0011
        int resultAnd = a & b;  // Binary representation: 0001 (1 in decimal)
        System.out.println("Bitwise AND: " + resultAnd);  // Output: 1

        // Bitwise OR (|)
        int resultOr = a | b;  // Binary representation: 0111 (7 in decimal)
        System.out.println("Bitwise OR: " + resultOr);  // Output: 7

        // Bitwise XOR (^)
        int resultXor = a ^ b;  // Binary representation: 0110 (6 in decimal)
        System.out.println("Bitwise XOR: " + resultXor);  // Output: 6

        // Bitwise complement (~)
        int resultComplementA = ~a;  // Binary representation: 11111111111111111111111111111010 (-6 in decimal)
        int resultComplementB = ~b;  // Binary representation: 11111111111111111111111111111100 (-4 in decimal)
        System.out.println("Bitwise complement of a: " + resultComplementA);  // Output: -6
        System.out.println("Bitwise complement of b: " + resultComplementB);  // Output: -4

        // Left shift (<<)
        int num = 5;  // Binary representation: 0000 0101
        int leftShifted = num << 2;  // Binary representation after left shift by 2: 0001 0100 (20 in decimal)
        System.out.println("Left shifted by 2: " + leftShifted);  // Output: 20

        // Right shift (>>)
        int rightShifted = num >> 2;  // Binary representation after right shift by 2: 0000 0001 (1 in decimal)
        System.out.println("Right shifted by 2: " + rightShifted);  // Output: 1

        // Unsigned right shift (>>>)
        int unsignedRightShifted = -5 >>> 2;  // Binary representation after unsigned right shift by 2: 0011 1111 1111 1111 1111 1111 1111 1101 (1073741821 in decimal)
        System.out.println("Unsigned right shifted by 2: " + unsignedRightShifted);  // Output: 1073741821
    }
}
