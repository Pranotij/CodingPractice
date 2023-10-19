import Streams.*;
import leetCode.MergeTwoArrays;
import stack.*;

public class Main {
    public static void main(String[] args) {
        //stack
     NextGreaterNumberRight nextGreaterNumberRight = new NextGreaterNumberRight();
     NextGreaterNumberLeft nextGreaterNumberLeft = new NextGreaterNumberLeft();
     NextSmallestNumberRight nextSmallestNumberRight = new NextSmallestNumberRight();
     NextSmallestNumberLeft nextSmallestNumberLeft = new NextSmallestNumberLeft();
     StockSpanProblem spanProblem = new StockSpanProblem();
     MaxAreaHistrogram maxAreaHistrogram = new MaxAreaHistrogram();
     MaxRectOfBinaryMatrix maxRectOfBinaryMatrix = new MaxRectOfBinaryMatrix();

     //LeetCode
        MergeTwoArrays mergeTwoArrays = new MergeTwoArrays();

        //Basics Of Stream API
        StringEmpty stringEmpty = new StringEmpty();
        ConvertToUppercaseNLowercase convertToUppercaseNLowercase = new ConvertToUppercaseNLowercase();
        FilterOddNEven filterOddNEven= new FilterOddNEven();
        SortStringList stringList = new SortStringList();
        IntAvg intAvg = new IntAvg();
        RemoveDuplicatefromList  removeDuplicatefromList = new RemoveDuplicatefromList();
        factorial factorial= new factorial();
        PrimeNumber primeNumber = new PrimeNumber();
        MaxandMin maxandMin = new MaxandMin();
        MultiplyListNumber multiplyListNumber= new MultiplyListNumber();
        WordCounterOFString wordCounterOFString = new WordCounterOFString();
        PalindromeString palindromeString =new PalindromeString();
        ListOfStringsContainSpecificWord listOfStringsContainSpecificWord= new ListOfStringsContainSpecificWord();
        MaxnMinLengthListString maxnMinLengthListString = new MaxnMinLengthListString();
        SecondLargestandSmallest secondLargestandSmallest = new SecondLargestandSmallest();
        FindStringCase findStringCase = new FindStringCase();



//        //stack
        nextGreaterNumberLeft.ngnl();
       nextGreaterNumberRight.ngnr();
       nextSmallestNumberRight.nsnr();
       nextSmallestNumberLeft.nsnl();

//       //leetCode
        mergeTwoArrays.mta();

        //Basics Of Stream API
        stringEmpty.se();
        convertToUppercaseNLowercase.ctul();
        filterOddNEven.oddeven();
        stringList.sortStringList();
        intAvg.avgd();
        intAvg.avg();
        removeDuplicatefromList.functionn();
        factorial.fact();
        primeNumber.primeNu();
        maxandMin.maxandmin();
        multiplyListNumber.pns();
        wordCounterOFString.wordCount();
        palindromeString.ps();
        listOfStringsContainSpecificWord.ps();
        maxnMinLengthListString.maxmin();
        secondLargestandSmallest.largesmall();
        findStringCase.functionn();

        }
}