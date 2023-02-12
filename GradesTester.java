

public class GradesTester {
    info_grades = new GradesInfo();
    public static void test_perfe(){
        int[] testArray = {1,2,3,4};
        int value = 4; //Selecting an element from the array 
        System.out.println("1. ===== Testing: isElement() =====");
        System.out.println("Input array: " + arrayToString(testArray));
        System.out.println("Input value: " + value);
        System.out.println("2. ===== RESULT OF COPY(): =====");
        System.out.println("Testing copy with array" + arrayToString(testArray));
        System.out.println("Result for isElement: " + isElement(testArray,value)); // expected to return true 
        System.out.println(" ");

    }
    
}