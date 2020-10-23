package FacadeMode;

public class MobilePhone {
    private Phone mPhone=new PhoneImpl();
    private Camera mCamera=new CameraImpl();

    public void dail(){
        mPhone.dail();
    }

    public void videoChat(){
        System.out.println("==>视频通话连接中");
        mCamera.open();
        mPhone.dail();
    }

    public void hangup(){
        mPhone.hangup();
    }

    public void takePicture(){
        mCamera.open();
        mCamera.takePicture();
    }

    public void closeCamera(){
        mCamera.close();
    }
}
