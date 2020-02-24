package Prototype;

import java.util.ArrayList;

public class WordDocument implements Cloneable{
    //文本
    private String mText;
    //图片名列表
    private ArrayList<String> mImages=new ArrayList<String>();

    public WordDocument() {
        System.out.println("-----------构造函数-----------");
    }

    @Override
    protected WordDocument clone(){
        try {
            WordDocument document=(WordDocument) super.clone();
            document.mImages=this.mImages;
            document.mText=this.mText;
            return document;
        }catch (Exception e){
        }
        return null;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getmImages() {
        return mImages;
    }

    public void setmImages(ArrayList<String> mImages) {
        this.mImages = mImages;
    }
    public void addImg(String name){
        this.mImages.add(name);
    }
    //打印文档内容
    public void showDocument(){
        System.out.println("-------word Content Start------");
        System.out.println("text:"+mText);
        System.out.println("imgList:");
        for (String name:mImages) {
            System.out.println("imgName:"+name);
        }
        System.out.println("---------word Content End-------");
    }
}