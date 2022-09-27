static boolean compilerOutput(String code) {
        // Write your code here
        Stack<Character> stack = new Stack<>();
        for(char c : code.toCharArray()){
            if(c=='('||c=='[' || c == '{'){
                stack.push(c);
            }
            else{

                if(c==')'){
                    if(stack.isEmpty() || stack.peek()!='('){
                        return false;
                    }
                    else {
                        stack.pop();
                    }
                }
                else if(c==']'){
                    if(stack.isEmpty() || stack.peek()!='['){
                        return false;
                    }
                    else {
                        stack.pop();
                    }
                }
                else if(c=='}'){
                    if(stack.isEmpty() || stack.peek()!='{'){
                        return false;
                    }
                    else {
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }
