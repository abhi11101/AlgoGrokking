package com.DSA.CharacterAndString;

public class ReverseWordsInString {
    public static void main(String[] args) {
        System.out.println(reverseWords("a good example"));
    }
    public static String reverseWords(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')count++;
        }
        if(count==0)return s;
        else{
            String[] res = new String[2*count+1];
            String val="";
            int index=0;
            System.out.println("Count "+ count);
            System.out.println("Res size "+ res.length);
            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
       //         System.out.println("Val "+ val);
                if(s.charAt(i)!=' ')val+=c;
                if(s.charAt(i)==' ' || i==s.length()-1){
                    System.out.println("Val "+ val);
                    res[index++]=val;
                    if(index!=res.length)res[index++]=" ";
                    val="";
                }
            }
            for (String x : res){
                System.out.print(x + " ");
            }
            System.out.println();
            int n =res.length;
            for(int i=0;i<n/2;i++){
                String temp = res[i];
                System.out.println("res["+i+"] "+ res[i]);
                System.out.println("res[n-i-1] " + res[n-i-1]);
                res[i]=res[n-i-1];
                res[n-i-1]=temp;
            }
            val="";
            for(String temp : res){
                val+=temp;
            }
            return val;
        }

    }
}
