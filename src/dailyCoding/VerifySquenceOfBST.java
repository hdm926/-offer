package dailyCoding;

import java.util.Arrays;

public class VerifySquenceOfBST {
	//�������ǲ��Ƕ�����������������Ľ��
	//��������������������С�ڸ��ڵ㣬��������С�ڸ��ڵ�
	 public boolean VerifySquenceOfBST(int [] sequence) {
		 if(sequence.length==0 || sequence ==null)
			 return false;
		
		return isBST(sequence, 0, sequence.length-1);
	    }
	 
	 public boolean isBST(int[] seq,int start,int end) {
		 if(start>=end)
			 return true;
		 
		 int key=seq[end];//���ڵ�
		 int i;//�ֽ��
		 
		 for(i=start;i<end;i++) {
			 if(seq[i]>key)
				 break;
		 }
		 
		 
		 //��ʱi���������ĵ�һ����㣬�����ң�����û��С�ڸ��ڵ�ĵ�
		 for(int j=i;j<end;j++) {
			 if(seq[j]<key)
				 return false;
		 }
		 return isBST(seq, start, i-1) && isBST(seq, i, end-1);
	 }
}