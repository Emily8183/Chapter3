import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumList {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(4);
        numList.add(5);
        numList.add(6);
        numList.add(7);
        numList.add(8);
        numList.add(9);
        numList.add(10);

        //this is when it's static, you don't have to create a new instance.
        Integer totalNum = sumEven(numList);
        System.out.println(totalNum);

        //these are all the words given by me
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("pears");
        words.add("bananas");
        words.add("watermelons");
        words.add("pineapples");
        words.add("oranges");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int numRequest = input.nextInt();

        input.close();

        filterWords(words,numRequest);

        //these are the words from ArrayPractice

        String quote = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] quoteStr = quote.split(" ");
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList(quoteStr));

        filterWords(arr, numRequest);

    }

    // sumEven is the method's name
    public static int sumEven(ArrayList<Integer> arr){
        int total=0;
        for (int integer: arr){
            if(integer % 2==0){
                total+= integer;
            }
        }
        return total;
    }

        //When it's not static, it requires to create an instance of NumList.
//        NumList nm = new NumList();
//
//        Integer result = nm.sumEven(numList);
//
//        System.out.println(result);
//
//    }

    //method can't go inside of another method
//        public int sumEven(ArrayList<Integer> arr) {
//            int total = 0;
//            for (int integer : arr) {
//                if (integer % 2 == 0) {
//                    total += integer;
//                }
//            }
//            return total;
//        }

// String has to be capitalized. 'int' doesnt need to be.
    public static void filterWords(ArrayList<String> arr, Integer numRequested){
        for (String word: arr){
            //in java, length is a method, so it needs to be "length()"

            if (word.length() == numRequested) {
                System.out.println(word);
            }
        }
    }
}
