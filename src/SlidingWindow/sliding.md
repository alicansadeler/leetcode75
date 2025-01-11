
1. Sliding Window Nedir?
- Bir array veya string üzerinde sabit boyutlu veya değişken boyutlu bir "pencere" kaydırarak işlem yapmamızı sağlayan bir tekniktir
- Bu pencere, art arda gelen elemanları temsil eder
- Genellikle subarray veya substring problemlerinde kullanılır

2. İki Tip Sliding Window Vardır:
    - Sabit Boyutlu (Fixed Size): Pencere boyutu değişmez (örn: "son 3 elemanın toplamını bul")
    - Değişken Boyutlu (Dynamic Size): Pencere boyutu şartlara göre değişir

3. Temel Mantık:
```
Array: [1, 2, 3, 4, 5], window size = 3

1. Adım: [1, 2, 3], 4, 5    - İlk pencere
2. Adım: 1, [2, 3, 4], 5    - Pencere bir sağa kaydı
3. Adım: 1, 2, [3, 4, 5]    - Pencere bir sağa kaydı
```

4. Ne Zaman Kullanılır?
- Ardışık elemanlarla ilgili problemlerde
- "Maximum/minimum subarray" problemlerinde
- "En uzun/kısa substring" problemlerinde
- Ortalama hesaplamalarında

5. Dikkat Edilecek Noktalar:
- Window'un başlangıç ve bitiş indekslerini doğru yönetmek
- Window'u kaydırırken eski elemanı çıkarıp yeni elemanı eklemek
- Edge case'leri düşünmek (boş array, window size array'den büyükse, vs.)

