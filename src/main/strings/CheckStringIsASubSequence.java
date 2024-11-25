package strings;
public class CheckStringIsASubSequence {

    public boolean isSubSequence(String str1, String str2, int strsize1, int strsize2) {
        if(strsize1 == 0) {
            return true;
        }
        if(strsize2 < strsize1) {
            System.out.println("Size of Reference String is smaller than Target String");
            return false;
        }
        int i = 0;
        int j = 0;

        while(i < strsize1) {
            if(j == strsize2) {
                return false;
            }
            if(str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        CheckStringIsASubSequence checkObj = new CheckStringIsASubSequence();
        System.out.println(checkObj.isSubSequence("ADE", "ABCDEFJ", 3, 7)?"SubSequence":"Not SubSequence");
        System.out.println(checkObj.isSubSequence("AJ", "ABCDEFJ", 2, 7)?"SubSequence":"Not SubSequence");
        System.out.println(checkObj.isSubSequence("AJF¸", "ABCDEFJ", 3, 7)?"SubSequence":"Not SubSequence");
        System.out.println(checkObj.isSubSequence("ABCDEFJ", "ABCDEFJH", 7, 8)?"SubSequence":"Not SubSequence");
        System.out.println(checkObj.isSubSequence("", "ABCDEFJ", 0, 7)?"SubSequence":"Not SubSequence");
    }
}
