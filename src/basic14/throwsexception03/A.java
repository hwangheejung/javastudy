package basic14.throwsexception03;

public class A {
	void checkScore(int score )throws MinusException,OverException{
		if(score<0) {
			throw new MinusException("예외 발생 : 음숫값 입력");
		}
		else if(score>100) {
			throw new OverException("예외 발생 : 100점초과");
			
		}
		else
			System.out.println("정상적인 값입니다.");
	}

}
