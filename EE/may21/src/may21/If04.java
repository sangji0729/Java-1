package may21;

/* 1. ������ �� �ΰ� �����մϴ�.
 * 2. if������ ũ�⸦ ���մϴ�. (�ڸ��ٲٱ� ���ּ���)
 * 3. ū ������ ������ּ���.
 * 
 * 1. 5
 * 2. 8
 * 1 + ">" + 2
 */

public class If04 {

	public static void main(String[] args)
	{
		int random1 = (int)(Math.random() * 10 + 1);
		int random2 = (int)(Math.random() * 10 + 1);
		
		// ����
		int temp = -1;
		if (random2 > random1)
		{
			temp = random1;
			random1 = random2;
			random2 = temp;
		}
		
		System.out.println(random1 + ">" + random2);
	}
}
