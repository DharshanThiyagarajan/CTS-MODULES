import java.lang.reflect.*;

class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("java.lang.String");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
        }
    }
}
