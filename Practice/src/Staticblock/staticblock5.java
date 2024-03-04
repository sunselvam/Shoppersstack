package Staticblock;

public class staticblock5 {
static int a=20;
static {
	int a=30;
	staticblock5.a=a;//reinitializing local into global variable
}
public static void main(String[] args) {
	System.out.println(a);
}
}
