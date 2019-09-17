

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		
		//随机数组
			
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
			
			
		//随机数组的副本
			
			float[] a11 = a1.clone();//10万的三个副本
			float[] a12 = a1.clone();
			float[] a13 = a1.clone();
			float[] a21 = a2.clone();//20万副本
			float[] a22 = a2.clone();
			float[] a23 = a2.clone();
			float[] a31 = a3.clone();//30
			float[] a32 = a3.clone();
			float[] a33 = a3.clone();
			float[] a41 = a4.clone();
			float[] a42 = a4.clone();
			float[] a43 = a4.clone();

			
			
		//Sorter对象
			Sorter mysorter = new Mysorter();
			
			
			
			
			
			 // 冒泡排序
			
			long time1 = System.currentTimeMillis();
			mysorter.maopao(a11);
			long time2 = System.currentTimeMillis();
			long span = time2 - time1;
			System.out.println("冒泡排序" + a11.length + "个数据的时间 ：" + span);
			
			time1 = System.currentTimeMillis();
			mysorter.maopao(a21);
			time2 = System.currentTimeMillis();
			span = time2 - time1;
			System.out.println("冒泡排序" + a21.length + "个数据的时间 ：" + span);
			
			time1 = System.currentTimeMillis();
			mysorter.maopao(a31);
			time2 = System.currentTimeMillis();
			span = time2 - time1;
			System.out.println("冒泡排序" + a31.length + "个数据的时间 ：" + span);
			
			time1 = System.currentTimeMillis();
			mysorter.maopao(a41);
			time2 = System.currentTimeMillis();
			span = time2 - time1;
			System.out.println("冒泡排序" + a41.length + "个数据的时间 ：" + span);
			
			
			
			
			
			 //快速排序
			time1 = System.currentTimeMillis();
			mysorter.kuaipai(a12,0,a12.length-1);
			time2 = System.currentTimeMillis();
			span = time2 - time1;
			System.out.println("快速排序"+a12.length+"个数据的时间 ：" + span);
			
			time1 = System.currentTimeMillis();
			mysorter.kuaipai(a22,0,a22.length-1);
			time2 = System.currentTimeMillis();
			span = time2 - time1;
			System.out.println("快速排序"+a22.length+"个数据的时间 ：" + span);
			
			time1 = System.currentTimeMillis();
			mysorter.kuaipai(a32,0,a32.length-1);
			time2 = System.currentTimeMillis();
			span = time2 - time1;
			System.out.println("快速排序"+a32.length+"个数据的时间 ：" + span);
			
			time1 = System.currentTimeMillis();
			mysorter.kuaipai(a42,0,a42.length-1);
			time2 = System.currentTimeMillis();
			span = time2 - time1;
			System.out.println("快速排序"+a42.length+"个数据的时间 ：" + span);
			
			
			
			
			//插入排序
			long t1 = System.currentTimeMillis();
			mysorter.charupaixu(a13);
			long t2 = System.currentTimeMillis();
			long tspan = t2 - t1;
			System.out.println(a13.length+"个数据进行插入排序的时间："+tspan);
			
			t1 = System.currentTimeMillis();
			mysorter.charupaixu(a23);
			t2 = System.currentTimeMillis();
			tspan = t2 - t1;
			System.out.println(a23.length+"个数据进行插入排序的时间："+tspan);
			
			t1 = System.currentTimeMillis();
			mysorter.charupaixu(a33);
			t2 = System.currentTimeMillis();
			tspan = t2 - t1;
			System.out.println(a33.length+"个数据进行插入排序的时间："+tspan);
			
			t1 = System.currentTimeMillis();
			mysorter.charupaixu(a43);
			t2 = System.currentTimeMillis();
			tspan = t2 - t1;
			System.out.println(a43.length+"个数据进行插入排序的时间："+tspan);
			
			
			
	}

}
