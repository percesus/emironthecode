public class EsKenarUcgen {
  public static void main(String [] args) {
  private Nokta kose;
  private double genislik;
  private double yukseklik;


  public EsKenarUcgen (Nokta n, double g, double y) {
    kose = n; genislik = g; yukseklik = y;
  }

  public EsKenarUcgen (double koseX, double koseY, double gen, double yuk) {
    kose = new Nokta(koseX, koseY);
    genislik = gen; yukseklik = yuk;
  }

  public EsKenarUcgen (Nokta solust, Nokta sagalt) {
    if((solust.getX() > sagalt.getX()) || solust.getY() < sagalt.getY()) {
      throw(new IllegalArgumentException("Hatalı köşe koordinatları!"));
    }
    else {
      kose = solust;
      genislik = sagalt.getX() - solust.getX();
      yukseklik = solust.getY() - sagalt.getY();
    }
  }

  public double Alan() { return genislik * yukseklik; }
}
