package Longest;
import java.util.*;
public class ls {
	static ArrayList<ArrayList<Integer>>  l  =new ArrayList<>();
	static ArrayList<Integer > m  = new ArrayList<>();

	 static int incre_subseq(int my_arr[], int arr_len){
	      int seq_arr[] = new int[arr_len];
	      int i, j, max = 0;
	      for (i = 0; i < arr_len; i++)
	      {
	         seq_arr[i] = 1;
	      }
	      for (i = 1; i < arr_len; i++) {
	    	 
	      for (j = 0; j <i; j++) {
	    	 
	      if (my_arr[i] > my_arr[j] && seq_arr[i] < seq_arr[j] + 1) {
	      seq_arr[i] = seq_arr[j] + 1;
	     
	     
	      }
	     	      
	     
	      }
	     
	    
	      
	      }
	      for (i = 0; i < arr_len; i++) {
	    	
	      if (max < seq_arr[i]) {
	    	  m.add(my_arr[i]);
	      max = seq_arr[i];}
	      l.add(new ArrayList<>(m));
	      }
	      System.out.println("longest Increasing sequence:= "+l.get(l.size()-1));
	      return max;
	   }
	   public static void main(String args[]){
	      int my_arr[] = {10,22,9,33,21,50,41,60,80};
	      int arr_len = my_arr.length;
	      int k=0;
	    
	    	 
	      
	      System.out.println("The length of the longest increasing subsequence is " +  incre_subseq(my_arr, arr_len));
	   }}