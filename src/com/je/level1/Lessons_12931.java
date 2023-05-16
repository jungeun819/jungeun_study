package com.je.level1;

public class Lessons_12931 {

	/**
	 * Q. 자릿수 구하기
	 * 
	 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
	 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
	 */
	public static void main(String[] args) {
		Lessons_12931 test = new Lessons_12931();
		test.solution(123); // 6
		test.solution(987); // 24
	}
	
	public int solution(int n) {
        int answer = 0;
        
        // 숫자 문자열 변환  # 숫자 인덱스를 구하기 위해
        String temp = String.valueOf(n);
        
        // 해당 인덱스의 문자 숫자로 변환 후 더하기 
        for(int i = 0; i < temp.length(); i++) {
        	answer += Character.getNumericValue(temp.charAt(i));
        }
        
        return answer;
	}

}
