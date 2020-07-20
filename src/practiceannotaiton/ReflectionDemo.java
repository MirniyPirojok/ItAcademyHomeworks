/*2. Поменять ретеншн аннотации на поддержку использования над классами, полями и методами.
 Написать метод, который будет определять классы в пакете, которые помечены аннотацией,
после этого в каждом из найденных классов нужно вывести поля и методы, помеченные аннотацией*/

package practiceannotaiton;

import homework3.domain.Car;
import homework6.Computer;

import javax.lang.model.element.Name;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionDemo {
    public static void main(String[] args) {
        annotationInvestigation();
    }//end of main

    private static void annotationInvestigation(){

        Car car = new Car();
        Class<? extends Car> carClass = car.getClass();

        Annotation[] classAnnotations = carClass.getDeclaredAnnotations();

    for (Annotation classAnnotation : classAnnotations) {
            System.out.println(classAnnotation.toString());
        }
        Method[] declaredMethods = carClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            if(declaredMethod.isAnnotationPresent(PracticeAnnotation.class)){
                System.out.println(Modifier.toString(declaredMethod.getModifiers()) + " " +
                        declaredMethod.getName());
            }
        }

        Field[] declaredFields = carClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if(declaredField.isAnnotationPresent(PracticeAnnotation.class)){
                System.out.println(Modifier.toString(declaredField.getModifiers()) + " " +
                        declaredField.getName());
            }
        }
    }

}//end of class
