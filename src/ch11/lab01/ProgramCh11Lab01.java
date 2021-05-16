package ch11.lab01;
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
		DrawStarThread draw = new DrawStarThread(5, 5 , "#");
		draw.start();
		DrawStarThread draw2 = new DrawStarThread(5, 5 , "@");
		draw2.start();

	}
}
