import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Books books = new Books();
        Class map = books.getClass();

        Method[] methods = map.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAnnotation.class)) {
                MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
                try {
                    method.invoke(books, myAnnotation.paramOne(), myAnnotation.paramTwo());
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        books.getBooks().forEach((a, b) -> System.out.println(a + " - " + b));
    }
}
