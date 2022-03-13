package odev;

public class odev {
    public static void main(String[] args) {

        String isimler = "Emir, Yaren, Beyza, Gamze, Ayhan, Emir, Elif, Karolina";
        String soyisimler = "Yildiz, Dagci, Sadik, İsik, Korkmaz, Kacmaz,  Guzel";
        String[] arrSplitisim = isimler.split(", ");
        String[] arrSplitsoyisim = soyisimler.split(", ");
        String isimSoyisim ;
        int uzunluk ;
        int kisiSayisi = arrSplitisim.length;

        for (int i = 0 ; i < kisiSayisi ; i++) {
            isimSoyisim = arrSplitisim[i]+" "+arrSplitsoyisim[i];
            uzunluk = isimSoyisim.length();
            System.out.println(isimSoyisim+", Uzunluk:"+uzunluk);
        }
    }
}