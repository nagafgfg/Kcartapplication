import java.util.ArrayList;
 import java.util.Scanner;


 public class assgn {

        public static void  main(String[] args) {
            ArrayList<userType> users = new ArrayList<userType>(); // store and hold user input temporary
            Scanner input = new Scanner(System.in); // to obtain input from user

            String email, password, username, subject, credentials;
            int contact;

            System.out.println("========== SIGN UP PAGE ==========");
            System.out.println("Pick your choice:  ");
            System.out.println("1) Student" + "\n" + "2) Tutor");
            int choice = input.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("========== Student Account ==========");
                    //arrays goes here
                    break;

                case 2:
                    System.out.println("========== Tutor Account ==========");
                    //arrays goes here
                    break;

                default:
                    System.out.println("Please pick your account type");
            }
        }

    
