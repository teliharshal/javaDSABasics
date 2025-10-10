public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "nitin";
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        String reverse = new String(arr);
        System.out.println(reverse);

        if(str.equals(reverse)){
            System.out.println(str + " is palindrome ");
        }else {
            System.out.println(str + " is not palindrome");
        }

    }
}
