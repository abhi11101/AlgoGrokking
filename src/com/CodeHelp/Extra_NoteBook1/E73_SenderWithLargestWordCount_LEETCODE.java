package com.CodeHelp.Extra_NoteBook1;

import java.util.HashMap;
import java.util.Map;

/*
https://leetcode.com/problems/sender-with-largest-word-count/
 */
public class E73_SenderWithLargestWordCount_LEETCODE {

    public static void main(String[] args) {

        String[] messages = {"Hello userTwooo","Hi userThree","Wonderful day Alice","Nice day userThree"};
        String[] senders = {"Alice","userTwo","userThree","Alice"};
        System.out.println(largestWordCount(messages,senders));

        String[] msg2 = {"How is leetcode for everyone","Leetcode is useful for practice"};
        String[] senders2 = {"Bob","Charlie"};
        System.out.println(largestWordCount(msg2,senders2));

        String[] msg3 = {"p mmV","Lb WE u H x f YT","Rey","q","Y R","Ng","mP lo oA l jd y","CP y r N wHA","Bt l","Y S xv MNS","WG vz","S pl l Dz fX D TpI","zGq","z S D"};
        String[] senders3 = {"QMnVn","QMnVn","nkq","o","EEM","QMnVn","o","nkq","Gd","Gd","nkq","o","EEM","EEM"};
        System.out.println(largestWordCount(msg3,senders3));

        String[] msg4 = {"tP x M VC h lmD","D X XF w V","sh m Pgl","pN pa","C SL m G Pn v","K z UL B W ee","Yf yo n V U Za f np","j J sk f qr e v t","L Q cJ c J Z jp E","Be a aO","nI c Gb k Y C QS N","Yi Bts","gp No g s VR","py A S sNf","ZS H Bi De dj dsh","ep MA KI Q Ou"};
        String[] send4 = {"OXlq","IFGaW","XQPeWJRszU","Gb","HArIr","Gb","FnZd","FnZd","HArIr","OXlq","IFGaW","XQPeWJRszU","EMoUs","Gb","EMoUs","EMoUs"};
        System.out.println(largestWordCount(msg4,send4));

    }

    public static String largestWordCount(String[] messages, String[] senders) {


        int n = messages.length;
        if(n==1)return senders[0];
        Map<String,Integer> map = new HashMap<>();
        int maxFreq = 0;
        String ans = null;
        for (int i = 0; i < n; i++) {

            String senderKey = senders[i];

            int count = messages[i].length() - messages[i].replace(" ", "").length() + 1;

            map.put(senderKey, map.getOrDefault(senderKey, 0) + count);
            int currentFreq = map.get(senderKey);
            if (currentFreq > maxFreq || (currentFreq==maxFreq && senderKey.compareTo(ans)>0 )) {
                ans = senderKey;
                maxFreq = currentFreq;
            }
        }

        System.out.println(map);
        return ans;
    }
}
