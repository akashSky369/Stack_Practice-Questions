class Solution {
   public int largestRectangleArea(int[] arr) {
         int n=arr.length;

         // code to find right boundary
        int rb[]=new int[n];
        Stack<Integer> s1=new Stack<>();
        s1.push(n-1);
        rb[n-1]=n;
        for(int i=n-2; i>=0; i--){
        while(s1.size()>0 && arr[i]<=arr[s1.peek()]){
            s1.pop();
        }
        if(s1.size()==0){
            rb[i]=n;
        }
        else{
            rb[i]=s1.peek();
        }
            s1.push(i);
        }
//  code to find left boundary
        int lb[]=new int[n];
        Stack<Integer> s2=new Stack<>();
         s2.push(0);
        lb[0]=-1;
        for(int i=1; i<n; i++){
            while(s2.size()>0 && arr[i]<=arr[s2.peek()]){
                s2.pop();
            }
            if(s2.size()==0){
                lb[i]=-1;
            }
            else{
                lb[i]=s2.peek();
            }
            s2.push(i);
        }

        int maxArea=0;
        for(int i=0; i<n; i++){
           int  width=rb[i]-lb[i]-1;
           maxArea=Math.max(maxArea,arr[i]*width);
        }
        return maxArea;
     }
}
