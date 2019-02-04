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
	
	public void fillAscending(){
		
		
		for(int i = 0; i<arr.length;i++){
			arr[i] = i;
		}
	}
	
	public void fillDescending(){
		
		for(int i = arr.length; i>0;i--){
			arr[i-1] = i;
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
			System.out.println(i);
		}
	}
	
}
