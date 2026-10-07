class Solution {
    public List<String> removeInvalidParentheses(String s) {
        int left = 0, right = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') left++;
            else if (c == ')') {
                if (left > 0) left--;
                else right++;
            }
        }
        Set<String> answers = new HashSet<>();
        dfs(s, 0, 0, left, right, new StringBuilder(), answers);
        return new ArrayList<>(answers);
    }

    private void dfs(String s, int i, int balance, int left, int right,
                     StringBuilder path, Set<String> answers) {
        if (s.length() - i < left + right + balance) return;
        if (i == s.length()) {
            if (balance == 0 && left == 0 && right == 0)
                answers.add(path.toString());
            return;
        }
        char c = s.charAt(i);
        int length = path.length();
        if (c == '(') {
            if (left > 0)
                dfs(s, i + 1, balance, left - 1, right, path, answers);
            path.append(c);
            dfs(s, i + 1, balance + 1, left, right, path, answers);
        } else if (c == ')') {
            if (right > 0)
                dfs(s, i + 1, balance, left, right - 1, path, answers);
            if (balance > 0) {
                path.append(c);
                dfs(s, i + 1, balance - 1, left, right, path, answers);
            }
        } else {
            path.append(c);
            dfs(s, i + 1, balance, left, right, path, answers);
        }
        path.setLength(length);
    }
}