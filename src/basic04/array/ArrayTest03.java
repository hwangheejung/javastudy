package basic04.array;

public class ArrayTest03 {
	public static void main(String[] args) {
		int[][] score = { //2차원 배열 선언
				{100,90,80,70}, 
				{90,80,70,60},
				{80,70,60,50}
		};
		
		System.out.println(score.length);//3
	
		for(int i=0;i<score.length;i++) {
			int sum=0;
			double avg=0;
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+" ");
				sum+=score[i][j];
				avg  = sum/score[i].length;
				
			}
			System.out.print(sum+" ");
			System.out.print(avg);
			System.out.println();
		}
		
	}

}
