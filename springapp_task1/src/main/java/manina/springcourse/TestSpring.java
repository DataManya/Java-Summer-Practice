package manina.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        СomputerGames firstСomputerGames = context.getBean("gameComputer", СomputerGames.class);
        СomputerGames secondСomputerGames = context.getBean("gameComputer", СomputerGames.class);

        boolean comparison = firstСomputerGames == secondСomputerGames;

        firstСomputerGames.playGame();

        System.out.println(comparison);

        firstСomputerGames.setUserrating(4);

        System.out.println("First user rating:" + firstСomputerGames.getUserrating());
        System.out.println("Second user rating:" + secondСomputerGames.getUserrating());


        System.out.println("");
        СomputerGames computerGames = context.getBean("gameComputer1", СomputerGames.class);
        computerGames.playGame();


        System.out.println("");
        СomputerGames computerGames1 = context.getBean("gameComputer2", СomputerGames.class);
        computerGames1.playGame();

        System.out.println("User rating:"+computerGames1.getUserrating());

        System.out.println("");
        СomputerGames computerGames2 = context.getBean("gameComputer3", СomputerGames.class);
        computerGames2.playGame();

        context.close();
    }
}
