package may21;

import java.util.Scanner;

/* ���ݱ��� �츮�� ��� �� - 4����
 * �ڹ� ��ġ, OracleJDK, OpenJDK
 * JDK = Java Development Kit (Include JRE)
 * JRE = Java Runtime Environment (Include JVM)
 * JVM = Java Virtual Machine
 * 
 * Variable = Changing Value
 * Constant = final
 * 
 * Orthography
 * 		Pascal = First character is upper case. Use to class name.
 * 		Camel = First character is lower case.
 * 		Snake = Use upper case, Put underbar between words.
 * 
 * DataType
 * 		Primitive
 * 			byte, short, int, long, float, double, char, boolean
 * 		Reference
 * 			All types except primitive type.
 * 
 * DataType casting
 * 		Promotion, cast
 * 
 */

public class Input01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		
		int input = sc.nextInt();
		
		if (input % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
		
		sc.close();
	}
}
