
public class AccessChecker {
    public static String checkAccess(int age, boolean isSubscribed) {
        if (age >= 18 && isSubscribed) {
            return "Full Access";
        } else if (isSubscribed) {
            return "Kids Premium";
        } else {
            return "No Access";
        }
    }

    public static void main(String[] args) {
        System.out.println(checkAccess(18, true));
    }
}
