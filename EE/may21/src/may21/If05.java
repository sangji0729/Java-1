package may21;

/* ������ ���� 3���� �̾Ƽ�
 * ���� �ͺ��� ū ������ �������ּ���.
 */

public class If05 {

	public static void main(String[] args) {
		int random1 = (int)(Math.random() * 10 + 1);
		int random2 = (int)(Math.random() * 10 + 1);
		int random3 = (int)(Math.random() * 10 + 1);
		
		// 1 2 3	< <
		// 1 3 2	< >
		// 2 3 1	< >
		// 2 1 3	> <
		// 3 1 2	> <
		// 3 2 1 	> >
		//=============
		// << , <>, ><, >>
		// <> , ><, >>
		
		int temp = -1;
		if (random1 > random2)
		{
			temp = random1;
			random1 = random2;
			random2 = temp;
		}
		
		if (random2 > random3)
		{
			temp = random2;
			random2 = random3;
			random3 = temp;
		}
		
		if (random1 > random2)
		{
			temp = random1;
			random1 = random2;
			random2 = temp;
		}
				
		System.out.print(random1 + ", " + random2 + ", " + random3);
	}
}
