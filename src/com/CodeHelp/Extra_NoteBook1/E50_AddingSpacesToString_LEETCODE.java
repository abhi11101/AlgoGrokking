package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/adding-spaces-to-a-string/description/
 */
public class E50_AddingSpacesToString_LEETCODE {

    public static void main(String[] args) {

        int[] spaces = {8,13,15};
        System.out.println(addSpaces("LeetcodeHelpsMeLearn",spaces));
        System.out.println(faster("LeetcodeHelpsMeLearn",spaces));

    }

    public static String faster(String s, int[] spaces) {

        char[] charArray = new char[s.length() + spaces.length];
        int spaceCount=0;
        for (int x : spaces){
            charArray[x+spaceCount] = ' ';
            spaceCount++;
        }

        int charArrayIndex = 0;
        int sIndex = 0;

        while (sIndex < s.length() && charArrayIndex < charArray.length){

            if (charArray[charArrayIndex] != ' '){
                charArray[charArrayIndex] = s.charAt(sIndex);
                sIndex++;
            }
            charArrayIndex++;

        }
        return new String(charArray);

    }
    public static String addSpaces(String s, int[] spaces) {

        StringBuilder sb = new StringBuilder();
        int prevIndex =0;
        for (int i =0; i<spaces.length;i++){
            int index = spaces[i];
            sb.append(s.substring(prevIndex,index ) + " ");
            prevIndex = index;
        }
        if (prevIndex<s.length()){
            sb.append(s.substring(prevIndex));
        }
        return sb.toString();
    }


}
