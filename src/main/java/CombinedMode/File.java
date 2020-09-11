package CombinedMode;

import java.util.List;

public class File extends Dir {
    public File(String name){
        super(name);
    }

    public void addDir(Dir dir) {
        throw new UnsupportedOperationException("文件对象不支持该操作");
    }

    public void rmDir(Dir dir) {
        throw new UnsupportedOperationException("文件对象不支持该操作");
    }

    public void clear() {
        throw new UnsupportedOperationException("文件对象不支持该操作");
    }

    public void print() {
        System.out.print(getName());
    }

    public List<Dir> getFiles() {
        throw new UnsupportedOperationException("文件对象不支持该操作");
    }
}
