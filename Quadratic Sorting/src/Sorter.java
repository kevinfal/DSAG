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
	
	public void printSorter(){
		for(int i : arr){
			System.out.print(i +" ");
		}
		System.out.println("");;
	}
	
}
