class BusCharges {
    public static void main(String args[]) {
        int dist = 30;
        int charge = 0;
        if (dist <= 0)
            charge = 0;
        else if (dist <= 10)
            charge = 80;
        else if (dist <= 20)
            charge = 80 + (dist - 10) * 6;
        else if (dist <= 30)
            charge = 80 + 60 + (dist - 20) * 5;
        else if (dist > 30)
            charge = 80 + 60 + 50 + (dist - 30) * 4;
        System.out.println("Fare = " + charge);
    }
}