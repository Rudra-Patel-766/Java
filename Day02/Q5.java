package Day02;

public class Q5 {
    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] arg){
        int ans1=sum(2,3);
        int ans2=sum(2,3,4);
        System.out.println("Sum of Two number: "+ans1);
        System.out.println("Sum of Three number: "+ans2);
    }
}
