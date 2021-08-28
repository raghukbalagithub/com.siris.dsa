package strings;



public class StringPalindrome {

    public void isPalUsingStringBuilder(String str){
        String str1 = str;
        StringBuilder str2=new StringBuilder(str1);
        str2=str2.reverse();

        if(str1.equals(str2.toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    public void isPalOptimized(String str) {
        int begin = 0;
        int end = str.length()-1;

        while(begin < end) {
            if(str.charAt(begin) != str.charAt(end)) {
                System.out.println("Not Palindrome");
                System.exit(1);
            } else {
                begin++;
                end--;
            }
        }

        System.out.println("Palindrome");
    }

    public static void main(String[] args) {
        String str1 = "ABCBA";

        StringPalindrome strPal = new StringPalindrome();
        strPal.isPalUsingStringBuilder(str1);
        strPal.isPalOptimized(str1);

    }
}


