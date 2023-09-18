
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=0;
		int [] arra =  new int[]{2,1,4,3,6,2,1,2,2,3,4,4,5,7,8,9,8,5,4,1,11,11,7};
		
		for (int i=0;i<arra.length;i++)
		{
			for(int j=i+1;j<arra.length;j++){
				if(!(arra[i]<arra[j])){
					int temp=arra[j];
					arra[j]=arra[i];
					arra[i]=temp;
				}
			}
		}
	for(int i=0;i<arra.length;i++){
		System.out.println(arra[i]);
	}
	 
	for(int i=0;i<arra.length-1;i++){
		if(arra[i]==arra[i+1])
			{
				count++;
				i=i+1;
			}
	}
	System.out.println("Pair:"+count);
	}


		
}
