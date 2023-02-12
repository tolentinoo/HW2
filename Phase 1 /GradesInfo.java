import java.util.Scanner;

public class GradesInfo {
    // declare a Boolean variable quit, initialize it as false
    static Scanner user_input = new Scanner(System.in); //ask about it being static used to be Scanner
    static boolean quit = false; 
    // String user_response = " ";
    static int[] grades = {60,60,60,80,90,100,100};
    static String menu = ("0 = Quit" + "\n" + "1 = Print Grades" + "\n" + "2 = Did anyone get a perfect score? " + "\n" + "3 = Did anyone get a 0?" + "\n" + "4 = Max score" +"\n" + "5 = How many people got the max score ?" + "\n" + "6 = Minimum score ?" + "\n" + "7 = How many people got the minimum score ?"  );
    static String message = ( "\n" + "Choose another option or enter quit:");


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



    static boolean perfectScoreQ(int[] array){
        boolean perf_score = false;
        for (int i=0; i < array.length; i++){
            if(array[i] == 100){
                perf_score = true;
            }
        }
        return perf_score;
    }   

    static boolean bottomScoreQ(int[] array){
        boolean bottom_score = false;
        for (int i=0; i < array.length; i++){
            if(array[i] == 0){
                bottom_score = true;
            }
        }
        return bottom_score;
    }

    static int getMaxScore(int[] array){
        int max = array[0];
        for (int i=0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    static int nrMaxScores(int[] array){
        int max = getMaxScore(array);
        int num_max = 0 ;
        for (int i =0; i < array.length; i++){
            if (array[i] == max){
                num_max += 1;
            }
        }
        return num_max;
    }

    static int getMinScore(int[] array){
       
        int min = array[0];
        for (int i=0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    static int nrMinScores(int[] array){
        int min = getMinScore(array);
        int num_min= 0 ;
        for (int i =0; i < array.length; i++){
            if (array[i] == min){
                num_min += 1;
            }
        }
        return num_min;
    }

    // static int[] sortedScores(int[] array, int k){
    //     int[]count = {};
    //     k = array.length;
    //     int[] sorted = new int[k];

    //     for (int i=0; i < array.length; i++){
    //         array[i]= count[i];
    //         if (array[i]==array[i]){
    //             count[i] += 1 ;
    //         }
    //     for (int j=0; j < count.length; j++){
    //         if (count[j] >= 1){
    //                 sorted[i] = count[j];
                    


    //             }
    //         }
    //     }
    //     return sorted;

    // }
    
    

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
        
                    System.out.println(perfectScoreQ(grades));
                    message();
                    option = user_input.nextInt();
                    break;
                case 3:
                    System.out.println(bottomScoreQ(grades));
                    message();
                    option = user_input.nextInt();
                    break;
                case 4:
                    System.out.println(getMaxScore(grades));
                    message();
                    option = user_input.nextInt();
                    break;
                case 5:
                    System.out.println(nrMaxScores(grades));
                    message();
                    option = user_input.nextInt();
                    break;
                
                case 6:
                    System.out.println(getMinScore(grades));
                    message();
                    option = user_input.nextInt();
                    break;
                case 7:
                    System.out.println(nrMinScores(grades));
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