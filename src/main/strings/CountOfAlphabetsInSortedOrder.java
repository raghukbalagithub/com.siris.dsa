package strings;
public class CountOfAlphabetsInSortedOrder {
    public static void main(String[] args) {
        String str = "geeksforgeeks";

        int[] count = new int[26];

        for(int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }

        for(int j=0; j<count.length; j++) {
            //System.out.println("j = " +j);
            if(count[j] > 0) {
                System.out.println((char)(j+'a') + " count = " +count[j]);
            }
        }
    }
}
