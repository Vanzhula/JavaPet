
public class PetMaster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String petReaction;
    Pet myPet = new Pet();
    myPet.eat();
    petReaction = myPet.say("Чик! Чирик!!");
    System.out.print(petReaction);
    myPet.sleep();
	}

}
