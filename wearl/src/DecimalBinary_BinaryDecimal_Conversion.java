public class DecimalBinary_BinaryDecimal_Conversion {

    // Decimal to Binary
    public static String decimalToBinary(int num) {
        StringBuilder binary = new StringBuilder();
        while (num > 0) {
            binary.append(num % 2);  // remainder store karo
            num /= 2;                // divide by 2
        }
        return binary.reverse().toString(); // reverse because LSB first aata hai
    }

    // Binary to Decimal
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        int decimal = 25;
        String binary = decimalToBinary(decimal);
        System.out.println("Decimal " + decimal + " -> Binary: " + binary);

        String bin = "11001";
        int dec = binaryToDecimal(bin);
        System.out.println("Binary " + bin + " -> Decimal: " + dec);
    }
}
