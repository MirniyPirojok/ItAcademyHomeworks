/*Создать аннотацию, которая будет ставиться над констуркторами и классами + доступна только на этапе компиляции*/

package practiceannotaiton;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.CONSTRUCTOR, ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface PracticeAnnotation {
}
