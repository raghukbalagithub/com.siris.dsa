package strings;

import java.util.Scanner;

public class Anagram {

    public void isAnagram(String ref, String tar) {
        int[] counts = new int[256];

        if(ref.length() != tar.length()) {
            System.out.println("Target string: " +tar +" is not an anagram of Reference string: " +ref);
            System.exit(1);
        }

        for(int i=0; i<tar.length(); i++) {
            counts[tar.charAt(i)]++;
            counts[ref.charAt(i)]--;
        }

        for(int i=0; i<counts.length; i++) {
            if(counts[i] != 0) {
                System.out.println("Target string: " +tar +" is not an anagram of Reference string: " +ref);
                System.exit(1);
            }
        }

        System.out.println("Target and Reference strings are Anagrams");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Reference String: ");
        String reference = scan.nextLine();

        System.out.println("Enter Target String: ");
        String target = scan.nextLine();

        Anagram anaObj = new Anagram();
        anaObj.isAnagram(reference, target);
    }
}