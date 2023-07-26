import me.jaehoon.section3.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("me.jaehoon.section3.game")
public class GameApplication {
    public static void main(String[] args) {
        try(
                var context = new AnnotationConfigApplicationContext(GameApplication.class);
        ) {
            var gameRunner = context.getBean(GameRunner.class);
            gameRunner.run();
        }
    }
}
