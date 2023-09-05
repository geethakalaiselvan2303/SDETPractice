package mandatoryHomeWork.DSA.week1;

import org.junit.Test;
import org.testng.Assert;

public class Q64_CanPlaceFlowers {

	@Test
	public void test1() {
		boolean canPlaceFlower = CanPlaceFlower(new int[] {0,0,1,0,0}, 1);
		Assert.assertEquals(canPlaceFlower, true);
	}

//	@Test
//	public void test2() {
//		boolean canPlaceFlower = CanPlaceFlower(new int[] {}, 2);
//		Assert.assertEquals(canPlaceFlower, false);
//	}
//
//	@Test
//	public void test3() {
//		boolean canPlaceFlower = CanPlaceFlower(new int[] {0}, 1);
//		Assert.assertEquals(canPlaceFlower, true);
//	}
//
//	@Test
//	public void test4() {
//		boolean canPlaceFlower = CanPlaceFlower(new int[] {1}, 1);
//		Assert.assertEquals(canPlaceFlower, false);
//	}
	// o[1] + o[N]==> o[N] //1,0,0,0,1,0,0,2
	public boolean CanPlaceFlower(int[] flowerbed, int n) {
		 int count=0;
		 int size=flowerbed.length;
		 
		while(n>0) { 
		 if(flowerbed.length==1 && flowerbed[0]==0) {
     		count++;
     		}
		if(flowerbed.length>1) {
			 if(flowerbed[size-2]==0 && flowerbed[size-1]==0) {
	       		 flowerbed[size-1]=1;  
	       		 count++;
	       	}
		  if(flowerbed[0]==0 && flowerbed[1]==0) {
		        		 flowerbed[0]=1;  
		        		 count++;
		        	}
	        
		}
	    for(int i=1;i<flowerbed.length-1;i++){
	    	if(flowerbed[i]==0) {
	        			if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
	                    flowerbed[i]=1;  
	                    count++;
	                }
	        	}
	        }
			n--;
		}
	        if(count>=n){
	                return true;
	            }
	        return false; 
	}

}
