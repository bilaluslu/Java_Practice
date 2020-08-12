package day25_Methods_Recap;

public class warm_Up_Frequency {
    public static void main(String[] args) {
/*
write a return method that accepts two strings str1 & str2, and returns the frequency of str2 in str1 as an int
		Ex:
			Frequency("AAABB", "A");  ==> 3
			Frequency("ABAB", "B"); ==> 2
 */
        String str1 = "javajavajavajavajava";
        String str2 = "java";

        int count = 0;
        while ( str1.contains(str2) ) {
            count++;
            str1 = str1.replaceFirst(str2,"");
        }
        System.out.println(count);

        String str3 = "python python python python python python python python";
        String str4 = "python";
        int number1 = Frequency(str3,str4);
        System.out.println(number1);
    }

        public static int Frequency ( String str1, String str2) {
            int count = 0;
            while ( str1.contains(str2) ) {
                count++;
                str1 = str1.replaceFirst(str2,"");
            }
            return count;
        }















}
