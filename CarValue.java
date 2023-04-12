public class CarValue {
    public static void main(String args[]) {
        int year = 2;

        if (year < 1 || year > 5) {
            System.out.println("Wrong choice! Please select from 1, 2, 3, 4, 5.");
            return;
        }

        double price = 9999.0;// showroom price
        double depValue = 0.0;
        switch (year) {
            case 1:
                depValue = 0.1 * price;
                break;
            case 2:
                depValue = 0.2 * price;
                break;
            case 3:
                depValue = 0.3 * price;
                break;
            case 4:
                depValue = 0.4 * price;
                break;
            case 5:
                depValue = 0.5 * price;
                break;
            case 6:
                depValue = 0.6 * price;
                break;
            default:
                System.out.println("Wrong choice! Please select from 1, 2, 3, 4, 5.");
                break;
        }
        double amtPayable = price - depValue;
        System.out.println("Original Price = " + price);
        System.out.println("Depricated Value = " + depValue);
        System.out.println("Amount to be paid = " + amtPayable);
    }
}