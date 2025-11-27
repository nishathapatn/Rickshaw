import java.util.Scanner;

public class Rickshaw {
    public static void main(String[] args) {
        double baseFare = 50;
        double kmRate = 20;
        double minRate = 5;
        double localDiscount = 50;
        double nightTimeCharge = 50;
        
        // Calculation: baseFare + (km * kmRate) + (min * minRate) [- local ? (localDiscount)] [+ night ? (nightTimeCharge)]
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many kilometers did you travel? = ");
        double km = sc.nextDouble();
        
        System.out.print("How many minutes did you travel for? = ");
        double min = sc.nextDouble();
        
        System.out.print("Are you a local? (true/false) = ");
        boolean local = sc.nextBoolean();
        
        System.out.print("Are you travelling at night? (true/false) = ");
        boolean night = sc.nextBoolean();
        
        // First we added the baseFare with km and min charges
        double total = baseFare + (km * kmRate) + (min * minRate);
        
        // We subtracted the discount based on if they are local or not and kilometer travelled was more than or equals to 15km
        total -= local && (km >= 15) ? localDiscount : 0;
        
        // We added night time charge based on if they travelled at night or not
        total += night ? nightTimeCharge : 0;
        
        System.out.println("Your total is: NPR. " + total);
        
        sc.close();
    }
}