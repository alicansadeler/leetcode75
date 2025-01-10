package TwoPointers;
/*
İki string veriliyor, s ve t. String s'in string t'nin bir subsequence'ı olup olmadığını kontrol etmemiz gerekiyor.
Subsequence şu demek: s'in karakterleri t'de aynı sırayla (ama mutlaka ardışık olması gerekmeden) bulunmalı.
Örnek:

s = "abc", t = "ahbgdc" => true ("abc" karakterleri t'de aynı sırayla var)
s = "axc", t = "ahbgdc" => false ("axc" karakterleri aynı sırayla yok)
 */
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int tPointer = 0;
        int sPointer = 0;
        while(tPointer < t.length() && sPointer < s.length()) {
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            tPointer++;
        }
        return sPointer == s.length();
    }
}
