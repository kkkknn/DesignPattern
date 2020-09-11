package CombinedMode;

import java.util.Iterator;
import java.util.List;

public class Folder extends Dir {
    public Folder(String name){
        super(name);
    }
    public void addDir(Dir dir) {
        dirs.add(dir);
    }

    public void rmDir(Dir dir) {
        dirs.remove(dir);
    }

    public void clear() {
        dirs.clear();
    }

    public void print() {
        System.out.print(getName()+"(");
        Iterator<Dir> iterator=dirs.iterator();
        while (iterator.hasNext()){
            Dir dir=iterator.next();
            dir.print();
            if(iterator.hasNext()){
                System.out.print(",");
            }
        }
        System.out.print(")");
    }

    public List<Dir> getFiles() {
        return dirs;
    }
}
