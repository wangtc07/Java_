package _Java_016Class.ch11_thread.lab01.solution;
/*
 * 1. �Q���~��java.lang.Thread���O���覡�]�p�@�����ODrawStarThread�A
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
public class ProgramCh11Lab01 {
	public static void main(String[] args) {
		DrawStarThread ds1 = new DrawStarThread(5, '#');
		ds1.start();
		DrawStarThread ds2 = new DrawStarThread(10, '*');
		ds2.start();

	}
}
