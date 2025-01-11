package PrefixSum;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.TreeMap;

/*
Problem şu:
- Bir sayı dizisi veriliyor, bir de hedef sayı (k) veriliyor
- Bizden istenen: Bu dizide yan yana olan sayıların toplamı k'ya eşit olan kaç farklı alt dizi var?

nums = [1, 2, 3], k = 3

Bu dizide toplamı 3 olan alt dizileri bulalım:
- [1, 2] -> toplam = 3 ✓ (bir tane bulduk)
- [3] -> toplam = 3 ✓ (iki tane oldu)
- [1] -> toplam = 1 ✗
- [2] -> toplam = 2 ✗
- [1, 2, 3] -> toplam = 6 ✗

Cevap: 2 (çünkü toplamı 3 olan iki alt dizi var)
 */

/*


Örnek:
```java
arr = [1,2,1,3], k = 3

Toplamı ≤ 3 olan subarrayler:
[1] -> toplam = 1 ✓
[2] -> toplam = 2 ✓
[1] -> toplam = 1 ✓
[3] -> toplam = 3 ✓
[1,2] -> toplam = 3 ✓
[2,1] -> toplam = 3 ✓
[1,3] -> toplam = 4 ✗

Cevap: 6 subarray var
```

Önce brute force çözümü yazmayı deneyelim mi? Önceki çözümü nasıl modifiye edebiliriz?
 */
public class SubarraySumEqualsK {
    public int solutionBrute(int[] arr, int k) {
        int count =0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) count++;
            }
        }
        return count;
    }

    public int solution(int[] arr, int k) {
        HashMap<Integer, Integer> prefixSums = new HashMap<>();
        int count = 0;
        int sum = 0;

        // Başlangıç durumu için
        prefixSums.put(0, 1);

        // Kodunuzu buraya yazın
        for (int i = 0; i < arr.length; i++) {
           sum += arr[i];

           if (prefixSums.containsKey(sum - k)) {
               count += prefixSums.get(sum-k);
           }
            prefixSums.put(sum, prefixSums.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public int example2(int[] arr, int k) {
        TreeMap<Integer, Integer> prefixSums = new TreeMap<>();
        int count = 0;
        int sum = 0;

        prefixSums.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            for (int prefixSum : prefixSums.keySet()) {
                if (sum - prefixSum <= k) {
                    count += prefixSums.get(prefixSum);
                }
            }

            prefixSums.put(sum, prefixSums.getOrDefault(sum, 0) + 1);
        }

        return count;
    }


}
