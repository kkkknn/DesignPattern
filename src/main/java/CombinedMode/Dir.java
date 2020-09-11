package CombinedMode;

import java.util.ArrayList;
import java.util.List;

public abstract class Dir {
    //声明一个list成员变量存储文件夹下的所有元素
    protected List<Dir> dirs=new ArrayList<Dir>();

    private String name;//当前文件夹或用户名
    public Dir(String name){
        this.name=name;
    }
    //添加一个文件或文件夹
    public abstract void addDir(Dir dir);
    //移除一个文件或文件夹
    public abstract void rmDir(Dir dir);
    //清空文件夹内的所有元素
    public abstract void clear();
    //输出文件夹目录结构
    public abstract void print();
    //获取文件夹内所有文件或者子文件夹
    public abstract List<Dir> getFiles();

    //获取文件或文件夹名字
    public String getName(){
        return name;
    }
}
