

public class GradesTester {
    static int arr_size = 7;
    static int max_val=100;
    static int[] test_grades = {60,80,60,20,90,100,100};


    public static String arrToString(int[]array){
        String arrString = " ";
        for (int i=0; i<array.length; i++){
            arrString += " " + array[i];
        }
        return arrString;
    }
    public static void test_getScore(){
        Grades myClass = new Grades();
        System.out.println("---------------Testing---------------");
        System.out.println("1. ===== Testing: getScore() =====");
        System.out.println("Input array: " + arrToString(test_grades));
        System.out.println("Input studentID: " + 2);
        System.out.println("2. ===== RESULT OF getScore(): =====");
        System.out.println("Testing getScore with array" + arrToString(test_grades));
        System.out.println("Result for getSocre: " + myClass.getScore(test_grades,2)); // expected to return true 
        System.out.println(" ");

    }

    public static void test_perfectScoreQ(){
        Grades myClass = new Grades();
        System.out.println("1. ===== Testing: perfectScoreQ() =====");
        System.out.println("Input array: " + arrToString(test_grades));
        System.out.println("2. ===== RESULT OF perfectScoreQ(): =====");
        System.out.println("Testing getScore with array" + arrToString(test_grades));
        System.out.println("Result for getSocre: " + myClass.perfectScoreQ(test_grades)); // expected to return true 
        System.out.println(" ");

    }

    public static void test_bottomScoreQ(){
        Grades myClass = new Grades();
        System.out.println("1. ===== Testing: bottomScoreQ() =====");
        System.out.println("Input array: " + arrToString(test_grades));
        System.out.println("2. ===== RESULT OF bottomScoreQ(): =====");
        System.out.println("Testing bottomScoreQ with array" + arrToString(test_grades));
        System.out.println("Result for bottomScoreQ: " + myClass.bottomScoreQ(test_grades)); // expected to return true 
        System.out.println(" ");

    }

    public static void test_getMaxScore(){
        Grades myClass = new Grades();
        System.out.println("1. ===== Testing: getMaxScore() =====");
        System.out.println("Input array: " + arrToString(test_grades));
        System.out.println("2. ===== RESULT OF getMaxScore(): =====");
        System.out.println("Testing getMaxScore with array" + arrToString(test_grades));
        System.out.println("Result for getMaxScore: " + myClass.getMaxScore(test_grades)); // expected to return true 
        System.out.println(" ");

    }

    public static void test_nrMaxScore(){
        Grades myClass = new Grades();
        System.out.println("1. ===== Testing: nrMaxScore() =====");
        System.out.println("Input array: " + arrToString(test_grades));
        System.out.println("2. ===== RESULT OF nrMaxScore(): =====");
        System.out.println("Testing nrMaxScore with array" + arrToString(test_grades));
        System.out.println("Result for nrMaxScore: " + myClass.nrMaxScores(test_grades)); // expected to return true 
        System.out.println(" ");

    }

    public static void test_getMinScore(){
        Grades myClass = new Grades();
        System.out.println("1. ===== Testing: getMinScore() =====");
        System.out.println("Input array: " + arrToString(test_grades));
        System.out.println("2. ===== RESULT OF getMinScore(): =====");
        System.out.println("Testing getMinScore with array" + arrToString(test_grades));
        System.out.println("Result for getMinScore: " + myClass.getMinScore(test_grades)); // expected to return true 
        System.out.println(" ");

    }

    public static void test_nrMinScore(){
        Grades myClass = new Grades();
        System.out.println("1. ===== Testing: nrMinScore() =====");
        System.out.println("Input array: " + arrToString(test_grades));
        System.out.println("2. ===== RESULT OF nrMinScore(): =====");
        System.out.println("Testing nrMinScore with array" + arrToString(test_grades));
        System.out.println("Result for nrMinScore: " + myClass.nrMinScores(test_grades)); // expected to return true 
        System.out.println(" ");
    }

    public static void test_sortedScores(){
        Grades myClass = new Grades();
        System.out.println("1. ===== Testing: sortedScores() =====");
        System.out.println("Input array: " + arrToString(test_grades));
        System.out.println("2. ===== RESULT OF sortedScores(): =====");
        System.out.println("Testing sortedScores with array" + arrToString(test_grades));
        System.out.println("Result for sortedScores: " + arrToString(myClass.sortedScores(test_grades))); // expected to return true 
        System.out.println(" ");
    }

    public static void test_getRank(){
        Grades myClass = new Grades();
        System.out.println("1. ===== Testing: getRank() =====");
        System.out.println("Input array: " + arrToString(myClass.sortedScores(test_grades)));
        System.out.println("Input studentID: " + 2);
        System.out.println("2. ===== RESULT OF getRank(): =====");
        System.out.println("Testing getRank with array" + arrToString(test_grades));
        System.out.println("Result for getRank: " + myClass.getRank(test_grades,2)); // expected to return true 
        System.out.println(" ");
    }



    public static void main(String[] args) {
        test_getScore();
        test_perfectScoreQ();
        test_bottomScoreQ();
        test_getMaxScore();
        test_nrMaxScore();
        test_getMinScore();
        test_nrMinScore();
        test_sortedScores();
        test_getRank();

    }
}
