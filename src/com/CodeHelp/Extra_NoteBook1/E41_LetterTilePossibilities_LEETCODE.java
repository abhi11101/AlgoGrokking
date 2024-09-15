package com.CodeHelp.Extra_NoteBook1;

import java.util.HashSet;

/*
https://leetcode.com/problems/letter-tile-possibilities/description/
 */
public class E41_LetterTilePossibilities_LEETCODE {

    public static void main(String[] args) {

        System.out.println(numTilePossibilities("AAB"));
        System.out.println(fasterApproach("AAB"));
    }

    public static int fasterApproach(String tiles){

        int[] freq = new int[26];

        for (char c : tiles.toCharArray()) {
            freq[c - 'A']++;
        }

        return helperFaster(freq);

    }

    public static int helperFaster(int[] freq){

        int count =0;
        for (int i=0;i<26;i++){

            if (freq[i]==0)continue;

            freq[i]--;
            count++;
            count+= helperFaster(freq);
            freq[i]++;
        }

        return count;
    }

    public static int numTilePossibilities(String tiles) {

        boolean[] track = new boolean[tiles.length()];


        return helper(tiles,track,new StringBuilder(),new HashSet<String>());


    }

    public static int helper(String tiles, boolean[] track, StringBuilder sb, HashSet<String> set) {

        for (int i = 0; i < tiles.length(); i++) {

            if (!track[i]){

                sb.append(tiles.charAt(i));
                track[i] = true;
                set.add(sb.toString());
                helper(tiles,track,sb,set);
                sb.deleteCharAt(sb.length()-1);
                track[i] = false;

            }


        }
        return set.size();
    }


}
