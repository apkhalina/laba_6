import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface ToString {
    Mode value() default Mode.YES;

    enum Mode {
        YES, NO
    }
}