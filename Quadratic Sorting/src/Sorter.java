//Kevin Falconetts
public class Sorter {
	
	private int size;
	
	private int[] arr;
	
	public Sorter(int size){
		this.size = size;
		arr = new int[size];
	}
	
	public int getSize(){
		return size;
	}
	
	public void setSize(int number){
		size = number;
	}
	
	public int[] getArr(){
		return arr;
	}
	
	public void setArr(int[] newArr){
		arr = newArr;
	}
	
	public void sort(){
		
		int swaps = 0;
		int comparisons = 0;
		//size variable =  length of the array
		for(int i = 0; i<size-1;i++){
			for(int i2 = 0; i2< size-i-1; i2++){
				comparisons++;
				if(arr[i2] > arr[i2+1]){
					
					//this is where the swap happens
					
					swaps++;
					int temp = arr[i2];
					arr[i2] = arr[i2+1];
					arr[i2+1] = temp;
					
				}
				
			}
		}
		System.out.println("Comparisons: " +comparisons);
		System.out.println("Swaps: " +swaps);
		}
	
	
	public int median(int mid, int left, int right) {
		//finds median of three
		int[] medians = {mid,left,right};
		
		int highest = 0;
		int lowest = right;
		int med = 0;
		
		for(int x: medians){
			
			for(int i: medians){
					
				if(i >= highest){
					highest = i;
				}
				else if(i <= lowest){
					lowest = i;
				}
				else{
					med = i;
					}
			}		
		}
		return med;
	}

	
	public int[] quickSort(int[] list, int left, int right,int swaps, int comparisons) {
		
			
			if(left>=right) {
				return list;
			}
			
			
			int leftNum = list[left];
			int rightNum = list[right];
			int mid = list[(right+left)/2];
			int pivot = median(mid,leftNum,rightNum);
			
			while(left<=right) {
				
				
				
				//if the element at left is less than pivot
				if(list[left]<pivot) {
					//pass it and add a comparison
					comparisons++;
					left++;
				} 
				
				
				//if element at right is greater than the pivot
				else if(list[right]>pivot) {
					//pass it and add comparison
					comparisons++;
					right--;
				} 
				//the elements should be right for swapping
				else {
					comparisons++;
					swaps++;
					int temp = list[left];
					list[left]=list[right];
					list[right]=temp;
				}
				
				//if left and right are both equal to the pivot
				if(list[left]==pivot && list[right]==pivot){
					//pass
					left++;
					right--;
				}
				
				
			}
			
			quickSort(list,left, right, swaps, comparisons);
						
			System.out.println("Swaps: " +swaps);
			System.out.println("Comparisons: " +comparisons);
			return (quickSort(list,left,right, swaps, comparisons));
	}
	

	
	public void testQuick(){
		fillDescending();
		printSorter();
		quickSort(arr, 0, size -1, 0, 0);
		
		
	}
	
	
	public void fillAscending(){
		
		
		for(int i = 0; i<arr.length;i++){
			arr[i] = i;
		}
	}
	
	public void fillDescending(){
		
		for(int i = 0; i<size;i++){
			arr[i] = size -i;
		}
	}
	
	public void fillRandom(){
		int max = arr.length +1;
		
		for(int i = 0; i<arr.length; i++){
			arr[i]= (int) (Math.random()*max);
		}
		
	}
	
	public void test(){
		System.out.println("Size: " +size);
		this.fillRandom();
		System.out.println("Random");
		this.sort();
		System.out.println("Ascending");
		this.fillAscending();
		this.sort();
		System.out.println("Descending");
		this.fillDescending();
		this.sort();
		System.out.println("");
	}
	
	public void printList(int[] arr){
		
		for(int i : arr){
			System.out.print(i +" ");
		}
		System.out.println("");
	}
		
	
	
	public void printSorter(){
		for(int i : arr){
			System.out.print(i +" ");
		}
		System.out.println("");
	}
	
}
