// Remove Duplicates in a String
// Example 1: input:  churchischurch
//            output: churis
// Example 2: input:  unstopableistheworld
//            output: unstopableihwrd
public class l_Remove_Duplicates_in_a_String {
    public static void RemoveDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(idx);
        int index = ch - 'a';
        if (map[index] == true)
            RemoveDuplicates(str, idx + 1, newStr, map);
        else {
            map[index] = true;
            RemoveDuplicates(str, idx + 1, newStr.append(ch), map);
        }
    }

    public static void main(String args[]) {
        RemoveDuplicates("apnacollege", 0, new StringBuilder(""), new boolean[26]);

    }
}
