package recursion;

public class DecimalToBinary {

    public static void main(String args[]) {
        int decimalNumber = 10;

        DecimalToBinary dtb = new DecimalToBinary();

        System.out.print("\nBinary form of " +decimalNumber +" is: ");
        dtb.getDecimal(decimalNumber);

        decimalNumber = 7;
        System.out.print("\nBinary form of " +decimalNumber +" is: ");
        dtb.getDecimal(decimalNumber);


        decimalNumber = 15;
        System.out.print("\nBinary form of " +decimalNumber +" is: ");
        dtb.getDecimal(decimalNumber);

        decimalNumber = 14;
        System.out.print("\nBinary form of " +decimalNumber +" is: ");
        dtb.getDecimal(decimalNumber);
    }

    public void getDecimal(int num) {
        //base condition
        if(num == 0) {
            return;
        }
        //logic
        getDecimal(num/2);
        System.out.print(num%2);
    }
}
