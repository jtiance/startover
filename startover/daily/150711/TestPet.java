public class TestPet{

	public static void sort(Pet[] p){
		for(int i = 0; i < p.length; i++){
			for(int j = i + 1; j < p.length; j++){
				if(p[i].getWeight() < p[j].getWeight()){
					Pet temp = p[i];
					p[i] = p[j];
					p[j] = temp;
				}
			}
		}
		
		for(Pet pet : p){
			System.out.println(pet);
		}
	}
	public static void main(String[] args){
		Pet[] pet = {new Bird("��ľ��", 3, 5), new Bird("������", 4, 1), 
						new Cat("��è", 4, 4), new Cat("��˹è", 5, 6), 
						new Dog("����", 9, 7), new Dog("��ë", 6, 20),};
						
		sort(pet);
	}
}