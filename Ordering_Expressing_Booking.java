class Ordering_Expressing_Booking {
    public static void main(String[] args) {
        int weight = 40;
        char OType = 'E';
        System.out.println("The initial charges are : 0 RS.");
        if (weight <= 100 && OType == 'O') {
            System.out.println("The ordering charges is : 80 Rs.");
        } else if (weight <= 100 && OType == 'E') {
            System.out.println("The Expressing charges are : 100 RS.");
        } else if (weight <= 101 && weight <= 500 && OType == 'O') {
            System.out.println("The Ordering charges are : 150 Rs.");
        } else if (weight >= 101 && weight <= 500 && OType == 'E') {
            System.out.println("The Expressing charges are : 200 RS.");
        } else if (weight >= 1000 && OType == 'O') {
            System.out.println("The Ordering charges are : 250 RS.");
        } else if (weight >= 1000 && OType == 'E') {
            System.out.println("The Expressing charges are : 300 RS.");
        }

    }

}
