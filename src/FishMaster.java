public class FishMaster {
    public static void main(String[] args) {
        Fish myFish = new Fish();
//   Опускаем рыбу на 100 м
        myFish.dive(2);
        myFish.dive(97);
        myFish.dive(3);
        myFish.sleep();

        String result = myFish.say("something");
        System.out.println(result);
    }
}

