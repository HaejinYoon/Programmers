import java.util.Arrays;

public class kth_Letter{





    public static int[] solution(int[] array, int[][] commands) {
        
    	int[] answer = new int[commands.length];
    	int i=0;
    	for(int[] item : commands) {
    		int[] sub = Arrays.copyOfRange(array, item[0]-1, item[1]);
    		Arrays.sort(sub);
    		
    		answer[i]=sub[item[2]-1];
    		i++;
        }
        return answer;
    }

}
