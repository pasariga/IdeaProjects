package excception;

public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try{//try监控区域
            System.out.println(a/b);

        }
        catch(Error e){//catch捕获异常
            System.out.println("Error");
        } catch (Exception e) {
            System.out.println("Exception");
        } catch (Throwable e) {
            System.out.println("Throwable");
        }
        finally {//处理善后工作
            System.out.println("finally");
        }
        //finally可以不要，假设IO,资源，关闭！

    }
    public void a(){b();}
    public void b(){a();}
}
