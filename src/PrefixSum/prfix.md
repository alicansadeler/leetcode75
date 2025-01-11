

Prefix sum basit ama güçlü bir tekniktir. Bir dizinin her indeksindeki elemanına, kendisinden önceki tüm elemanların toplamını ekleyerek oluşturulur.

Örnek üzerinden gösterelim:
```python
Input array:      [3, 1, 4, 2, 5]
Prefix sum array: [3, 4, 8, 10, 15]
```

Prefix sum array'i nasıl oluşturuldu:
```
index 0: 3 
index 1: 3 + 1 = 4
index 2: 3 + 1 + 4 = 8
index 3: 3 + 1 + 4 + 2 = 10
index 4: 3 + 1 + 4 + 2 + 5 = 15
```

Bu yapının en büyük avantajı, herhangi bir subarray'in toplamını O(1) sürede bulabilmemizi sağlamasıdır.

Örneğin [2,5] aralığındaki elemanların toplamını bulmak için:
```python
sum[2,5] = prefix[5] - prefix[1]
```

