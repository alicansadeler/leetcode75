package ArrayString;

import java.util.ArrayList;
import java.util.List;

/*
Problem analizi:

candies dizisi: her çocuğun sahip olduğu şeker sayısı
extraCandies: ekstra verilebilecek şeker sayısı
Görev: Her çocuğa tüm ekstra şekerleri verirsek, o çocuk en çok şekere sahip olur mu?
Dönüş: Boolean liste

Çözüm stratejisi:

Önce mevcut en yüksek şeker sayısını bulmalıyız
Her çocuk için: currentCandies + extraCandies ≥ maxCandies kontrolü yapmalıyız
 */
public class KidsWiththeGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);

        int max = candies[0];

        for (int candy : candies) {
            max = Math.max(max, candy);
        }

        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return  result;
    }
}
