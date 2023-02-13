import java.util.Scanner;

public class GradesInfo {
    // declare a Boolean variable quit, initialize it as false
    static Scanner user_input = new Scanner(System.in); //ask about it being static used to be Scanner
    static boolean quit = false; 
    // String user_response = " ";
    static int[] grades = {60,80,60,20,90,100,100};
    static String menu = ("0 = Quit" + "\n" + "1 = Print Grades" + "\n" + "2 = Did anyone get a perfect score? " + "\n" + "3 = Did anyone get a 0?" + "\n" + "4 = Max score" +"\n" + "5 = How many people got the max score ?" + "\n" + "6 = Minimum score ?" + "\n" + "7 = How many people got the minimum score ?" + "\n" + "8 = Get my Score" + "\n" + "9 = Sorted scores"+ "\n" + "10 = Get my rank"  );
    static String message = ( "\n" + "Choose another option or enter quit:");
    static Grades grades2 = new Grades();

    static String arrayToString(int[]array){
        String arrString = " ";
        for (int i=0; i<array.length; i++){
            arrString += " " + array[i];
        }
        return arrString;
    }

    static void message(){
        System.out.println(message);
        System.out.println(menu);
        System.out.print("Your option: ");
    }

    // while quit is false, execute these three steps:
    static void gradesLoop(){
         
        System.out.println("HI! Enter a number from the menu to find out more about grades in this class. ");
        System.out.println(menu);
        System.out.print("Your option: ");
        Integer option = user_input.nextInt();
        while ((quit == false) && (option >= 0) ){
            switch (option){
                case 0: 
                    System.out.println("You have now quit the program!");
                    quit = true;
                    break;

                case 1:
                    System.out.println(arrayToString(grades));
                    message();
                    option = user_input.nextInt();
                    break;
                case 2:
        
                    System.out.println(grades2.perfectScoreQ(grades));
                    message();
                    option = user_input.nextInt();
                    break;
                case 3:
                    System.out.println(grades2.bottomScoreQ(grades));
                    message();
                    option = user_input.nextInt();
                    break;
                case 4:
                    System.out.println(grades2.getMaxScore(grades));
                    message();
                    option = user_input.nextInt();
                    break;
                case 5:
                    System.out.println(grades2.nrMaxScores(grades));
                    message();
                    option = user_input.nextInt();
                    break;
                
                case 6:
                    System.out.println(grades2.getMinScore(grades));
                    message();
                    option = user_input.nextInt();
                    break;
                case 7:
                    System.out.println(grades2.nrMinScores(grades));
                    message();
                    option = user_input.nextInt();
                    break;
                case 8:
                    System.out.println("What is your studentID #?");
                    int student_ID = user_input.nextInt();
                    System.out.println(grades2.getScore(grades,student_ID));
                    message();
                    option = user_input.nextInt();
                    break;
                case 9:
                    System.out.println(arrayToString(grades2.sortedScores(grades)));
                    message();
                    option = user_input.nextInt();
                    break;
                case 10:
                    System.out.println("What is your studentID #?");
                    int student_id = user_input.nextInt();
                    System.out.println(grades2.getRank(grades, student_id));
                    message();
                    option = user_input.nextInt();
                    break;





            }
        }


    }

    public static void main(String[] args) {
        gradesLoop();
    }
}