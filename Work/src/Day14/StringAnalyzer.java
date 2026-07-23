package Day14;

public class StringAnalyzer {
    private String name;
    public StringAnalyzer(String name){
        this.name=name;
    }
    public  int CountVowels(){
        if(name==null){
            return 0;
        }
        int count=0;
        String s=name.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o') count++;
        }
        return count;
    }
    public static void main(String[] args) {
        StringAnalyzer sa=new StringAnalyzer("Taylor");
        System.out.println(sa.CountVowels());
    }
}
