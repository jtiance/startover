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
		Pet[] pet = {new Bird("×ÄÄ¾Äñ", 3, 5), new Bird("²¼¹ÈÄñ", 4, 1), 
						new Cat("»¨Ã¨", 4, 4), new Cat("²¨Ë¹Ã¨", 5, 6), 
						new Dog("¾©°Í", 9, 7), new Dog("½ðÃ«", 6, 20),};
						
		sort(pet);
	}
}