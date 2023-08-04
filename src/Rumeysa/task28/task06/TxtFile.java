package Rumeysa.task28.task06;

import task28.task06.ReadFile;

public class TxtFile implements ReadFile {
    @Override
    public String open() {
        return "opening.txt";
    }

    @Override
    public String read() {
        return "reading.txt";
    }

    @Override
    public String save() {
        return "saving.txt";
    }

    @Override
    public String close() {
        return "closing.txt";
    }
}
