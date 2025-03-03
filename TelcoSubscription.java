public interface TelcoSubscription{
    public String accept(IUsagePromo promo, double price);
    public String accept(IUnliCallTextOffer unliPackage, boolean unliCallText);
}