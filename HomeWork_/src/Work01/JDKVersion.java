package Work01;

public class JDKVersion {
    public static void main(String[] args) {
        String jdkVersion=getJDKVersion();
        String jdkPath=getJDKPath();
        System.out.println("当前JDK版本为："+jdkVersion);
        System.out.println("JDK所在路径："+jdkPath);

    }
    public static String getJDKVersion(){
        String jdkVersion=Runtime.version().toString();
        return jdkVersion;
    }
    public static String getJDKPath(){
        String jdkPath=System.getProperty("java.home");
        return jdkPath;
    }
}
