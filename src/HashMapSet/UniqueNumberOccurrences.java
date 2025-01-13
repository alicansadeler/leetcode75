package HashMapSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*

bir dizideki her sayının kaç kere tekrar ettiğini bulup, bu tekrar sayılarının benzersiz olup olmadığını kontrol etmemizi istiyor.

Örnek verelim:
```python
Input: arr = [1,2,2,1,1,3]
Output: true
# Açıklama: 1 sayısı 3 kez, 2 sayısı 2 kez, 3 sayısı 1 kez tekrar ediyor.
# Tekrar sayıları (1,2,3) benzersiz olduğu için true döner.
```
 */
public class UniqueNumberOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        int count = 0;
        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            result.put(arr[i], result.getOrDefault(arr[i], 0) + 1);
        }

        HashSet<Integer> unique = new HashSet<>(result.values());
        return result.size() == unique.size();
    }
}
