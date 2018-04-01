
public class Fish extends Pet {
//    int currentDepth = 0;
// Специальный метод - конструктор для присвоения значения, может быть пустым
int currentDepth;

/**    Fish(int startingPosition){
        currentDepth=startingPosition;
    }
*/
//экземпляр класса Fish указывает на самого себя с помощью слова this.
    Fish(int currentDepth){
        this.currentDepth = currentDepth;
    }
    public int dive(int howDeep) {
        currentDepth = currentDepth + howDeep;
        if (currentDepth > 100) {
            System.out.println("Я маленькая рыбка " +
                    " и я не могу плавать глубже 100 метров");
            currentDepth = currentDepth - howDeep;
        }else{
            System.out.println("Погружаюсь ещё на " + howDeep +
                                                     " метров");
            System.out.println("Я на глубине  " + currentDepth +
                                                     " метров");
        }
        return currentDepth;
    }
    @Override
        public String say(String something) {
        return "Ты чё, не знаеш - рыбы не умеют разговаривать?";
    }

}