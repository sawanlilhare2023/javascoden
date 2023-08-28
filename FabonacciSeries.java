public class FabonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(a+""+b);
        int temp;
        for(int i = 2;i<10;i++){
            temp = a+b;
            System.out.println("" +temp);
            a=b;
            b=temp;



        }



    }

}
