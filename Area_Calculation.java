class Area_Calculation {
    public static void main(String[] args) {
        float r = 5;// radius
        int l = 24;// length
        int s = 45;
        int b = 45;// breadth
        float pi = 3.14f;// pi value
        char vaibhav = 'c';
        switch (vaibhav) {
            case 'c':
                System.out.println("Area of circle is " + (pi * r * r));

            case 's':
                System.out.println("Area of a square is " + (s * s));

            case 'r':
                System.out.println("Area of a rectangle is " + (l * b));

            default:
                break;
        }
    }
}