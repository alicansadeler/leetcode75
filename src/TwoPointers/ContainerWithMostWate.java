package TwoPointers;
/*
Bir integer array verilir. Her sayı dikey bir çizginin yüksekliğini temsil eder.
İki çizgi seçerek oluşturulabilecek en büyük su konteynerini bulmamız gerekiyor.
Konteyner'ın alanı = iki çizgi arasındaki mesafe * daha kısa olan çizginin yüksekliği
 */
public class ContainerWithMostWate {
    public int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        int max = 0;

        while (leftPointer < rightPointer) {
           int area = (rightPointer - leftPointer) * Math.min(height[leftPointer], height[rightPointer]);
           max = Math.max(max, area);
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return max;
    }
}
