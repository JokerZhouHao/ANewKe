package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Test {
	
	public static int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n + 1;
    }
	
	
	public static void main(String[] args) {
		/*** ArrayList
		���ݲ��ԣ��������ʵ��ʱ������capacity��0 --> 10 --> ÿ������1.5���������Integer.MAX_VALUE
		�̲߳���ȫ
		1��Ϊʲô����ʹ��transient���Σ�
			��Ϊ�����д��ڿ��пռ䣬�ⲿ�����л�����˷ѿռ䣬����ArrayList��д��writeObject��readObject
			�������кźͷ����л���ŵ����ݡ�
		2�����ʹ���̰߳�ȫ��ArrayList��
		 	ʹ��Collections.synchronizedList()����
		 	ArrayList���̲߳���ȫ�ģ�Vector���̰߳�ȫ��
			����ʱ��ArrayList��0.5����Vector��1��
		***/
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.remove(0);
		
		
		/*** LinkedList
		˫������
		�̲߳���ȫ
		1�����ʹ���̰߳�ȫ��LinkedList��
		 	ʹ��Collections.synchronizedList()����
		***/
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(12);
		list1.remove();
		
		
		/*** hashMap
		 *	��ϣֵ��obj.hashcode & (obj.hashcode >>> 16) & (n-1)
		 *	ɢ�з�������������Ͱ��Ԫ�ش���8��תΪ����������ڻ�С��6ʱ�������ת��Ϊ����
		 *	resize�����ֻ��һ��Ԫ�أ�ֱ�ӷŵ���λ�ã����������ֺ�����������ֳ��ĺ�����ڵ���������6������ת��Ϊ����
		 *			�������Ϊ��������hash & oldCap == 0�ŵ�һ������==1�ķŵ�����һ������ǰ�߻��Ƿ���������ԭ����λ�ã�
		 *			���߷���ԭʼλ�� + oldCap��λ��
		��1��HashMap����NULLֵ��NULL��
		��2����Ҫ���׸ı为�����ӣ��������ӹ��߻ᵼ��������������Ҽ�ֵ��ʱ�临�ӶȾͻ����ߣ��������ӹ��ͻᵼ��hashͰ���������࣬�ռ临�ӶȻ�����
		��3��Hash��ÿ�λ����ݳ���Ϊ��ǰ��2��
		��4��HashMap�Ƕ��̲߳���ȫ�ģ�����JDK 1.7���ж��߳�put������֮�������ֱ����ѭ����CPU쭵�100%����JDK 1.8��
		���ж��̲߳�������ֽڵ��valueֵ��ʧ��ΪʲôJDK1.7��JDK1.8���̲߳�������ֺܴ�ͬ������ΪJDK 1.8�����߶�resize
		�����������Ż������������ջ�����Ҳ�Ǳ��µ��ص�֮һ�������ϸ�ڴ�ҿ���ȥ�������ϡ������ҾͲ�����̫����
		��5����������HashMap�ĳ�ʼ���������������������ʱ�򣬷�ֹ���resize
		��6��HashMap��JDK 1.8�����˺ܺ����ܵ��������ҿ�������JDK1.7��JDK1.8get�������ܶԱ�JDK1.8��Ҫ����JDK 1.7�ģ�
		��Ҹ���Ȥ�Ŀ����Լ��������ԣ����Ի�û��������JDK1.8��С���Ͻ��İɡ�
		*/
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		System.out.println(tableSizeFor(7));
		
		System.out.println((655376666 >>> 16) & (7846) );
	}

}
