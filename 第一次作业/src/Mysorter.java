
public class Mysorter extends Sorter{

	
	

	public void kuaipai(float[] a, int left, int right) {
		// TODO Auto-generated method stub
		
		int originleft = left;
		int originright = right;
		float base = a[left];
		
		while(left<right){
			
			while(left<right && a[right]>=base){
				right--;
			}
			
			a[left] = a[right];
			
			while(left<right && a[left]<=base){
				left++;
			}
			
			a[right] = a[left];
			
		}
		
		a[left] = base;
		if(originleft<left){

			kuaipai(a, originleft, left-1);
		}
		if(left<originright){
			
			kuaipai(a, left+1, originright);
		}
	}

	@Override
	public void charupaixu(float[] a) {
		// TODO Auto-generated method stub
		
		int i;
		for( i=1; i<a.length-1; i++){
			
			float temp = a[i];
			int j;
			for (j=i-1; j>=0; j--){
				
				if (a[j]>temp){
					
					a[j+1] = a[j];
				
				}else{
					
					break;
					
				}
				
			}
			a[j+1] = temp;
			
		}
	}

	@Override
	public void maopao(float[] A) {
		// TODO Auto-generated method stub
		int len = A.length;
		
		int i,j;
		float key;
		
		for(i = 0; i < len-1; i++){
			
			for(j = 0; j < len-i-1;j++){
				
				if(A[j+1]<A[j]){
					
					key = A[j+1];
					A[j+1] = A[j];
					A[j] = key;
					
				}
			}
		}
		
	}
	
	
	
	
	
}
