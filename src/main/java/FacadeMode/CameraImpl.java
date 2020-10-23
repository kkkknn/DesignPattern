package FacadeMode;

public class CameraImpl implements Camera {
    public void open() {
        System.out.println("打开相机");
    }

    public void takePicture() {
        System.out.println("拍照");
    }

    public void close() {
        System.out.println("关闭相机");
    }
}
