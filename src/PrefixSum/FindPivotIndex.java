package PrefixSum;

import java.util.Arrays;

/*
Bir tamsayı dizisi olan `nums` verildiğinde, bu dizinin pivot indeksini hesaplayın.

**Pivot indeksi**, bu indeksin **solunda yer alan tüm sayıların toplamı** ile **sağında yer alan tüm sayıların toplamının** birbirine eşit olduğu yerdir.

- Eğer indeks dizinin sol kenarında yer alıyorsa, sol toplam 0’dır (çünkü sol tarafta eleman yoktur). Aynı durum sağ kenar için de geçerlidir.
- **En soldaki pivot indeks** döndürülmelidir. Eğer böyle bir indeks yoksa `-1` döndürün.

### Örnek:

**Girdi:** `nums = [1,7,3,6,5,6]`
**Çıktı:** `3`
**Açıklama:**
Pivot indeksi `3`'tür.
- Sol toplam = `nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11`
- Sağ toplam = `nums[4] + nums[5] = 5 + 6 = 11`

Eşit oldukları için pivot indeksi `3` olarak döner.
 */
public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();
        int leftSum =0;
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum-  nums[i]) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
