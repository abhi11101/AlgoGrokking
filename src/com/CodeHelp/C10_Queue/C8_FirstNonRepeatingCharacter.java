package com.CodeHelp.C10_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class C8_FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        findFirstNonRepeatingCharacter("aabc");
        findFirstNonRepeatingCharacter("zz");
        findFirstNonRepeatingCharacter("zarcaazrd");
    }

    public static void findFirstNonRepeatingCharacter(String stream) {

        Queue<Character> queue = new LinkedList<>();
        int[] freq = new int[26];
        StringBuilder ans = new StringBuilder();

        for (char c : stream.toCharArray()) {

            freq[c - 'a']++;
            queue.add(c);

            while (!queue.isEmpty() && freq[queue.peek() - 'a'] >1) {
                queue.poll();
            }

            if (queue.isEmpty()) {
                ans.append("#");
            }else{
                ans.append(queue.peek());
            }

        }
        System.out.println(ans);

    }
}
