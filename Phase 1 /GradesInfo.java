import java.util.Scanner;

public class GradesInfo {
    // declare a Boolean variable quit, initialize it as false
    static Scanner user_input = new Scanner(System.in); //ask about it being static used to be Scanner
    static boolean quit = false; 
    // String user_response = " ";
    static int[] grades = {70,80,90,100};
    static String menu = ("0 = Quit" + "\n" + "1 = Print Grades" );


    static String arrayToString(int[]array){
        String arrString = " ";
        for (int i=0; i<array.length; i++){
            arrString += " " + array[i];
        }
        return arrString;
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
                    System.out.println(menu);
                    option = user_input.nextInt();
                    break;
                case 2:
                    

            }
        }


    }


    // private static void findMax(int[] grades2) {
    // }

    public static void main(String[] args) {
        gradesLoop();
    }
}