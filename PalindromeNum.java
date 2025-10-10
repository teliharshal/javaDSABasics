public class PalindromeNum {
    public static void main(String[] args) {
        int num = 123;
        int original = num;
        int rev = 0;
        while(num != 0){
            int digit = num%10;
            rev = rev*10+digit;
            num /= 10;
        }
        if(original == rev){
            System.out.println("Num is Palindrome ");
        }else {
            System.out.println("Num is not Palindrome ");
        }
    }
}
