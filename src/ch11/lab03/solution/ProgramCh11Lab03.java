package ch11.lab03.solution;
/*
 * 1. �Q���~��java.lang.Thread���O���覡�]�p�@�����ONumberThread�A
 *    �b����public void run()��k������5�Ӥ���1-10���H���üơA�P�ɱN
 *    �o�����H���üƤ@��s�J�@�Ӱ}�C���A���}�C�|��NumberThread���O���غc�l
 *    �ǤJ���O���C
 * 2. �bmain()��k���s�ب��int[]�A�U�ۦ����Ӥ����C���ۥH�o��Ӱ}�C���ѼơA
 *    �s�ب��NumberThread���O������C
 * 3. �Q���~��java.lang.Thread���O���覡�]�p�@��SumThread���O�A
 *    �b����public void run()��k���A�[�`�o��� �}�C�����Ҧ������C  
 */
public class ProgramCh11Lab03 {
	public static void main(String[] args) {
		int ia1[] = new int[5];
		int ia2[] = new int[5];
		NumberThread nt1 = new NumberThread(ia1);
		NumberThread nt2 = new NumberThread(ia2);
		nt1.start();
		nt2.start();
		SumThread st = new SumThread(ia1, ia2, nt1, nt2);
		st.start();
		try {
			nt1.join();
			nt2.join();
			st.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		nt1.printArray();
		nt2.printArray();
		System.out.println(st.getSum());
	}
}
