package Task_6.Transfer;

import java.io.FileNotFoundException;

public interface Exporter {
    boolean exportTo(String path) throws FileNotFoundException;
}
