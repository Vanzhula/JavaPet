public class FishMaster {
    public static void main(String[] args) {
        Fish myFish = new Fish();
        myFish.dive(2);
        myFish.dive(3);
        myFish.sleep();

        String result = myFish.say("something");
        System.out.println(result);
    }
}

