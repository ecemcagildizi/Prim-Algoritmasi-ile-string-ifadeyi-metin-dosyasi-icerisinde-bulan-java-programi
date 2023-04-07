import java.io.FileNotFoundException; // Dosya işlemlerini gerçekleştirirken dosyanın bulunamama ihtimaline karşılık olarak FileNotException import edildi.

public class Main {
    public static void main(String[] args) throws FileNotFoundException { //Burada FileNotException hatasının tanımlanmasının sebebi kelimenin metin dosyası içerisinde
        // bulunmaması sonucunda hata fırlatması içindir.
       PrimAlgoritması bul= new PrimAlgoritması(); // PrimAlgoritması sınıfındaki fonksiyonları kullanabilmek için bul nesnesi ile PrimAlgoritması sınıfı çağırıldı.
        bul.kelime1();
        bul.kelime2();
        bul.kelime3();
        bul.kelime4();
        bul.kelime5();
    }
}