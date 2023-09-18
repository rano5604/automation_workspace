import java.util.HashSet;

public class Test1 {
	
	public static void main (String arg[]){
		
		
		int[] arra = new int[]{2,3,4,5,2,1,4,1,2,4,5,6,5,9,4,7,9,6,4};
		
		int count=0;
		HashSet<Integer> unmatched = new HashSet<Integer>();
		
		for (int i=0;i<arra.length;i++){
			if(!unmatched.add(arra[i])){
				unmatched.remove(arra[i]);
				count++;
			}
			else
				unmatched.add(arra[i]);
			
		}
		System.out.println(count);
	}

}
