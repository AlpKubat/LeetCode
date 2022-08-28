public class palindromeNumber {


    public static void main(String[] args){
            int number = 1001;
            System.out.print(isPalindrome(number));
        }




        public static boolean isPalindrome(int x) {
            String strX = "" + x;
            int first = 0, last = strX.length()-1;
            while (first < last)
            {
                if(strX.charAt(first) != strX.charAt(last))
                    return false;
                first += 1;
                last -= 1;
            }
            return true;
        }

}

