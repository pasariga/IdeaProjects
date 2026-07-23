package Day12;

public class Student {
     private String name;
    private int age;
    public Student(String name,int age){
        this.name=name;
        setAge(age);
    }
    public void setAge(int age){
        if(age>0&&age<100){
            this.age=age;
        }
        else{
            System.out.println("Invalid Age");
        }
    }
    public void getInfo(){
        System.out.println(name+":"+age);
    }
    public String compareAge(Student other){
        if(this.age>other.age){
            return "I'm older.";
        }
        else if(this.age<other.age){
            return other.name+" is older.";
        }
        return "Same age.";
    }
    public Student youngerOne(Student other){
        return this.age>other.age?other:this;
    }
    public Student olderOne(Student other){
        return this.age<other.age?other:this;
    }
    public static Student oldest(Student a,Student b,Student c){
     Student max = a.olderOne(b);
     max=max.olderOne(c);
     return max;
    }
    public static Student youngest(Student a,Student b,Student c){
        Student min = a.youngerOne(b);
        min=min.youngerOne(c);
        return min;
    }
    public int ageDifference(Student other){
        return Math.abs(this.age-other.age);
    }
    public int maxAgeDifference(Student b,Student c){
        int ab = this.ageDifference(b);
        int ac = this.ageDifference(c);
        int bc = b.ageDifference(c);
        return Math.max(ab,Math.max(ac,bc));
    }
    public boolean canBeClassmate(Student other){
        if(this.ageDifference(other)<=2){
            return true;
        }
        return false;
    }
    private int getGroup(){
        if(this.age<=12){
            return 1;
        }
        else if(this.age<=17){
            return 2;
        }
        return 3;
    }
    public boolean isSameGroup(Student other){
        return this.getGroup()==other.getGroup();
    }
    public boolean isSameGroup(Student b,Student c){
        return this.getGroup()==b.getGroup()&&this.getGroup()==c.getGroup();
    }
    public static Student middle(Student a,Student b,Student c){
        if(a.age>=b.age&&a.age<=c.age||a.age>=c.age&&a.age<=b.age){
        return a;
        }
        else if(b.age>=a.age&&b.age<=c.age||b.age>=c.age&&b.age<=a.age){
            return b;
        }
        return c;
    }
    public static boolean isConsecutive(Student a,Student b,Student c){
        Student max = Student.oldest(a,b,c);
        Student min = Student.youngest(a,b,c);
        Student mid =  Student.middle(a,b,c);
        if(max==mid||min==mid){
            return false;
        }
        return max.age == mid.age + 1 && min.age == mid.age - 1;
    }
    public boolean isAdult(){
        return  this.age>=18;
    }

    public static int countAdults(Student a,Student b,Student c){
        int count = 0;
        if(a.isAdult()){
            count++;
        }
        if(b.isAdult()){
            count++;
        }
        if (c.isAdult()) {
            count++;
        }
        return count;
    }
    public static boolean allAdults(Student a,Student b,Student c){
        return a.isAdult()&&b.isAdult()&&c.isAdult();
    }
    public static boolean anyAdult(Student a,Student b,Student c){
        return a.isAdult()||b.isAdult()||c.isAdult();
    }
    public static boolean noneAdult(Student a,Student b,Student c){
        return !anyAdult(a,b,c);
    }
    public static boolean exactlyOneAdult(Student a,Student b,Student c){
        return countAdults(a,b,c)==1;
    }
    public static boolean exactlyTwoAdults(Student a,Student b,Student c){
        return countAdults(a,b,c)==2;
    }

    public static boolean exactlyThreeAdults(Student a,Student b,Student c){
        return countAdults(a,b,c)==3;
    }
    public static String adultSummary(Student a,Student b,Student c){
        int count = countAdults(a,b,c);
        if(count==0){
            return "None adult";
        }
        else if(count==1){
            return "One adult";
        }
        else if(count==2){
            return "Two adults";
        }
        return "Three adults";
    }
    public static Student firstAdult(Student a,Student b,Student c){
        if(a.isAdult()){
            return a;
        } else if (b.isAdult()) {
            return b;
        } else if (c.isAdult()) {
            return c;
        }
        return null;
    }
    public static Student lastAdult(Student a,Student b,Student c){
        if(c.isAdult()){
            return c;
        }
        else if(b.isAdult()){
            return b;
        } else if (a.isAdult()) {
            return a;
        }
        return null;
    }
    public static Student secondAdult(Student a,Student b,Student c){
        int count = 0;
        if(a.isAdult()){
            count++;
        }
        if(b.isAdult()){
            count++;
            if(count==2){
                return b;
            }
        }
        if(c.isAdult()){
            count++;
            if(count==2){
                return c;
            }
        }
        return null;
    }
    public static Student thirdAdult(Student a,Student b,Student c){
        if(countAdults(a,b,c)==3){
            return c;
        }
        return null;
    }
    public static Student onlyAdult(Student a,Student b,Student c){
        if(countAdults(a,b,c)!=1){
            return null;
        }
        if(a.isAdult()){
            return a;
        }
        if(b.isAdult()){
            return b;
        }
        return c;
    }
    public static Student onlyMinor(Student a,Student b,Student c){
        if(countAdults(a,b,c)!=2){
            return null;
        }
        if(!a.isAdult()){
            return a;
        }
        if(!b.isAdult()){
            return b;
        }
        return c;
    }
    public static Student youngestAdult(Student a,Student b,Student c){
        if(countAdults(a,b,c)==0){
            return null;
        }
        Student result = null;
        if(a.isAdult()){
            result = a;
        }
        if(b.isAdult()){
            if(result==null){
                result = b;
            }
            else{
                result=result.youngerOne(b);
            }
        }
        if(c.isAdult()){
            if(result==null){
                result = c;
            }
            else{
                result=result.youngerOne(c);
            }
        }
        return result;
    }
    public static Student oldestMinor(Student a,Student b,Student c){
        if(countAdults(a,b,c)==3){
            return null;
        }
        Student result = null;
        if(!a.isAdult()){
            result = a;
        }
        if(!b.isAdult()){
            if(result==null){
                result = b;
            }
            else{
                result=result.olderOne(b);
            }
        }
        if(!c.isAdult()){
            if(result==null){
                result = c;
            }
            else{
                result=result.olderOne(c);
            }
        }
        return result;
    }
    public static Student middleAdult(Student a,Student b,Student c){
        if(countAdults(a,b,c)!=3){
            return null;
        }
        return middle(a,b,c);
    }
    public static Student middleMinor(Student a,Student b,Student c){
        if(countAdults(a,b,c)!=0){
            return null;
        }
        return middle(a,b,c);
    }
    public static String Summary(Student a,Student b,Student c){
        if(countAdults(a,b,c)==0){
            return "No such Student.";
        }
        Student result = oldest(a,b,c);
        return "成年人有"+countAdults(a,b,c)+"个,其中最年长的是："+result.name;
    }
    public static int adultAgeSum(Student a,Student b,Student c){
        return (a.isAdult()?a.age:0)+(b.isAdult()?b.age:0)+(c.isAdult()?c.age:0);
    }
    public static int maxAdultAge(Student a,Student b,Student c){
        int max=-1;
        if(a.isAdult()){
            max=Math.max(max,a.age);
        }
        if(b.isAdult()){
            max=Math.max(max,b.age);
        }
        if(c.isAdult()){
            max=Math.max(max,c.age);
        }
        return max;
    }
    public static Student oldestAdult(Student a,Student b,Student c){
        if(countAdults(a,b,c)==0){
            return null;
        }
        return oldest(a,b,c);
    }
    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age;
    }
    public static Student adultWithMaxAge(Student a,Student b,Student c){
       return oldest(a,b,c);
    }
    public static double averageAdultAge(Student a,Student b,Student c){
        if(countAdults(a,b,c)==0){
            return 0.0;
        }
        return (double) adultAgeSum(a, b, c) /countAdults(a,b,c);
    }
    public static Student closestToAverageAdult(Student a,Student b,Student c){
        if(countAdults(a,b,c)==0){
            return null;
        }
        Student temp=oldest(a,b,c);
        if(a.isAdult()){
            if(temp.age>a.age){
                temp=a;
            }
        }
        if(b.isAdult()){
            if(temp.age>b.age){
                temp=b;
            }
        }
        if(c.isAdult()){
            if(temp.age>c.age){
                temp=c;
            }
        }
        return temp;
    }
    public static Student getTheOnlyMinor(Student a,Student b,Student c){
        if(countAdults(a, b, c) != 2){
            return null;
        }
        if(!a.isAdult()){
            return a;
        }
        if(!b.isAdult()){
            return b;
        }
        return c;
    }
    public static Student getYoungestAdult(Student a,Student b,Student c){
        if(countAdults(a,b,c)==0){
            return null;
        }
        return youngestAdult(a,b,c);


    }
    public static boolean hasTwoAdultsWithSameAge(Student a,Student b,Student c){
        if(countAdults(a,b,c)!=2){
            return false;
        }
        int adultCount=0;
        int age=0;
        Student[] arr={a,b,c};
        for(int i=0;i< countAdults(a,b,c);i++){
            if(arr[i].isAdult()){
                adultCount++;
                if(adultCount==1){
                    age=arr[i].age;
                }
                else{
                    return arr[i].age==age;
                }
            }
        }
        return false;
    }
    public static int getTotalAdultAge(Student a,Student b,Student c){
        if(countAdults(a,b,c)==0){
            return 0;
        }
        int sum=0;
        Student[] arr={a,b,c};
        for(int i=0;i< arr.length;i++){
            if (arr[i].isAdult()){
                sum+=arr[i].age;
            }
        }
        return sum;
    }
    public static double getAverageAdultAge(Student[] students){
    double sum=0;
    int AdultCount=0;
    for(int i=0;i<students.length;i++){
        if(students[i].isAdult()){
            sum+=students[i].age;
            AdultCount++;
        }
    }
    if(AdultCount==0){
        return 0;
    }
    return sum/AdultCount;
    }
    public static Student getFirstAdult(Student[] students){
       for(int i=0;i<students.length;i++){
           if(students[i].isAdult()){
               return students[i];
           }
       }
       return null;
    }
    public static Student getOldestAdult(Student[] students){
        Student oldest =null;
        int count=0;
        for(int i=0;i<students.length;i++){
            if(students[i].isAdult()){
                count++;
            if(oldest==null||students[i].age> oldest.age){
                oldest=students[i];
            }
            }
        }
        if(count==0){
            return null;
        }
        return oldest;
    }
    public static int getAdultAgeSpan(Student[] students){
        int count=0;
        Student max=null;
        Student min=null;
        for(int i=0;i<students.length;i++){
            if(students[i].isAdult()){
                count++;
                if(min==null||students[i].age<min.age){
                    min=students[i];
                }
                if(max==null||students[i].age>max.age){
                    max=students[i];
                }
            }
        }
        if(count<2){
            return 0;
        }
        return max.age-min.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public static Student getLongestNameStudent(Student[] students){
        if(students==null||students.length==0){
            return null;
        }
        Student maxNameStudent=students[0];
        for(int i=0;i<students.length;i++){
            if(students[i].getName().length()>maxNameStudent.getName().length()){
                maxNameStudent=students[i];
            }
        }
        return maxNameStudent;
    }
    public static void fixStudentAges(Student[] students,int defaultAge){
        if(students==null||students.length==0){
            return;
        }
        for(int i=0;i<students.length;i++){
            if(students[i].getAge()<18){
                students[i].setAge(defaultAge);
            }
        }
    }
    private Student roommate;

    public Student getRoommate() {
        return roommate;
    }

    public void setRoommate(Student roommate) {
        if (this.roommate != null) {
            System.out.println("roommate already exists");
            return;
        }
        this.roommate = roommate;
    }
    public boolean hasRoommate(){
        return this.roommate!=null;
    }
    public void bindRoommate(Student other){
        if(this.roommate!=null){
            System.out.println("roommate already exists");
            return;
        }
        this.setRoommate(other);
        other.setRoommate(this);
    }
    public void unbindRoommate(){
        if(this.roommate==null){
            return;
        }
        Student temp=this.roommate;
        this.roommate=null;
        temp.roommate=null;
    }
    public boolean isRoommateWith(Student other){
        if(this.roommate==null){
            return false;
        }
        return this.roommate == other;
    }
    public void changeRoommate(Student newRoommate){
        if(newRoommate==null||newRoommate.roommate==this.roommate){
            return;
        }
        if(newRoommate.roommate!=null){
            newRoommate.unbindRoommate();
        }
        if(this.roommate!=null){
            this.unbindRoommate();
        }
        this.bindRoommate(newRoommate);
    }
    public boolean hasSameRoommate(Student other){
        if(other==null){
            return false;
        }
        if(this.roommate==null||other.roommate==null){
            return false;
        }
        return this.roommate == other.roommate;
    }

}











