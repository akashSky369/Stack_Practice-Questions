//  previous greater element
//         print the nearest greatest element on the left side of array

       int[] arr = {4,10,5,8,20,15,3,12};
       Stack<Integer> newStack = new Stack<>();
       for (int j : arr) {
           while (!newStack.empty() && newStack.peek() <= j) {
               newStack.pop();
           }
           if (newStack.empty()) {
               System.out.println(-1);
           } else {
               System.out.println(newStack.peek());
           }
           newStack.push(j);
       }
