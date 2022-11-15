
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "AppContext.xml"
        );

        Human human = context.getBean("human", Human.class);
        Scanner in = new Scanner(System.in);
        System.out.print("name: ");
        String name = in.nextLine();

        System.out.print("sex: ");
        String sex = in.nextLine();

        System.out.print("birthday: ");
        String birthday = in.nextLine();

        human.setName(name);
        human.setGender(sex);
        human.setBirthday(birthday);

        System.out.println("name: " + human.getName());
        System.out.println("sex: " + human.getGender());
        System.out.println("birthday: " + human.getBirthday());

        context.close();


    }
}
