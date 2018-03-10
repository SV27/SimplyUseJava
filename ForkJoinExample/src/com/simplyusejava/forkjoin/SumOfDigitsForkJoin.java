package com.simplyusejava.forkjoin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class SumOfDigitsForkJoin extends RecursiveAction {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int[] digits;
	
	private List<Integer> sumOfDigits;
	
	private static final int threshold = 5;
	
	SumOfDigitsForkJoin(int[] digits, List<Integer> sum){
		this.digits = digits;
		this.sumOfDigits = sum;
	}

	@Override
	protected void compute() {
		// TODO Auto-generated method stub
		if(this.digits.length <= threshold) {
			calculateSum();
		}else {
			int[] task_1 = Arrays.copyOfRange(this.getDigits(), 0, threshold);
			int[] task_2 = Arrays.copyOfRange(this.digits, threshold, this.digits.length);
			invokeAll(new SumOfDigitsForkJoin(task_1, this.sumOfDigits), new SumOfDigitsForkJoin(task_2, this.sumOfDigits));
		}
	}
	
	synchronized void calculateSum() {
		int tempSum = 0;
		for(int i : this.digits) {
			tempSum += i;
		}
		this.sumOfDigits.add(tempSum);
	}

	public int[] getDigits() {
		return digits;
	}

	public void setDigits(int[] digits) {
		this.digits = digits;
	}

	public List<Integer> getSumOfDigits() {
		return sumOfDigits;
	}

	public void setSumOfDigits(List<Integer> sumOfDigits) {
		this.sumOfDigits = sumOfDigits;
	}
	
	public static void main(String[] args) {
		
		int[] digits = new int[10];
		
		for(int i = 0; i<10; i++) {
			digits[i] = i+1;
		}
		
		List<Integer> sumOfDigits = new ArrayList<>();
		
		SumOfDigitsForkJoin ex = new SumOfDigitsForkJoin(digits, sumOfDigits);
		
		ForkJoinPool fp = ForkJoinPool.commonPool();
		fp.invoke(ex);
		
		System.out.println(ex.getSumOfDigits());
		
	}
	


}
