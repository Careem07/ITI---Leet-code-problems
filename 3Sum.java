class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        List<List<Integer>> outerList = new ArrayList();

        if(nums.length < 3 ) return outerList;
        
        for (int i = 0 ; i < nums.length-2 ; i++){
            for(int j = i + 1 ; j < nums.length-1 ; j++){
                for(int k = j + 1 ; k < nums.length ; k++){
                    
                    int first = nums[i];
                    int second = nums[j];
                    int third = nums[k];
                    List<Integer> innerList = new ArrayList();
                    if(first + second + third == 0 ){
                       innerList.add(first);
                       innerList.add(second);
                       innerList.add(third);
                         Collections.sort(innerList);
                        if(!outerList.contains(innerList))
                            outerList.add(innerList);
                
                    }
                }
            }
        }
                
        return outerList;
    }
}