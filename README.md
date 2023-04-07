# Prim-Algoritmasi-ile-string-ifadeyi-metin-dosyasi-icerisinde-bulan-java-programi
PRİM ALGORİTMASI NEDİR VE NE İÇİN KULLANILIR?<br/><br/>
Prim algoritması bir ağ yapısı üzerinde asgari tarama ağacını bulan bir algoritma türüdür. Prim algoritmasının amacı en az maliyetle asgari tarama ağacını bulmaktır.
Prim algoritması ağ yapısındaki bütün kenarları ve tüm düğümleri kapsayacak şekilde toplam ağırlığı minimum olacak hale getirerek asgari tarama ağacını bulur. Prim 
algoritması bir ağ üzerindeki asgari tarama ağacını bulduğu için herhangi bir diziyi veya değişkeni dosya içerisinde bulmak için kullanılmaz ancak Prim algoritmasına 
ait 3 adet arama şekli bulunur. Bunlar Doğrusal (Linear) Search, İkili (Binary) Search ve Fibonacci’dir. Prim algoritmasının her bir arama şekline göre çalışma şekli
ve çalışma zamanı bulunmaktadır ancak Prim algoritmasının her bir arama şekline göre belirli bir çalışma modeli bulunmaktadır. İlk başta bir başlangıç noktası seçilir.
Seçilecek olan başlangıç noktası herhangi bir nokta olabilir. Daha sonrasında bu noktayı dahil olmayan diğer noktalar ile birleştirmeye başlar. Döngü oluşmayacak şekilde
birleştirme işlemine devam edilir ve en sonunda asgari tarama ağacı oluşturulmuş olur. <br/></br>


PRİM ALGORİTMASI ÇALIŞMA ZAMANI ANALİZİ NEDİR? <br/><br/>
Prim algoritmasının çalışma zamanı O (N^2)’dir. Çalışma zamanın bu şekilde olmasının nedeni algoritma içerisinde iç içe döngülerin kullanılmasıdır. Bu çalışma zamanı
Binary Search veya Fibonacci yığını kullanımı ile O (E logV) şeklinde olur. Burada gösterilmiş olan E, kenarların sayısıdır V ise köşelerin sayısıdır. Prim algoritması
bir değişkenin dosya içerisinde aranma işleminde direkt olarak kullanılmadığı için Doğrusal (Linear) Arama ile ifadelerin kaç defa tekrar ettiğini buldum. Doğrusal arama
işleminde çalışma zamanı sabittir ve O(N) şeklindedir.  Doğrusal Arama, aranan elemanı bulmak için her elemanı aranan eleman ile karşılaştıracağından dolayı çalışma 
zamanı sonucu O(N) olarak bulunur. <br/><br/>

![prim algoritması resmi](https://github.com/ecemcagildizi/Prim-Algoritmasi-ile-string-ifadeyi-metin-dosyasi-icerisinde-bulan-java-programi/blob/main/%C4%B1mages/prim.png)
<br/><br/>

Yukarıda bulunan kod parçacığı üzerinden Doğrusal (Linear) Arama çalışma zamanı hesaplaması yapacak olursak; int count satırı=1, String line satırı=N, for döngüsündeki
çalışma zamanı =N, for döngüsü içerisindeki count++ satırı=1 ve while içerisindeki toplam çalışma zamanı=N+N+1 dir. Toplam= 2N+2 şeklinde olur ve buna bağlı olarak 
çalışma zamanı O(N) olarak bulunur.


