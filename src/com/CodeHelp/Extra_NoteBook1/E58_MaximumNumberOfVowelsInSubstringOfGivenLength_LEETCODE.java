package com.CodeHelp.Extra_NoteBook1;

/*

 */
public class E58_MaximumNumberOfVowelsInSubstringOfGivenLength_LEETCODE {

    public static void main(String[] args) {

        System.out.println(maxVowels("abciiidef",3));
        System.out.println(maxVowels("aeiou",2));
        System.out.println(maxVowels("leetcode",2));
    }

    public static int maxVowels(String s, int k) {

        if (s.length()<k)return 0;

        int[] vowelFreq = new int[26];

        vowelFreq['a'-'a'] = 1;
        vowelFreq['e'-'a'] = 1;
        vowelFreq['i'-'a'] = 1;
        vowelFreq['o'-'a'] = 1;
        vowelFreq['u'-'a'] = 1;

        int index =0;
        int max =0;
        int count = 0;
        char[] sChar = s.toCharArray();
        while (index<k) {
            if (vowelFreq[sChar[index]-'a'] == 1) {
                count++;
            }
            index++;
        }
        if (count>max)max=count;

        while (index<sChar.length) {

            char newChar = sChar[index];
            if (vowelFreq[newChar-'a'] == 1)count++;

            char oldChar = sChar[index-k];
            if (vowelFreq[oldChar-'a'] == 1)count--;

            if (count>max)max=count;
            index++;
        }

        return max;
    }

}
