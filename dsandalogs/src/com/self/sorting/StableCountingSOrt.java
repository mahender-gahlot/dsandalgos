package com.self.sorting;

public class StableCountingSOrt {

	public static void main(String[] args) {
		
		int[] arr= {23,25,22,26,23,27,23,21,28};
		
		int min=21;
		int max=28;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		
		
		
		int[] countArr=new int[max-min+1];
		
		System.out.println("");
		
		for (int i = 0; i <= countArr.length; i++) {
			
			countArr[arr[i]-min]++;
		}
		
		
		for (int i = 0; i < countArr.length; i++) {
			System.out.print(countArr[i]+",");
		}
		
		System.out.println("\ncounting sort");
		
		int[] countingSorted=new int[arr.length];
		
		/*int j=0;
		for (int i = 0; i < countArr.length; i++) {
			
			while(countArr[i]>0) {
				countingSorted[j]=min+i;
				j++;
				countArr[i]--;
			}
			
		}
		for (int i = 0; i < countingSorted.length; i++) {
			System.out.print(countingSorted[i]+",");
		}
		*/
		

		
		
		
		int[] sizeArr=new int[countArr.length];
		int count=0;
		for (int i = 1; i < countArr.length; i++) {
			count=countArr[i]+count;
			sizeArr[i]=count;
		}
		
		System.out.println("\ncount");
		for (int i = 0; i < sizeArr.length; i++) {
			System.out.print(sizeArr[i]+",");
		}
		
		/*//{23,25,22,26,23,27,23,21,28}
		int j=0;
		for (int i = 0; i < sizeArr.length; i++) {
			
				countingSorted[i]=min+i;
			
		}*/
		//21,22,23,24,25,26,27,28,
		int[] temp=new int[arr.length];
		for(int i=arr.length-1;i>0;i--) {
			temp[--sizeArr[arr[i]-min]]=arr[i];
		}
		System.out.println("\n");
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]+",");
		}
		
		}
	}

