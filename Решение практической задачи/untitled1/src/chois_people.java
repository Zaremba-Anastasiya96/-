import java.util.Scanner;


public class chois_people {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a people: 1   2   3   4");
        int people = in.nextInt();

        if (people == 1){
            System.out.println("you killed a man " + people);
        }
        else if (people == 2){
            System.out.println("you killed a man " + people);
        }
        else if (people == 3){
            System.out.println("you killed a man " + people);
        }
        else if (people == 4){
            System.out.println("you killed a man " + people);
        }
        else {
            System.out.println("there's no one with that number ");
        }
    }
}
