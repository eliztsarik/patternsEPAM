package template_method.task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Reader2<T> {
    private File file;
    private List<T> list = new ArrayList<>();

    public Reader2(File file) {
        this.file = file;
    }

    public final List<T> readAll() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        while ((line = br.readLine()) != null) {
            String[] details = line.split(",");
            T newEntity = createNewEntity(details);
            list.add(newEntity);
        }
        br.close();
        return list;
    }

    abstract T createNewEntity(String[] details);
}
