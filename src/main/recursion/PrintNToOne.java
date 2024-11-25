package recursion;

public class PrintNToOne {
    public static void main(String args[]) {
        PrintNToOne obj = new PrintNToOne();
        obj.printNTo1(10);
    }

    public void printNTo1(int num) {
        //base condition
        if(num == 0) {
            return;
        }
        //logic
        System.out.println(num);
        printNTo1(num-1);
    }
}

//T: Theta(n)
//Aux S: BigO(n)