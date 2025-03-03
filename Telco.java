public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private int dateAllowance;
    private boolean unliCallText;

    public Telco(int dateAllowance, double promoPrice, String telcoName, boolean unliCallText){
        this.dateAllowance = dateAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    public String getTelcoName() {
        return telcoName;
    }

    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public int getDateAllowance() {
        return dateAllowance;
    }

    public void setDateAllowance(int dateAllowance) {
        this.dateAllowance = dateAllowance;
    }

    public boolean isUnliCallText() {
        return unliCallText;
    }

    public void setUnliCallText(boolean unliCallText) {
        this.unliCallText = unliCallText;
    }

    public boolean getUnliCallText(){
        return this.unliCallText;
    }


    @Override
    public String accept(IUsagePromo promo, double price) {
        return null;
    }

    @Override
    public String accept(IUnliCallTextOffer unliPackage, boolean unliCallText) {
        return null;
    }
}

