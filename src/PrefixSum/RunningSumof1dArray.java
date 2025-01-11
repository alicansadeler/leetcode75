package PrefixSum;
/*
Problem:
- Input olarak bir integer array veriliyor
- Her index için, o indexe kadar olan sayıların toplamını içeren yeni bir array döndürmemiz gerekiyor

Örnek:
```
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
```

1. Yeni bir array oluşturmamız gerekir mi yoksa input array'i değiştirebilir miyiz?
2. İlk eleman için ne yapmalıyız?
3. Diğer elemanlar için nasıl bir işlem yapacağız?
 */
public class RunningSumof1dArray {
    public int[] solution1(int [] arr) {
        int[] result = new int[arr.length];

        result[0] = arr[0];

        for (int i=1; i < arr.length; i++) {
            result[i] = result[i - 1] + arr[i];
        }
        return result;
    }

    public int[] solution2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i -1];
        }
        return arr;
    }
}
