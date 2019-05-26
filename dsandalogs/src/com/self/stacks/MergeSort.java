package com.self.stacks;

public class MergeSort {
	private	int[]	arr;			
	private	void	merge(int[]	arr,int[]	tempArray,	int	lowerIndex,	int	middleIndex,	int	upperIndex)	
	{		
		System.out.println("calling merge  "+lowerIndex+" "+ middleIndex+"<-lower, upper-> "+(middleIndex+1)+" "+upperIndex);
				
		int	lowerStart=lowerIndex;						
		int	lowerStop=middleIndex;			
		int	upperStart=middleIndex+1;		
		int	upperStop=upperIndex;			
		int	count=lowerIndex;			
		while(lowerStart<=lowerStop	&&	upperStart<=upperStop)	
		{													
			if(arr[lowerStart]<arr[upperStart])		
				tempArray[count++]=arr[lowerStart++];	
			else									
				tempArray[count++]=arr[upperStart++];
		}											
		while(lowerStart<=lowerStop)				
		{											
			tempArray[count++]=arr[lowerStart++];		
		}											
		while(	upperStart<=upperStop)				
		{										
			tempArray[count++]=arr[upperStart++];	
		}										
		for(int	i=lowerIndex;i<=upperIndex;i++)		
			arr[i]=tempArray[i];	
		//System.out.println("end of merge");
	}										
	private	void	mergeSrt(int[]	arr,int[]	tempArray,	int	lowerIndex,	int	upperIndex)		
	{													
		if(lowerIndex	>=	upperIndex)	{		

			System.out.println("***********returnign from merge sort");
			return;						}
		int	middleIndex=(lowerIndex+upperIndex)/2;	
		System.out.println("before lower merge sort "+lowerIndex+" "+ middleIndex+"<-lower, upper-> "+(middleIndex+1)+" "+upperIndex);
		
		mergeSrt(arr,tempArray,lowerIndex,middleIndex);
		System.out.println("before upper merge sort "+lowerIndex+" "+ middleIndex+"<-lower, upper-> "+(middleIndex+1)+" "+upperIndex);
		mergeSrt(arr,tempArray,middleIndex+1,upperIndex);
//System.out.println("calling merge");
		//printMerge(arr);
		System.out.print("before");
		printMerge(tempArray);
		merge(arr,tempArray,lowerIndex,middleIndex,upperIndex);		
		System.out.print("after");
		printMerge(tempArray);
		
	}

	public	void	sort()					


	{									
		int	size	=	arr.length;			

		int[]	tempArray=	new	int[size];	
		mergeSrt(arr,tempArray,0,size-1);			
	}											
	public	MergeSort(int[]	array)			

	{										
		arr	=	array;								
	} 


static void printMerge(int[] array){
	for(int	i=0;i<array.length	;i++)																
	{																							
		System.out.print(array[i]	+	",");																		
	}		
	System.out.println("");
}


	public	static	void	main(String[]	args)	{	
		int[]	array={4,3,2,1,7,5,8,6};	
		MergeSort	m	=	new	MergeSort(array);
		m.sort();							
		printMerge(array);
									} 
}
