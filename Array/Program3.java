import java.util.*; 
public class Main{
	public static ArrayList<Integer> findDuplicates(int arr[]){
    Set<Integer> duplicates = new HashSet<>();
    int index;
    for(int i = 0; i < arr.length; i++){
			index = Math.abs(arr[i]) - 1;
			if(arr[index] < 0){
				duplicates.add(Math.abs(arr[i]));
			}
			else{
				arr[index] = -arr[index];
			}
		}
		for(int i = 0; i < arr.length; i++){
			arr[i] = Math.abs(arr[i]);
		}
    return new ArrayList<Integer>(duplicates);
  }
	public static void main(String[] args) {
		int arr[] = {2, 1, 5, 2, 5, 6};
	  System.out.println( findDuplicates(arr) );
	}
}
