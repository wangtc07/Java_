package ch11.lab04.solution;

/*
 * 1. �Q�ι�@java.lang.Runnable�������覡�]�p�@�����ONumberRunnable�A
 *    �b����public void run()��k������5�Ӥ���1-10���H���üơA�P�ɱN
 *    �o�����H���üƤ@��s�J�@�Ӱ}�C���A���}�C�|��NumberRunnable���O���غc�l
 *    �ǤJ���O���C
 * 2. �bmain()��k���s�ب��int[]�A�U�ۦ����Ӥ����C���ۥH�o��Ӱ}�C���ѼơA
 *    �s�ب��NumberRunnable���O������C
 * 3. �Q�ι�@java.lang.Runnable�������覡�]�p�@�����OSumRunnable�b����
 *    public void run()��k���A�[�`�o��� �}�C�����Ҧ������C
 * 4. �A�ݭn�ۦ�s�ؾA��Thread���O������A�P�ɶǤJ�A��Runnable���O������C   
 */
public class ProgramCh11Lab04 {
	public static void main(String[] args) {
		int ia1[] = new int[5];
		int ia2[] = new int[5];
		NumberRunnable nr1 = new NumberRunnable(ia1);
		NumberRunnable nr2 = new NumberRunnable(ia2);
		Thread t1 = new Thread(nr1);
		Thread t2 = new Thread(nr2);
		t1.start();
		t2.start();
		SumRunnable sr = new SumRunnable(ia1, ia2, t1, t2);
		Thread s = new Thread(sr);
		s.start(); 
		try { 
			t1.join();
			t2.join();
			s.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		nr1.printArray();
		nr2.printArray();
		System.out.println(sr.getSum());
	}
}