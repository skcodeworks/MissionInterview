package org.santhoshkumar;

import org.santhoshkumar.Arrays.PrintAllCombination;
import org.santhoshkumar.Arrays.PrintAllPermutation;
import org.santhoshkumar.Arrays.SuperSet;
import org.santhoshkumar.DynamicProgramming.LongestCommonSubSequence;
import org.santhoshkumar.DynamicProgramming.LongestPalindromicSubSequence;

import org.santhoshkumar.Sorting.BubbleSort;

public class Main {

    public static void main(String[] args) {
//        LongestPalindromicSubSequence lonPalindrome = new LongestPalindromicSubSequence();
//        System.out.println(lonPalindrome.findRecursive(new String("AABCDEBAZ")));
//        System.out.println(lonPalindrome.findPalindrome(new String("AABCDEBAZ")));
//
//        LongestCommonSubSequence lonComSeq = new LongestCommonSubSequence();
//        System.out.println(lonComSeq.findRecursive(new String("ABCD"), new String("ACD")));
//        System.out.println(lonComSeq.findLongest(new String("ABCD"), new String("AD")));

        System.out.println("Combinations");
        PrintAllCombination printCombinations = new PrintAllCombination();
        printCombinations.solve(new String("ABCD"), 2);

        System.out.println("Permutations");
        PrintAllPermutation printPermutations = new PrintAllPermutation();
        printPermutations.solve(new String("ABCD"), 2);

        System.out.println("Super Set");
        SuperSet ss = new SuperSet();
        ss.solve(new String("ABCD"));

        //Sorting
        System.out.println("Bubble Sort");
        BubbleSort bs = new BubbleSort();
        bs.input = new int[]{9,8,7,6,5,4,3,2,1,0};
        bs.sort();
        bs.print();
    }
}
