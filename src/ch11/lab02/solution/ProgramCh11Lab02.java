package ch11.lab02.solution;
/*
 * 1. �Q�ι�@java.lang.Runnable�������覡�]�p�@�����ODrawStarRunnable�A
 *    �b����public void run()��k��ø�s�U�C���ϧ�
 * #
 * ##
 * ###
 * ...
 * ...
 * #######
 * ø�s���C�ƻP�Ÿ�(�Y�W����#)�����ѫغc�l�ǤJ�����O���C
 * 2. �ѤU����main()��k�ӫغc��ӥH�W�����������A�M��I�s
 *    ���̪�start()��k�A��ø�s�T�����ϮסC
 */
public class ProgramCh11Lab02 {
	public static void main(String[] args) {
		DrawStarRunnable ds1 = new DrawStarRunnable(5, '@');
		Thread t1 = new Thread(ds1);
		DrawStarRunnable ds2 = new DrawStarRunnable(3, '%');
		Thread t2 = new Thread(ds2);
		t1.start();
		t2.start();
	}
}