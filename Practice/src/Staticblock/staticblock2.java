package Staticblock;

public class staticblock2 {
static int a=10;
static {
	a=80;
}
static {
	a=40;
}
public static void main(String[] args) {
	System.out.println(a);
}
}
