package mycom.dept.test;

public class Main {
	public static void main(String[] args) {
		
//		boolean[] w = {false, true}; // money, hasCard
//		
//		if(w[0] == true || w[1] == true) {
//			System.out.println("택시 타고 가라.");
//		}
//		else {
//			System.out.println("걸어가라.");
//		}
		
		int[] nums = {10, 8, 27, 34, 56, 34, 55, 31, 23, 44, 57, 88};

//		int sum=0;
//		for(int i = 0; i < nums.length; i++) {
//			sum+=nums[i];
//		}
//		System.out.println("합계: " + sum);
//		
//		sum=0;
//		// 향상된 모델
//		for(int num:nums) {
//			sum+=num;
//		}
//		System.out.println("for each 합계: " + sum);
		
		// 짝수
//		for(int num:nums) {
//			if(num % 2 == 0) {
//				System.out.println("짝수: " + num);
//			}
//		}
		for(int i = 0; i < nums.length; i++) {
			// 짝수인 데이터만 출력
			if(nums[i] % 2 == 0) {
				System.out.println("짝수: " + nums[i]);
			}
		}
		
		// 3의 배수
//		for(int num:nums) {
//			if(num % 3 == 0) {
//				System.out.println("3의 배수: " + num);
//			}
//		}
		for(int i = 0; i < nums.length; i++) {
			// 3의 배수인 데이터만 출력
			if(nums[i] % 3 == 0) {
				System.out.println("3의 배수: " + nums[i]);
			}
		}
		
		// 평균 값 출력
		int total=0;
		for(int i = 0; i < nums.length; i++) {
			total += nums[i];
		}
//		for(int num:nums) {
//			total+=num;
//		}
		double avg = (double)total/nums.length;
		System.out.println("평균: " + avg);
		
		int tmp;
		System.out.print("오름차순 정렬: ");
		// 순서대로 나열 후, 1/4, 2/4, 3/4 지점 값 찍기
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if(nums[i] > nums[j]) {
					tmp = nums[i];
					nums[i] = nums[j];
					nums[j] = tmp;
				}
			}
			System.out.println(nums[i]);
		}
		for(int i = 0; i < nums.length; i++) {
			if(i == nums.length / 4) {
				System.out.println("1/4 지점: " + nums[i]);
			}
			else if(i == nums.length / 2) {
				System.out.println("1/2 지점: " + nums[i]);
			}
			else if(i == nums.length / 2 + nums.length / 4) {
				System.out.println("3/4 지점: " + nums[i]);
			}
		}
		
		// 카페 업로드
		/*
		for(int i = 0; i < nums.length; i++) {
			// 홀수인 데이터만 출력
			if(nums[i] % 2 == 1) {
				System.out.println("홀수: " + nums[i]);
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			// 3의 배수인 데이터만 출력
			if(nums[i] % 3 == 0) {
				System.out.println("3의 배수: " + nums[i]);
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			// 5의 배수인 데이터만 출력
			if(nums[i] % 5 == 0) {
				System.out.println("5의 배수: " + nums[i]);
			}
		}
		*/
	}
}
