
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "AppContext.xml"
        );

        Human human = context.getBean("human", Human.class);
        human.setName("Sherkhan");
        human.setGender("male");
        human.setYear(22);

        System.out.println(human.getName() + "\n" + human.isGender() + "\n" + human.getYear());

        context.close();


    }
}
