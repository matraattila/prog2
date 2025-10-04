import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME) // For accessing annotation during runtime
public @interface Prog2Info {
    String oktato() default "Unnamed";
    String terem() default "IK-F0";
}
