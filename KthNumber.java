import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int Tryer=commands.length;
        
        int count=0;
        int[] answer =new int[Tryer];
        while(Tryer-- >0) {
        	
        	int[] tmp=commands[count];
        	int start=tmp[0]-1;
        	
        	int end=tmp[1]-1;
        	
        	int select=tmp[2]-1;
        	
        	ArrayList<Integer>arrlist=new ArrayList<>();
        	
        	for(int i=start;i<=end;i++) {
        		arrlist.add(array[i]);
        		
        	}
        	Collections.sort(arrlist);
        	answer[count]=arrlist.get(select);
        	count++;	
        }
        return answer;
    }

}