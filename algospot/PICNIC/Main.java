package algospot.PICNIC;

import java.util.Scanner;

class Main {
	
    static Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args) {
    	
        int cases = sc.nextInt();
        int[] answerArr = new int[cases];
        
        for(int i=0; i<cases; i++){
            int studentNum = sc.nextInt();
            int pairNum = sc.nextInt();
            answerArr[i] = getAnswer(studentNum, pairNum);
        }
        
        for(int num : answerArr){
        	System.out.println(num + " ");
        }
    }
    
    public static int getAnswer(int stuNum, int pairNum){
    	
    	boolean[][] pairArr = new boolean[stuNum][stuNum];
    	for(int i=0; i<pairNum; i++){
    		int stu1 = sc.nextInt();
    		int stu2 = sc.nextInt();
    		pairArr[stu1][stu2] = true;
    		pairArr[stu2][stu1] = true;
    	}
    	
    	boolean[] usedArr = new boolean[stuNum];
    	
    	int result = getResult(pairArr, usedArr, stuNum);
    	return result;
    }

	private static int getResult(boolean[][] pairArr, boolean[] usedArr, int stuNum) {
		
		int minIdx = -1;
		for(int i=0; i<stuNum; i++){
			if(!usedArr[i]){
				minIdx = i;
				break;
			}
		}
		
		if(minIdx == -1)
			return 1;
		
		
		int cnt = 0;
		for(int i=minIdx+1; i<stuNum; i++){
			if(pairArr[minIdx][i] && !usedArr[i]){
				usedArr[minIdx] = true;
				usedArr[i] = true;
				cnt += getResult(pairArr, usedArr, stuNum);
				usedArr[minIdx] = false;
				usedArr[i] = false;
			}
		}
		return cnt;
	}
}