package TwoPointers;
/*
Bir array içindeki tüm sıfırları dizinin sonuna taşımamız gerekiyor, ama sıfır olmayan sayıların sırasını koruyarak.
Örneğin: [0,1,0,3,12] -> [1,3,12,0,0]
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int firstZeroPointer = 0;

        for (int i=0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[firstZeroPointer];
                nums[firstZeroPointer] = nums[i];
                nums[i] = temp;
                firstZeroPointer++;
            }
        }
    }
}
