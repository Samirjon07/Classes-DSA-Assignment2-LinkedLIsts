public class IsPalindrome {

    public static boolean isPalindrome(String word) {
        if (word == null || word.length() == 0) {
            return true;
        }

        // make lowercase to handle case insensitivity
        word = word.toLowerCase();

        DoublyLinkedList list = new DoublyLinkedList();

        // fill list
        for (int i = 0; i < word.length(); i++) {
            list.append((int) word.charAt(i));
        }

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            if (list.get(left) != list.get(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}