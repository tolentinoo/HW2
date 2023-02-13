

public class Grades {
    
    static int getScore(int[]array, int studentID){
        int score= 0;
        score = array[studentID];
        return score;

    }

    static int getRank(int[]array, int studentID){
        int rank= 0;
        int[]ranked_array= sortedScores(array);
        int score = getScore(ranked_array, studentID);
        for (int i=0; i < ranked_array.length; i++){
            if (ranked_array[i]==score ){
                rank=i;
                return rank;
            }
        }
        return rank;

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

    static int[] sortedScores(int[] array){ //k =100 or 101
        int k = 0;
        int[] sorted = new int[array.length];
        int[]count = new int[101];

        for (int i=0; i < array.length; i++){
            int j= array[i];
            count[j] +=1;
        }
        for (int i=101 -1; i >= 0; i--){
            while (count[i] !=0 ){
                sorted[k] = i;
                count[i] -=1;
                k+=1;
                    


            }
        }

        return sorted;

    }
    
}