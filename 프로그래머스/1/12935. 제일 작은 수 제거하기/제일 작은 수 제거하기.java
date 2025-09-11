class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min;
        int cnt=0;
        int j=0;
        int min_have=0;
        if (arr.length == 1) 
        {
            return answer = new int[]{-1};
        }        
        min= arr[0];
        
        for(int i=0 ; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            } 
        }
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]!=min)
            {
                cnt++;
            }
        }
        
        answer = new int[cnt];
        
        for(int i=0; i<arr.length; i++)    
        {
            if(arr[i]!=min)
            {
                answer[j++] = arr[i];
                min_have =1;
            }
        }    
        
    
        return answer;
    }
}