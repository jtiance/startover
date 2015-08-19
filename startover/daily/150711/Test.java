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
			System.out.println("PC的主机为: " + ((PC) c).getBox());
		} else if (c instanceof NotePad) {
			System.out.println("Notepad的大小为: " + ((NotePad) c).getSize());
		} else {
			System.out.println("Computer的型号为: " + c.getDetails());
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
		 * System.out.println("Computer的价格: " + com.getPrice());
		 * System.out.println("PC的价格: " + pc.getPrice()); System.out.println(
		 * "NotePad的价格: " + np.getPrice());
		 * System.out.println("============排序前=======================");
		 * 
		 * Computer[] computer = {com, pc, np};
		 * 
		 * for(Computer c : computer){ System.out.println(c.getDetails()); }
		 * 
		 * //bubbleSort(computer); selectedSort(computer);
		 * 
		 * System.out.println("============排序后=======================");
		 * 
		 * for(Computer c : computer){ System.out.println(c.getDetails()); }
		 */

		/**
		 * PC pc = new PC(); PC pc2 = new PC("联想");
		 * 
		 * pc.setBox("爱国者");
		 * 
		 * NotePad np = new NotePad(); np.setSize(14);
		 * 
		 * Computer c = new Computer();
		 * 
		 * System.out.println("pc: " + pc.getDetails() + ", Box: " +
		 * pc.getBox()); System.out.println("Notepad: " + np.getDetails() +
		 * ", Size: " + np.getSize());
		 * 
		 * pc.setCpu("奔腾处理器"); System.out.println("PC类使用super关键字" +
		 * pc.getDetails());
		 * 
		 * System.out.println("PC2隐式调用父类super(), 并初始化本类属性：" + pc2.getDetails());
		 * 
		 * PC pc3 = new PC("IOS", 4.0, 300.0, "Mac");
		 * System.out.println("PC3调用父类带参数的构造器：" + pc3.getDetails());
		 * 
		 * 
		 * Computer c1 = new PC("酷睿", 8.0, 500.0, "爱国者"); Computer c2 = new
		 * NotePad("奔腾", 2.0, 80.0, 13.1);
		 * 
		 * System.out.println(c1.getDetails());
		 * System.out.println(c2.getDetails());
		 */
	}
}