package src.college;

class dunum {
    public static void main(String[] args) {
        int sum = 0;
        int sinnum;
        int i;

        System.out.println(2000*2001/2);

        for (i = 1, sinnum = 0; i <= 2000; i += 2) {
            sinnum += i;
        }
        System.out.println(sinnum);

        for (i = 2; i <= 2000; i += 2 ) {
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        i = 2;

        while (i <= 2000) {
            sum += i;
            i += 2;
        }
        System.out.println(sum);
    }
}