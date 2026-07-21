package methods;

public class MobileRecharge {
    int planName;
    int validity;
    double data;
    String calls;
    String sms;
    double recharge;
    public void showPlanDetails(){
        System.out.println("Current Recharge Plan Details: ");
        System.out.println("Plan Name: " + "unlimited " + planName);
        System.out.println("Validity: " + validity + " Days");
        System.out.println("Data: " + data + " GB/Day");
        System.out.println("Calls: " + calls + " calls");
        System.out.println("Sms: " + sms + " sms");
    }
    public double recharge(double rechargeAmount){
        System.out.println("Recharge Amount: " + rechargeAmount + " rupess");
        System.out.println("Recharge Successfull");
        return rechargeAmount;
    }
    public static void main(String[] args) {
        MobileRecharge mobileRecharge = new MobileRecharge();
        mobileRecharge.planName = 299;
        mobileRecharge.validity = 28;
        mobileRecharge.data = 1.5;
        mobileRecharge.calls = "unlimited";
        mobileRecharge.sms = "unlimited";
        mobileRecharge.showPlanDetails();
        mobileRecharge.recharge(299);
    }
}
