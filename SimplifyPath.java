class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        String[] parts = path.split("/");
        
        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(part);
            }
        }

        StringBuilder simplifiedPath = new StringBuilder();
        while (!stack.isEmpty()) {
            simplifiedPath.insert(0, "/" + stack.pop());
        }
        return simplifiedPath.length() == 0 ? "/" : simplifiedPath.toString();
    }
}