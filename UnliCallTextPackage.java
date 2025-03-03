public class UnliCallTextPackage implements IUnliCallTextOffer{

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return telcoName + " package UnliCallText: " + unliCallText;
    }
}
