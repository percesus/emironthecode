public class EskenarUcgen {

    public float yukseklik;
    public float taban;
    
    public float x;
    public float y;
    public float z;
    
    public EskenarUcgen(float yukseklik, float taban) {
        this.yukseklik = yukseklik;
        this.taban = taban;
    }
    
    public EskenarUcgen(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public float getTaban() {
        return taban;
    }
    
    public float getYukseklik() {
        return yukseklik;
    }
    
    public void setTaban(float taban) {
        this.taban = taban;
    }
    
    public void setYukseklik(float yukseklik) {
        this.yukseklik = yukseklik;
    }
    
    public float alanHesabi() {
        float alan = taban * yukseklik / 2;
        return alan;
    }
    
    public float cevreHesabi() {
        return x + y + z;
    }
    
}