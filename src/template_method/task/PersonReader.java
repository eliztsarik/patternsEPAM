package template_method.task;

import java.io.File;

public class PersonReader extends Reader2<Person> {
    public PersonReader(File file) {
        super(file);
    }

    @Override
    Person createNewEntity(String[] details) {
        Person person = new Person();
        person.setName(details[0]);
        person.setPhone(details[1]);
        person.setScore(Integer.parseInt(details[2]));
        return person;
    }
}
