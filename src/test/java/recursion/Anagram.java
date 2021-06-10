package recursion;

public class Anagram {

    static int totalCount;

    public static void main(String args[]) {
        String s = "ABCD";
        Anagram anagram = new Anagram();
        anagram.permute(s, 0);
        System.out.println("No. of Anagrams: " +totalCount);
    }

    public void permute(String s, int i) {
        //base condition
        if(i == (s.length()-1)) {
            System.out.println(s);
            ++totalCount;
            return;
        }
        //logic
        for(int j=i; j<s.length(); j++) {
            s = swap(s, i, j);
            permute(s, i+1);
            s = swap(s, i, j);
        }
    }

    public String swap(String s, int i, int j) {
        char[] str = s.toCharArray();

        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;

        return String.valueOf(str);
    }
}
