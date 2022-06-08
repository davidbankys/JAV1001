// David Bankole Abel
// A00236512


import java.util.Scanner;

public class ArrayTools
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
 
System.out.println("\tCeaser Cipher");
System.out.println("------------------------------");
 
// first accept the text to be encrypted from user
System.out.printf("Enter a text to encrypt: ");
String txt = input.nextLine();
// next accept the shift value from user
System.out.printf("Enter shift value: ");
int shiftValue = input.nextInt();
 
//call the method and store the results
String encryptedTxt = encrypt (txt, shiftValue);
System.out.println("\nEncrypted string: "+encryptedTxt); // print results
System.out.println("Decrypted string with shift value -"+shiftValue+" is: "
+(encrypt(encryptedTxt, 26-shiftValue))); // print decrypted text
 
System.out.println("\n\tArray operations");
System.out.println("------------------------------");
// accept an array size form user
System.out.printf("Enter an array size: ");
int arrSize = input.nextInt();
float array[] = new float[arrSize]; // create new array with given size
System.out.println("Enter array elements: ");
// now accept array elements from user
for (int i = 0; i < arrSize; i++)
array[i] = input.nextFloat();
System.out.println("-----------------------------------");
// print the avg of elements using arrayAvg() method
System.out.println("Average of array elements: "+(arrayAvg(array)));
System.out.println("-----------------------------------");
 
// search the array for given element and print results
System.out.printf("Enter a value to search : ");
float item = input.nextFloat();
if(arrayContains(array, item))
System.out.println("The array contains "+item);
else
System.out.println("The array doesn't contains "+item);
System.out.println("-----------------------------------");
 
float reversedArray[] = reverse(array); // reverse given array
System.out.println("The reversed array is: ");
for (int i = 0; i < arrSize; i++)
System.out.printf("%.2f ",reversedArray[i]);
System.out.println("\n-----------------------------------");
}
// user defined methods
 
// method to illustrate ceaser cipher
static String encrypt (String txt, int shift)
{
int len = txt.length();   
String newStr="";
for (int i = 0; i < len; i++)
// for uppercase letters
if(Character.isUpperCase(txt.charAt(i)))
newStr += (char)(((int)txt.charAt(i) +
shift - 65) % 26 + 65);
 
else // for lowercase letters
newStr += (char)(((int)txt.charAt(i) +
shift - 97) % 26 + 97);
 
return newStr;
}
 
// method to return average of array elements
static float arrayAvg(float array[])
{
int len = array.length;
float sum = 0;
 
for (int i = 0; i < len; i++)
sum += array[i];
 
return (sum/len);
}
 
// method to search for an element
static boolean arrayContains(float array[], float item)
{
int len = array.length;
 
for (int i = 0; i < len; i++)
if(array[i] == item) return true;
 
return false;
}
 
// method to reverse given array
static float[] reverse(float array[])
{
int len = array.length;
float newArray[] = new float[len];
 
for (int i = len-1; i >= 0; i--)
newArray[len-i-1] = array[i];
 
return newArray;
}
}