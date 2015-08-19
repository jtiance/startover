public class Test {

	public static void bubbleSort(Computer[] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i].getPrice() < c[j].getPrice()) {
					Computer temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
	}

	public static void selectedSort(Computer[] c) {
		int minIndex = 0;

		for (int i = 0; i < c.length; i++) {
			minIndex = i;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i].getPrice() < c[j].getPrice()) {
					minIndex = j;
				}
			}

			if (c[i] != c[minIndex]) {
				Computer temp = c[i];
				c[i] = c[minIndex];
				c[minIndex] = temp;
			}
		}
	}

	public static void listPrice(Computer c) {
		if (c instanceof PC) {
			System.out.println("PC������Ϊ: " + ((PC) c).getBox());
		} else if (c instanceof NotePad) {
			System.out.println("Notepad�Ĵ�СΪ: " + ((NotePad) c).getSize());
		} else {
			System.out.println("Computer���ͺ�Ϊ: " + c.getDetails());
		}

		// System.out.println(c.getPrice());

	}

	public static void main(String[] args) {
		Student s = new Student("Jeff", 50, 10020, 93.5, new Computer("Core i3", 2.0, 500.0, 4200.0));
		System.out.println(s.say());
	
	
		/*Computer com = new Computer();
		PC pc = new PC("Core i5", 2.0, 150.0, "lenovo", 2600.0);
		NotePad np = new NotePad("Core i7", 8.0, 500.0, 14.1, 3180.0);

		listPrice(com);
		listPrice(pc);
		listPrice(np);*/

		/*
		 * System.out.println("Computer�ļ۸�: " + com.getPrice());
		 * System.out.println("PC�ļ۸�: " + pc.getPrice()); System.out.println(
		 * "NotePad�ļ۸�: " + np.getPrice());
		 * System.out.println("============����ǰ=======================");
		 * 
		 * Computer[] computer = {com, pc, np};
		 * 
		 * for(Computer c : computer){ System.out.println(c.getDetails()); }
		 * 
		 * //bubbleSort(computer); selectedSort(computer);
		 * 
		 * System.out.println("============�����=======================");
		 * 
		 * for(Computer c : computer){ System.out.println(c.getDetails()); }
		 */

		/**
		 * PC pc = new PC(); PC pc2 = new PC("����");
		 * 
		 * pc.setBox("������");
		 * 
		 * NotePad np = new NotePad(); np.setSize(14);
		 * 
		 * Computer c = new Computer();
		 * 
		 * System.out.println("pc: " + pc.getDetails() + ", Box: " +
		 * pc.getBox()); System.out.println("Notepad: " + np.getDetails() +
		 * ", Size: " + np.getSize());
		 * 
		 * pc.setCpu("���ڴ�����"); System.out.println("PC��ʹ��super�ؼ���" +
		 * pc.getDetails());
		 * 
		 * System.out.println("PC2��ʽ���ø���super(), ����ʼ���������ԣ�" + pc2.getDetails());
		 * 
		 * PC pc3 = new PC("IOS", 4.0, 300.0, "Mac");
		 * System.out.println("PC3���ø���������Ĺ�������" + pc3.getDetails());
		 * 
		 * 
		 * Computer c1 = new PC("���", 8.0, 500.0, "������"); Computer c2 = new
		 * NotePad("����", 2.0, 80.0, 13.1);
		 * 
		 * System.out.println(c1.getDetails());
		 * System.out.println(c2.getDetails());
		 */
	}
}