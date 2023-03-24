class removeAdjacent {
    static String func(String input, int prev, int idx) {
        // base
        if (idx == input.length() - 1) {
            if (input.charAt(idx) == input.charAt(prev))
                return input.substring(0, prev);
            else {
                if (prev > 0)
                    return input.substring(0, prev) + input.substring(idx);
                else
                    return input.substring(idx);
            }
        }

        // recur
        if (input.charAt(idx) != input.charAt(prev)) {
            if (idx - 1 != prev) {
                if (prev > 0)
                    return func(input.substring(0, prev) + input.substring(idx), prev - 1, prev);
                else
                    return func(input.substring(idx), 0, 1);
            } else
                return func(input, prev + 1, idx + 1);
        } else
            return func(input, prev, idx + 1);
    }

    static String rmvAdjacentString(String s) {
        String ans = func(s, 0, 1);
        return ans;
    }

    public static void main(String args[]) {
        String s = "azxxzy";
        System.out.println(rmvAdjacentString(s));
    }
}