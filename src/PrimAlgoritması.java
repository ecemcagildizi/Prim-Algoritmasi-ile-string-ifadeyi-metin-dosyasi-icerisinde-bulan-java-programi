import java.io.File; //Dosya işlemlerini gerçekleştirmek için File import edildi.
import java.io.FileNotFoundException; // Dosya işlemlerini gerçekleştirirken dosyanın bulunamama ihtimaline karşılık olarak FileNotException import edildi.
import java.util.Scanner; // Dışarıdan değer ve dosya alabilmek için Scanner import edildi.

public class PrimAlgoritması {
    public void kelime1()throws FileNotFoundException { //Burada FileNotException hatasının tanımlanmasının sebebi kelimenin metin dosyası içerisinde
        // bulunmaması sonucunda hata fırlatması içindir.
        Scanner file = new Scanner(new File("C:\\Users\\PC\\Desktop\\alice_in_wonderland.txt")); // Dışarıdan kullanılacak olan metin dosyası çağırıldı.
        String kelime = "upon"; // Metin dosyası içerisinde aranacak olan kelime tanımlandı.


        int count=0; // Count değeri kelimenin metin dosyası içerisinde kaç defa tekrar ettiğini tutacak olan değerdir.
        while(file.hasNextLine()){ // Bu kısım dosya içerisinde bir alt satıra geçip kontrol yapılmasını sağlar.
            String line= file.nextLine(); // Line değeri dosya içerisindeki string ifadeleri tutacak.
            for(int index = line.indexOf(kelime); index != -1; index=line.indexOf(kelime,index+1)){ // Bu döngüdeki index değeri, line değeri izleyen değişkendir.
                // Döngü aranan ifade ile line ifadesinin eşleşmesi sonucunda count değerini birer birer arttırır.
                count++;
            }
        }
        System.out.println(kelime+" kelimesi metin dosyası içerisinde "+count+" defa bulunmaktadır.");
    }


    public void kelime2()throws FileNotFoundException { //Burada FileNotException hatasının tanımlanmasının sebebi kelimenin metin dosyası içerisinde
        // bulunmaması sonucunda hata fırlatması içindir.
        Scanner file = new Scanner(new File("C:\\Users\\PC\\Desktop\\alice_in_wonderland.txt")); // Dışarıdan kullanılacak olan metin dosyası çağırıldı.
        String kelime = "sigh"; // Metin dosyası içerisinde aranacak olan kelime tanımlandı.


        int count=0; // Count değeri kelimenin metin dosyası içerisinde kaç defa tekrar ettiğini tutacak olan değerdir.
        while(file.hasNextLine()){ // Bu kısım dosya içerisinde bir alt satıra geçip kontrol yapılmasını sağlar.
            String line= file.nextLine(); // Line değeri dosya içerisindeki string ifadeleri tutacak.
            for(int index = line.indexOf(kelime); index != -1; index=line.indexOf(kelime,index+1)){ // Bu döngüdeki index değeri, line değeri izleyen değişkendir.
                // Döngü aranan ifade ile line ifadesinin eşleşmesi sonucunda count değerini birer birer arttırır.
                count++;
            }
        }
        System.out.println(kelime+" kelimesi metin dosyası içerisinde "+count+" defa bulunmaktadır.");
    }

    public void kelime3()throws FileNotFoundException { //Burada FileNotException hatasının tanımlanmasının sebebi kelimenin metin dosyası içerisinde
        // bulunmaması sonucunda hata fırlatması içindir.
        Scanner file = new Scanner(new File("C:\\Users\\PC\\Desktop\\alice_in_wonderland.txt")); // Dışarıdan kullanılacak olan metin dosyası çağırıldı.
        String kelime = "Dormouse"; // Metin dosyası içerisinde aranacak olan kelime tanımlandı.


        int count=0; // Count değeri kelimenin metin dosyası içerisinde kaç defa tekrar ettiğini tutacak olan değerdir.
        while(file.hasNextLine()){ // Bu kısım dosya içerisinde bir alt satıra geçip kontrol yapılmasını sağlar.
            String line= file.nextLine(); // Line değeri dosya içerisindeki string ifadeleri tutacak.
            for(int index = line.indexOf(kelime); index != -1; index=line.indexOf(kelime,index+1)){ // Bu döngüdeki index değeri, line değeri izleyen değişkendir.
                // Döngü aranan ifade ile line ifadesinin eşleşmesi sonucunda count değerini birer birer arttırır.
                count++;
            }
        }
        System.out.println(kelime+" kelimesi metin dosyası içerisinde "+count+" defa bulunmaktadır.");
    }

    public void kelime4()throws FileNotFoundException { //Burada FileNotException hatasının tanımlanmasının sebebi kelimenin metin dosyası içerisinde
        // bulunmaması sonucunda hata fırlatması içindir.
        Scanner file = new Scanner(new File("C:\\Users\\PC\\Desktop\\alice_in_wonderland.txt")); // Dışarıdan kullanılacak olan metin dosyası çağırıldı.
        String kelime = "jury-box"; // Metin dosyası içerisinde aranacak olan kelime tanımlandı.


        int count=0; // Count değeri kelimenin metin dosyası içerisinde kaç defa tekrar ettiğini tutacak olan değerdir.
        while(file.hasNextLine()){ // Bu kısım dosya içerisinde bir alt satıra geçip kontrol yapılmasını sağlar.
            String line= file.nextLine(); // Line değeri dosya içerisindeki string ifadeleri tutacak.
            for(int index = line.indexOf(kelime); index != -1; index=line.indexOf(kelime,index+1)){ // Bu döngüdeki index değeri, line değeri izleyen değişkendir.
                // Döngü aranan ifade ile line ifadesinin eşleşmesi sonucunda count değerini birer birer arttırır.
                count++;
            }
        }
        System.out.println(kelime+" kelimesi metin dosyası içerisinde "+count+" defa bulunmaktadır.");
    }

    public void kelime5()throws FileNotFoundException { //Burada FileNotException hatasının tanımlanmasının sebebi kelimenin metin dosyası içerisinde
        // bulunmaması sonucunda hata fırlatması içindir.
        Scanner file = new Scanner(new File("C:\\Users\\PC\\Desktop\\alice_in_wonderland.txt")); // Dışarıdan kullanılacak olan metin dosyası çağırıldı.
        String kelime = "swim"; // Metin dosyası içerisinde aranacak olan kelime tanımlandı.


        int count=0; // Count değeri kelimenin metin dosyası içerisinde kaç defa tekrar ettiğini tutacak olan değerdir.
        while(file.hasNextLine()){ // Bu kısım dosya içerisinde bir alt satıra geçip kontrol yapılmasını sağlar.
            String line= file.nextLine(); // Line değeri dosya içerisindeki string ifadeleri tutacak.
            for(int index = line.indexOf(kelime); index != -1; index=line.indexOf(kelime,index+1)){ // Bu döngüdeki index değeri, line değeri izleyen değişkendir.
                // Döngü aranan ifade ile line ifadesinin eşleşmesi sonucunda count değerini birer birer arttırır.
                count++;
            }
        }
        System.out.println(kelime+" kelimesi metin dosyası içerisinde "+count+" defa bulunmaktadır.");
    }
}
