package SlidingWindow;
/*
Problem şöyle: Bir integer array ve k sayısı veriliyor.
k uzunluğundaki herhangi bir alt dizinin en büyük ortalamasını bulmamız gerekiyor.

Örnek:
```
nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75

Açıklama:
- k=4 için olası tüm alt diziler:
  1. [1,12,-5,-6] = 2/4 = 0.5
  2. [12,-5,-6,50] = 51/4 = 12.75
  3. [-5,-6,50,3] = 42/4 = 10.5
- En büyük ortalama 12.75
```
 */
public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for (int i=0; i<k; i++) {
            sum += nums[i];
        }
        double maxAverage = (double) sum / k;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i-k] + nums[i];
            maxAverage = Math.max(maxAverage, (double) sum / k);
        }
        return maxAverage;
    }

}
