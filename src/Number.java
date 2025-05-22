public class Number {
//    ----Number Reverse Strat ------
    Integer reverseNumber(int number) {
        int reverse = 0;
        int reminder ;
        while(number != 0) {
            reminder = number % 10;
            reverse = reverse *10 + reminder;
            number = number/10;
        }
        return reverse;
    }
//    ----Number Reverse End ------

//    -----String Reverse Start ------
         String reverseString(String str) {
             String reverse = "";
             for(int i = str.length() - 1; i >= 0; i--) {
                 reverse = reverse + str.charAt(i);
             }

             return reverse;
         }


//    -----String Reverse End ------

//    ----- remove elements from array start------
//      int removeElement(int num[],int val){
//
//      }

//    ----- remove elements from array end------
}
