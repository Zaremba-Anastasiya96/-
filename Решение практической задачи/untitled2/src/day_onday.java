import java.util.Scanner;
public class day_onday {
    private static boolean day;
   //3 day=true;

    public static void main(String[] args) {
        String visible_name;

        while(true) {
            day = !day;
            if (day == true){
                visible_name = "Наступил день";
            } else {
                visible_name = "Наступила ночь";
            }
            Scanner in = new Scanner(System.in);
            int chois = in.nextInt();
            System.out.println("Hello!" + chois + visible_name);

        }


    }
}