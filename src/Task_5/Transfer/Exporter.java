package Task_5.Transfer;

import java.io.FileNotFoundException;

public interface Exporter {
    boolean exportTo(String path) throws FileNotFoundException;
}
