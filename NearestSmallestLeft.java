// Given an array
//         print nearest smallest element on the left side of array
//         print the array

    int[] arr = {4,10,5,8,20,15,3,12};
        Stack<Integer> myStack = new Stack<>();
        for (int j : arr) {
            while (!myStack.empty() && myStack.peek() >= j) {
                myStack.pop();
            }
            if (myStack.empty()) {
                System.out.println(-1);
            } else {
                System.out.println(myStack.peek());
            }
            myStack.push(j);
        }
