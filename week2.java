import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int count(String str, char a){
        int cnt = 0;
        for(int i = 0; i < str.length(); i++) if(str.charAt(i) == a) cnt += 1;
        return cnt;
    }
    public static int indexOfSmallestElement(double[] array, int n){
        double mn = 10000; int j = 0;
        for(int i = 0; i < n; i++){
            if(array[i] < mn){
                j = i;
                mn = array[i];
            }
        }
        return j;
    }
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        Scanner myObj = new Scanner(System.in);
        /*
        String s = "Welcome";
        char a = 'e';
        System.out.printf("%d", count(s, a));
        */
        /*
        String s = myObj.nextLine();
        int l = 0, u = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z') l ++;
            if(c >= 'A' && c <= 'Z') u ++;
        }
        System.out.printf("%d %d", l, u);
        */
        /*
        int n = myObj.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
                arr[i] = myObj.nextDouble();
        }
        System.out.printf("%d", indexOfSmallestElement(arr, n));
        */
        /*
        String s = myObj.next();
        char array[] = s.toCharArray();
        Arrays.sort(array);
        s = new String(array);
        System.out.printf(s);
         */
        /*
        Boolean check = false;

        int n = myObj.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = myObj.nextInt();
        }
        for(int i = 3; i < n; i++){
            if(arr[i] == arr[i-1] && arr[i-2] == arr[i-3] && arr[i-3] == arr[i]) check = true;
        }
        System.out.printf("%b", check);
         */
        long  n = myObj.nextLong();
        long  o = 0, e = 0, cnt = 1;
        while(n > 0){
            if(cnt % 2 > 0) o += n % 10;
            else {
                long t = 2 * (n % 10);
                if (t >= 10) t = (t / 10 + t % 10);
                e += t;
            }
            n /= 10; cnt ++;
        }
//        System.out.printf("%d %d", e, o);
        if((e + o) % 10 < 1) System.out.printf("Yes");
        else System.out.printf("No");
    }

}
