package Classes;

public class b {
    private static final int TotalPayments = 7;
    private static final int MonthlyPayment = 100;
    private static final int TotalAmount = TotalPayments * MonthlyPayment;
    public static void Display(int totalPaid) {
        int remainingDebt = TotalAmount - totalPaid;
        int overpayment = totalPaid - TotalAmount;
        if (totalPaid < TotalAmount) {
            System.out.println("Remaining debt: " + remainingDebt + " rubles.");
        } else if (totalPaid == TotalAmount) {
            System.out.println("Debt is fully paid.");
        } else {
            System.out.println("Debt is fully paid. Overpayment: " + overpayment + " rubles.");
        }
    }
}
