//Mobile Recharge System
package CoreJava;

import java.util.Scanner;

class MobileRecharge {

    // Private variables - Encapsulation
    private String mobileNumber;
    private String customerName;
    private String planName;
    private double rechargeAmount;
    private int validity;
    private double dataLimit;

    // Constructor
    MobileRecharge(String mobileNumber, String customerName) {

        this.mobileNumber = mobileNumber;
        this.customerName = customerName;
        this.planName = "No Plan";
        this.rechargeAmount = 0;
        this.validity = 0;
        this.dataLimit = 0;
    }

    // Getters
    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPlanName() {
        return planName;
    }

    public double getRechargeAmount() {
        return rechargeAmount;
    }

    public int getValidity() {
        return validity;
    }

    public double getDataLimit() {
        return dataLimit;
    }

    // Recharge method
    public void recharge(String plan, double amount,
                          int days, double data) {

        if (amount <= 0) {
            System.out.println("Invalid recharge amount.");
            return;
        }

        if (days <= 0) {
            System.out.println("Invalid validity period.");
            return;
        }

        if (data <= 0) {
            System.out.println("Invalid data limit.");
            return;
        }

        planName = plan;
        rechargeAmount = amount;
        validity = days;
        dataLimit = data;

        System.out.println("\nRecharge successful!");
    }

    // Change plan
    public void changePlan(String newPlan) {

        if (newPlan != null && !newPlan.trim().isEmpty()) {
            planName = newPlan;
            System.out.println("Plan changed successfully.");
        } else {
            System.out.println("Invalid plan name.");
        }
    }

    // Display details
    public void displayDetails() {

        System.out.println("\n=================================");
        System.out.println("       MOBILE RECHARGE DETAILS");
        System.out.println("=================================");

        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Plan Name     : " + planName);
        System.out.println("Recharge      : ₹" + rechargeAmount);
        System.out.println("Validity      : " + validity + " days");
        System.out.println("Data Limit    : " + dataLimit + " GB");

        System.out.println("=================================");
    }
}


public class Encapsulation { 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("       MOBILE RECHARGE SYSTEM");
        System.out.println("=================================");

        System.out.print("Enter Mobile Number: ");
        String mobile = sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        MobileRecharge user =
                new MobileRecharge(mobile, name);

        System.out.print("Enter Plan Name: ");
        String plan = sc.nextLine();

        System.out.print("Enter Recharge Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter Validity (days): ");
        int days = sc.nextInt();

        System.out.print("Enter Data Limit (GB): ");
        double data = sc.nextDouble();

        user.recharge(plan, amount, days, data);

        user.displayDetails();

        sc.close();
    }
}