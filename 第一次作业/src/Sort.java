

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		
		//�������
			
			float[] a1 = new float[100000];
			float[] a2 = new float[200000];
			float[] a3 = new float[300000];
			float[] a4 = new float[400000];
			for(int i = 0;i<a1.length;i++){
				float a = (float) (Math.random()*1000);
				a1[i] = a;
				a2[i] = a;
				a3[i] = a;
				a4[i] = a;
			}
			for(int i = a1.length;i<a2.length;i++){
				float a = (float) (Math.random()*1000);
				a2[i] = a;
				a3[i] = a;
				a4[i] = a;
			}
			for(int i = a2.length;i<a3.length;i++){
				float a = (float) (Math.random()*1000);
				a3[i] = a;
				a4[i] = a;
			}
			for(int i = a3.length;i<a4.length;i++){
				a4[i] = (float) (Math.random()*1000);
			}
			
			
		//�������ĸ���
			
			float[] a11 = a1.clone();//10�����������
			float[] a12 = a1.clone();
			float[] a13 = a1.clone();
			float[] a21 = a2.clone();//20�򸱱�
			float[] a22 = a2.clone();
			float[] a23 = a2.clone();
			float[] a31 = a3.clone();//30
			float[] a32 = a3.clone();
			float[] a33 = a3.clone();
			float[] a41 = a4.clone();
			float[] a42 = a4.clone();
			float[] a43 = a4.clone();

			
			
		//Sorter����
			Sorter mysorter = new Mysorter();
			
			
			
			
			
			 // ð������
			
			long time1 = System.currentTimeMillis();
			mysorter.maopao(a11);
			long time2 = System.currentTimeMillis();
			long span = time2 - time1;
			System.out.println("ð������" + a11.length + "�����ݵ�ʱ�� ��" + span);
			
			time1 = System.currentTimeMillis();
			mysorter.maopao(a21);
			time2 = System.currentTimeMillis();
			span = time2 - time1;
			System.out.println("ð������" + a21.length + "�����ݵ�ʱ�� ��" + span);
			
			time1 = System.currentTimeMillis();
			mysorter.maopao(a31);
			time2 = System.currentTimeMillis();
			span = time2 - time1;
			System.out.println("ð������" + a31.length + "�����ݵ�ʱ�� ��" + span);
			
			time1 = System.currentTimeMillis();
			mysorter.maopao(a41);
			time2 = System.currentTimeMillis();
			span = time2 - time1;
			System.out.println("ð������" + a41.length + "�����ݵ�ʱ�� ��" + span);
			
			
			
			
			
			 //��������
			time1 = System.currentTimeMillis();
			mysorter.kuaipai(a12,0,a12.length-1);
			time2 = System.currentTimeMillis();
			span = time2 - time1;
			System.out.println("��������"+a12.length+"�����ݵ�ʱ�� ��" + span);
			
			time1 = System.currentTimeMillis();
			mysorter.kuaipai(a22,0,a22.length-1);
			time2 = System.currentTimeMillis();
			span = time2 - time1;
			System.out.println("��������"+a22.length+"�����ݵ�ʱ�� ��" + span);
			
			time1 = System.currentTimeMillis();
			mysorter.kuaipai(a32,0,a32.length-1);
			time2 = System.currentTimeMillis();
			span = time2 - time1;
			System.out.println("��������"+a32.length+"�����ݵ�ʱ�� ��" + span);
			
			time1 = System.currentTimeMillis();
			mysorter.kuaipai(a42,0,a42.length-1);
			time2 = System.currentTimeMillis();
			span = time2 - time1;
			System.out.println("��������"+a42.length+"�����ݵ�ʱ�� ��" + span);
			
			
			
			
			//��������
			long t1 = System.currentTimeMillis();
			mysorter.charupaixu(a13);
			long t2 = System.currentTimeMillis();
			long tspan = t2 - t1;
			System.out.println(a13.length+"�����ݽ��в��������ʱ�䣺"+tspan);
			
			t1 = System.currentTimeMillis();
			mysorter.charupaixu(a23);
			t2 = System.currentTimeMillis();
			tspan = t2 - t1;
			System.out.println(a23.length+"�����ݽ��в��������ʱ�䣺"+tspan);
			
			t1 = System.currentTimeMillis();
			mysorter.charupaixu(a33);
			t2 = System.currentTimeMillis();
			tspan = t2 - t1;
			System.out.println(a33.length+"�����ݽ��в��������ʱ�䣺"+tspan);
			
			t1 = System.currentTimeMillis();
			mysorter.charupaixu(a43);
			t2 = System.currentTimeMillis();
			tspan = t2 - t1;
			System.out.println(a43.length+"�����ݽ��в��������ʱ�䣺"+tspan);
			
			
			
	}

}
