package hello.array;


import java.util.Scanner;
public class Stringpractice{

public static void main(String args[]){
Stringpractice ac=new Stringpractice();
	ac.string_practice();}
public void string_practice(){
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First name  ");
		String name=sc.next();
	System.out.println("Enter Second name  ");
	String name2=sc.next();
	int len=(name.length()<name2.length())?name.length():name2.length();
for(int i=0;i<len;i++){
	if(name.charAt(i)==name2.charAt(i)){
	count++;

}}
	if(count==len){
		System.out.println("Starts with Name Entered");
	}
else{
	System.out.println("Not Starts With Name Entered");
	}}}