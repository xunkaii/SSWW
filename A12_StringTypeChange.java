package javaexp.a01_begin;

public class A12_StringTypeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
 			문자열을 정수형 변환 
  				- 내장된 Integer 객체의 parseInt()를 메소드를 통해서 "정수형문자열"을 숫자형으로 변환
  					ex) "25.7"(X) / "이십오"(X) / "30"(O)
  					int num01 = Integer.pareInt("25")
  			문자열을 실수형 변환
  				- 내장된 Double 객체의 parseDouble()을 메소드를 통해서 "실수형문자열"을 실수형으로 변환
  				 	double num02 = Double.parseDouble("3.14")
  				 	ex) "25"(O) / "이십오점사" (X) / "3.14" (O)
 */
		int num01 = Integer.parseInt("25");
		System.out.println(num01+25);
		
		String num02Str = "30.15"; // 반드시 정수형 문자열이어야한다.
		// int num02 = Integer.parseInt(num02Str); // =실행에러 ("30.15"는 실수형문자열) / 컴파일은 되지만 실행시 에러발생
		//System.out.println(num02+20);
		double num02 = Double.parseDouble(num02Str);
		System.out.println(num02+30.5); // 실수형변환에서 정수형문자열은 전환이 된다.
		System.out.println(Double.parseDouble("30")+0.7);
		
		// ex1) 문자열 "70"과 "20"을 정수형으로 형변환하여 합산된 결과를 출력하세요
			int num10 = Integer.parseInt("70");
			int num11 = Integer.parseInt("20");
			System.out.println(num10+(num11));
			
			String str10 = "70";
			String str11 = "20";
			int num03 = Integer.parseInt(str10);
			int num04 = Integer.parseInt(str11);
			System.out.println(num03+num04);
			System.out.print(str10+" + "+str11 + " = ");
			System.out.println(num03+num04);
		// ex2) 문자열 "30.7"과 "40.2"를 실수형으로 형변환하여 합산된 결과를 출력하세요
			double num12 = Double.parseDouble("30.7");
			double num13 = Double.parseDouble("40.2");
			System.out.println((num12)+(num13));
		
			String str03 = "30.7";
			String str04 = "40.2";
			double num05 = Double.parseDouble(str03);
			double num06 = Double.parseDouble(str04);
			System.out.print(str03+" + "+str04 + " = ");
			System.out.println(num05+num06);
		
		
		
		
	}

}
