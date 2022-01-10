public class Dom implements Budynek {
    private double pow;
    private String adres;
    private int value1;
    private int value;



    @Override
    public void setpowierzchnia(int powierzchnia) {
        this.pow = 20;
    }
    @Override
    public String setadresBudynku(String adresBudynku) {
        this.adres = adres;
    }
    public String getadresBudynku() {
        return adres;
    }
    @Override
    public double getpowierzchnia(double pow){
        return pow;
    }
    @Override
    public int getliczbaOkien(int value1){
        return value1;
    }
    @Override
    public int getliczbaMieszkancow(int value){
        return value;
        @Override
        public void podsumowanie {
            System.out.println(getadresBudynku() + " mieszkało " + value + " na powierzchni" + pow + "z ilością okien"+ value1);
        }
    }
}
