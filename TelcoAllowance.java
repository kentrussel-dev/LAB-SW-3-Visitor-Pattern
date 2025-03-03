public class TelcoAllowance implements IUsagePromo {
    @Override
    public String showAllowance(String telcoName, double money) {
        return telcoName + ": " + money + " PHP";
    }
}
