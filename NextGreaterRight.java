//  print the greater element in the right
        Deque<Integer> myStack = new ArrayDeque<>();
        int[] arr = {3,10,5,1,15,10,7,6};
        int[] helper = new int[arr.length];

        for (int i =arr.length-1; i>=0; i--){
            while (!myStack.isEmpty() && myStack.peek()<=arr[i]){
                myStack.pop();
            }
            if (myStack.isEmpty()){
                helper[i] = -1;
            }
            else{
                helper[i] = myStack.peek();
            }
            myStack.push(arr[i]);
        }

        System.out.println(Arrays.toString(helper));
