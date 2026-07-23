

void main() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("跑腿小哥已就位！");}
    catch(ClassNotFoundException e){
        e.printStackTrace();
        }
    }