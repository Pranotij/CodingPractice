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


        //stack
        nextGreaterNumberLeft.ngnl();
       nextGreaterNumberRight.ngnr();
       nextSmallestNumberRight.nsnr();
       nextSmallestNumberLeft.nsnl();

       //leetCode
        mergeTwoArrays.mta();
        }
}