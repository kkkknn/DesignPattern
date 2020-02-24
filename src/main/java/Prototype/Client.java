package Prototype;

public class Client {
    public static void main(String[] args) {
        WordDocument document=new WordDocument();
        document.setmText("这个是文档");
        document.addImg("图片1");
        document.addImg("图片2");
        document.addImg("图片3");
        document.showDocument();

        //以原始文档为原型，拷贝一份副本
        WordDocument doc2= document.clone();
        doc2.showDocument();
        doc2.setmText("这个是修改过的副本文档");
        doc2.showDocument();

        document.showDocument();
    }
}
