package template_method.task;

import java.io.File;
import java.io.IOException;
import java.util.List;


/**
 * Предполгагается активное расширение приложения. Известно, что помимо Person будет добавлено еще ~10 сущностей.
 * Необходимо зарефакторить чтение сущностей из файла (Reader) таким образом,
 * чтобы функционал по чтению новых объектов добавлялся с наименьшими усилиями и без дублирования кода.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        PersonReader personReader = new PersonReader(new File("person.csv"));
        List<Person> people = personReader.readAll();
        System.out.println(people);
    }
}
