public static void main(String[] args) {
        EskenarUcgen ucgen1 = new EskenarUcgen(24, 12);
        System.out.println(ucgen1.alanHesabi());
        
        EskenarUcgen ucgen2 = new EskenarUcgen(32, 24, 12);
        System.out.println(ucgen2.cevreHesabi());