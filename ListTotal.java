//(c) A+ Computer Science
//www.apluscompsci.com
//Name -Jonathan Hsing
//Date -2/1/21

import java.util.List;
import java.util.ArrayList;

public class ListTotal
{
 public static int total( List<Integer> ray )
 {
  //Create a variable to store the sum
  int a = 0;
  //Create a for each loop to loop each value of the array
  for (int b: ray){
	//Set sum equal to the sum added to the current array value
  a += b;
  //End loop
 }
  //Return the sum
return a;
 }
}