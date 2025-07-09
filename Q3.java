class Solution {
    
	
    public static boolean find(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(target == arr[i]){
			
                return true;
            }
        }
		
        return false;
    } 
    
    public int numComponents(ListNode head, int[] nums) {
        int connected = 0;
        int found = 0;
		

        while(head != null){
            if(find(nums, head.val)){

                found++;

                if(found == 1){
                    connected++;
                }
            }

            else{
                found=0;
            }
            head = head.next;
        }
		
        return connected;
    }
}