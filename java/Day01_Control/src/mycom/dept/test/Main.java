package mycom.dept.test;

public class Main {
	public static void main(String[] args) {
		
//		boolean[] w = {false, true}; // money, hasCard
//		
//		if(w[0] == true || w[1] == true) {
//			System.out.println("�ý� Ÿ�� ����.");
//		}
//		else {
//			System.out.println("�ɾ��.");
//		}
		
		int[] nums = {10, 8, 27, 34, 56, 34, 55, 31, 23, 44, 57, 88};

//		int sum=0;
//		for(int i = 0; i < nums.length; i++) {
//			sum+=nums[i];
//		}
//		System.out.println("�հ�: " + sum);
//		
//		sum=0;
//		// ���� ��
//		for(int num:nums) {
//			sum+=num;
//		}
//		System.out.println("for each �հ�: " + sum);
		
		// ¦��
//		for(int num:nums) {
//			if(num % 2 == 0) {
//				System.out.println("¦��: " + num);
//			}
//		}
		for(int i = 0; i < nums.length; i++) {
			// ¦���� �����͸� ���
			if(nums[i] % 2 == 0) {
				System.out.println("¦��: " + nums[i]);
			}
		}
		
		// 3�� ���
//		for(int num:nums) {
//			if(num % 3 == 0) {
//				System.out.println("3�� ���: " + num);
//			}
//		}
		for(int i = 0; i < nums.length; i++) {
			// 3�� ����� �����͸� ���
			if(nums[i] % 3 == 0) {
				System.out.println("3�� ���: " + nums[i]);
			}
		}
		
		// ��� �� ���
		int total=0;
		for(int i = 0; i < nums.length; i++) {
			total += nums[i];
		}
//		for(int num:nums) {
//			total+=num;
//		}
		double avg = (double)total/nums.length;
		System.out.println("���: " + avg);
		
		int tmp;
		System.out.print("�������� ����: ");
		// ������� ���� ��, 1/4, 2/4, 3/4 ���� �� ���
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
				System.out.println("1/4 ����: " + nums[i]);
			}
			else if(i == nums.length / 2) {
				System.out.println("1/2 ����: " + nums[i]);
			}
			else if(i == nums.length / 2 + nums.length / 4) {
				System.out.println("3/4 ����: " + nums[i]);
			}
		}
		
		// ī�� ���ε�
		/*
		for(int i = 0; i < nums.length; i++) {
			// Ȧ���� �����͸� ���
			if(nums[i] % 2 == 1) {
				System.out.println("Ȧ��: " + nums[i]);
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			// 3�� ����� �����͸� ���
			if(nums[i] % 3 == 0) {
				System.out.println("3�� ���: " + nums[i]);
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			// 5�� ����� �����͸� ���
			if(nums[i] % 5 == 0) {
				System.out.println("5�� ���: " + nums[i]);
			}
		}
		*/
	}
}
