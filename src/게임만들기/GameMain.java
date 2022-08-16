package 게임만들기;

public class GameMain {
    public static void main(String[] args) {
        Character varian = new Character("바리안", 1, 450,
                10, 2, 0.8, 0.5);
        Character jaina = new Character("제이나", 2, 200,
                2, 30, 0.5, 0.9);

        varian.infoCharacter();
        jaina.infoCharacter();
    }
}
