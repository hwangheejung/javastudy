package basic14.enum04;

public enum City {
	SEOUL(200),BUSAN(100),JEJU(50);

	int population; //인스턴스 변수 선언
	
	City(int population){ //무조건 private 생성자
		this.population=population;
	}
	public int getPopulation() { //인스턴스 메소드 선언 가능
		return population; 
	}
}
