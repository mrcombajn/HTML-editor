package app;

import javax.swing.filechooser.FileFilter;
import java.io.File;

public class HTMLFileFilter extends FileFilter {
    @Override
    public boolean accept(File f) {
        return f.getName().endsWith(".htm")
                || f.getName().endsWith(".html")
                || f.isDirectory()
                || f.getName().endsWith(".HTM")
                || f.getName().endsWith(".HTML");
    }

    @Override
    public String getDescription() {
        return "HTML and HTM files";
    }
}
