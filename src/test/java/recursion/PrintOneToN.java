package recursion;

public class PrintOneToN {
    public static void main(String args[]) {
        PrintOneToN obj = new PrintOneToN();
        obj.print1ToN(10);
    }

    public void print1ToN(int num) {
        //base condition
        if(num == 0) {
            return;
        }
        //logic
        print1ToN(num-1);
        System.out.println(num);
    }
}

//T: Theta(n)
//Aux S: BigO(n)