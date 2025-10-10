public class CountVowels {
    public static void main(String[] args) {
        String str = "abhinandan";
        char[] chars = str.toCharArray();
        int count = 0;

        for (int i=0;i<str.length();i++){
            if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i'||
               chars[i] == 'o' || chars[i] == 'u'){
                count++;
            }
        }
        System.out.println(" No of vowels in Sting are " + count);
    }
}
