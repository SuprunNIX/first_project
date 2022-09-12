package TheReflectionAPI;

import java.lang.reflect.Field;

//NEED TO INVESTIGATE

public class Main {
    /**
     * Создать родительский класс, который имеет несколько классов наследников и класс Program.
     * Каждый из классов наследников содержит в себе только приватные String поля и пустой конструктор.
     * В классе Program реализовать метод, который будет будет принимать в себя Object и заполнять каждое поле случайными данными.
     * Реализовать метод в родительском классе, который будет возвращать значение и название каждого поля в классе наследнике и выводить в консоль.
     */

    public static void main(String[]args) throws IllegalAccessException, NoSuchFieldException {
        Program program = new Program();

        Object object = new Object();
        program.setName(object);

        Arrays array = new Arrays();
        program.setName(array);

        getFields(array);
        getFields(object);

    }

    public static void getFields (Object object) throws NoSuchFieldException {
        Class myClassObj = object.getClass();
        System.out.println(myClassObj.getName());



        Field myField = myClassObj.getDeclaredField("name");
        System.out.println("Field name: " + myField.getName());
        //System.out.println("Field value: " + myField.get());
    }
}
