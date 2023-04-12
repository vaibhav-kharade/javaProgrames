class College_Checking {
    public static void main(String[] args) {
        String Clg_Name = "XYZ";
        int english = 80;
        int math = 60;
        int science = 80;
        if (english >= 80 && math >= 80 && science >= 80) {
            System.out.println("science");
        }

        else if (english >= 80 && math >= 80 && science >= 80) {
            System.out.println("bio");
        }

        else if (english >= 60 && math >= 60 && science >= 60) {
            System.out.println("commerce");
        } else {
            System.out.println("Try for the other colleges");
        }

    }

}
