package ArrayString;
/*
İki string veriliyor: word1 ve word2
Bu stringleri sırayla karakterleri alarak birleştirmemiz gerekiyor
Örneğin:

word1 = "abc", word2 = "pqr" ise
Sonuç: "apbqcr" olmalı



Çözüm stratejisi:

İki string'in karakterlerini sırayla alacağız
İki pointer kullanabiliriz (two pointers yaklaşımı)
Eğer bir string biterse, diğer string'in kalan karakterlerini ekleriz.
 */
public class MergeString {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder(word1.length() + word2.length());
        int i = 0;
        int length = Math.max(word1.length(), word2.length());

        while (i < length ) {
            if (i < word1.length()) result.append(word1.charAt(i));
            if (i < word2.length()) result.append(word2.charAt(i));
            i++;
        }
        return result.toString();
    };
}
