package Day13;

import java.util.Arrays;

public class Person2 {
    private String name;
    private Person2[] friends;

    public Person2(String name, int size) {
        this.friends = new Person2[size];
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Person2[] getFriends() {
        return this.friends;
    }

    public boolean hasEmptySlot() {
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] == null) {
                return true;
            }
        }
        return false;
    }

    public int countFriends() {
        int count = 0;
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void addFriend(Person2 other) {
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] == null) {
                this.friends[i] = other;
                break;
            }
        }
    }

    public void addFriends(Person2[] others) {
        if (others == null) {
            return;
        }
        for (int i = 0; i < others.length; i++) {
            this.addFriend(others[i]);

        }
    }

    public void printAllFriendNames() {
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] != null) {
                System.out.println(this.friends[i].getName());
            }
        }
    }

    public boolean hasFriendNamed(String name) {
        if (name == null) {
            return false;
        }
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] != null && this.friends[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                '}';
    }

    public Person2 getFirstFriend() {
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] != null) {
                return this.friends[i];
            }
        }
        return null;

    }

    public Person2 getLastFriend() {
        Person2 temp = null;
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] != null) {
                temp = this.friends[i];
            }
        }
        return temp;
    }

    public boolean isFriendAt(int index) {
        if (index >= this.friends.length || index < 0) {
            return false;
        }
        return friends[index] != null;
    }

    public void removeFriendAt(int index) {
        if (index >= this.friends.length || index < 0) {
            return;
        }
        if (friends[index] == null) {
            return;
        }
        this.friends[index] = null;
    }

    public Person2 getFriendAt(int index) {
        if (index >= this.friends.length || index < 0) {
            return null;
        }
        return this.friends[index];
    }

    public boolean hasFriend(Person2 other) {
        if (other == null) {
            return false;
        }
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] == other) {
                return true;
            }
        }
        return false;
    }

    public int getFriendIndex(Person2 other) {
        if (other == null) {
            return -1;
        }
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] == other) {
                return i;
            }
        }
        return -1;
    }

    public void replaceFriend(Person2 oldFriend, Person2 newFriend) {
        if (oldFriend == null || newFriend == null) {
            return;
        }
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] == oldFriend) {
                this.friends[i] = newFriend;
                break;
            }
        }
    }

    public void clearFriends() {
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] != null) {
                this.friends[i] = null;
            }
        }

    }

    public boolean isFull() {
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void swapFriends(int index1, int index2) {
        if (index1 >= this.friends.length || index2 >= this.friends.length || index1 < 0 || index2 < 0 || this.friends[index1] == null) {
            return;
        }
        Person2 temp = this.friends[index1];
        this.friends[index1] = this.friends[index2];
        this.friends[index2] = temp;
    }

    public void moveFriendToFront(Person2 other) {
        if (other == null) {
            return;
        }
        int index = getFriendIndex(other);
        if (index == -1 || index == 0) {
            return;
        }
        Person2 temp = this.friends[index];
        for (int i = index; i > 0; i--) {
            this.friends[i] = this.friends[i - 1];
        }
        this.friends[0] = temp;
    }

    public void moveFriendToBack(Person2 other) {
        if (other == null) {
            return;
        }
        int index = getFriendIndex(other);
        if (index == -1 || index == 0) {
            return;
        }
        int lastIndex = -1;
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] != null) {
                lastIndex = i;
            }
        }
        if (index == lastIndex) {
            return;
        }

        Person2 temp = this.friends[index];
        for (int i = index; i < lastIndex; i++) {
            this.friends[i] = this.friends[i + 1];
        }
        this.friends[lastIndex] = temp;
    }

    public void moveFriendToIndex(Person2 other, int targetIndex) {
        if (other == null) {
            return;
        }
        if (targetIndex < 0 || targetIndex >= this.friends.length) {
            return;
        }
        int index = getFriendIndex(other);
        if (index == -1) {
            return;
        }
        if (this.friends[targetIndex] == null) {
            return;
        }
        if (index == targetIndex) {
            return;
        }
        Person2 temp = this.friends[index];
        if (index < targetIndex) {
            for (int i = index; i < targetIndex; i++) {
                this.friends[i] = this.friends[i + 1];
            }
        } else {
            for (int i = index; i > targetIndex; i--) {
                this.friends[i] = this.friends[i - 1];
            }
        }
        this.friends[targetIndex] = temp;
    }

    public void insertFriend(Person2 newFriend, int targetIndex) {
        if (newFriend == null) {
            return;
        }
        if (targetIndex < 0 || targetIndex >= this.friends.length) {
            return;
        }
        if (this.isFull()) {
            return;
        }
        int lastIndex = -1;
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] != null) {
                lastIndex = i;
            }
        }
        for (int i = lastIndex + 1; i > targetIndex; i--) {
            this.friends[i] = this.friends[i - 1];
        }
        this.friends[targetIndex] = newFriend;
    }

    public void removeFriend(Person2 other) {
        if (other == null) {
            return;
        }
        int index = getFriendIndex(other);
        if (index == -1) {
            return;
        }
        for (int i = index; i < this.friends.length - 1; i++) {
            this.friends[i] = this.friends[i + 1];
        }
        this.friends[this.friends.length - 1] = null;
    }

    public void removeAllFriends(Person2 other) {
        if (other == null) {
            return;
        }
        int j = 0;
        //把不删除的人往前挪
        //先把要留的移到前面去
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] != null && this.friends[i] != other) {
                friends[j] = this.friends[i];
                //前移
                j++;
            }
        }
        //从j开始往后的都删除
        for (int i = j; i < this.friends.length; i++) {
            friends[i] = null;
        }
    }

    public void keepOnlyFriends(Person2 other) {
        if (other == null) {
            return;
        }
        int j = 0;
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] == other) {
                this.friends[j] = this.friends[i];
                j++;
            }
        }
        for (int i = j; i < this.friends.length; i++) {
            this.friends[i] = null;
        }
    }

    public void removeDuplicate() {
        int j = 0;
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] == null) {
                continue;
            }
            boolean flag = false;
            for (int k = 0; k < j; k++) {
                if (this.friends[k].getName().equals(this.friends[i].getName())) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                this.friends[j] = this.friends[i];
                j++;
            }
        }
        for (int i = j; i < this.friends.length; i++) {
            this.friends[i] = null;
        }

    }
    public boolean hasDuplicate() {
        int j = 0;
        for (int i = 0; i < this.friends.length; i++) {
            if(this.friends[i]==null){
                continue;
            }
            for (int k = 0; k < i; k++) {
                if (this.friends[k] != null && this.friends[k].getName().equals(this.friends[i].getName())) {
                    return false;
                }
            }
        }
        return true;
    }
    public void removeAllByName(String name) {
        if(name==null){
            return;
        }
        int j = 0;
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] != null && !this.friends[i].getName().equals(name)) {
                this.friends[j] = this.friends[i];
                j++;
            }
        }
        for (int i = j; i < this.friends.length; i++) {
            this.friends[i] = null;
        }
    }
    public int countByName(String name) {
        if(name==null){
            return 0;
        }
        int j = 0;
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] != null && this.friends[i].getName().equals(name)) {
                j++;
            }
        }
        return j;
    }
    public boolean hasFriendByName(String name) {
        if(name==null){
            return false;
        }
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] != null && this.friends[i].getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    public Person2 getFirstFriendByName(String name) {
        if(name==null){
            return null;
        }
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] != null && this.friends[i].getName().equals(name)) {
                return this.friends[i];
            }
        }
        return null;
    }
    public Person2 getLastFriendByName(String name) {
        if(name==null){
            
            return null;
        }
        for (int i = friends.length-1; i >= 0;i--) {
            if (this.friends[i] != null && this.friends[i].getName().equals(name)) {
                return this.friends[i];
            }
        }
        return null;
    }
    public Person2 getLongestNameFriend(){
        Person2 max=null;
        for(int i=0;i<this.friends.length;i++){
            if(this.friends[i]==null){
                continue;
            }
            if(max==null||this.friends[i].getName().length()>max.getName().length()){
                max=this.friends[i];
            }
        }
        return max;
    }
    public void compactFriends() {
        int j = 0;
        for (int i = 0; i < this.friends.length; i++) {
            if(this.friends[i] != null){
                this.friends[j]=this.friends[i];
                j++;
            }
        }
        for(int i = j; i < this.friends.length;i++){
            this.friends[i]=null;
        }
    }
    public void reverseFriends(){
        int left=0;
        int right=this.friends.length-1;
        while(left<right){
            Person2 temp=this.friends[left];
            this.friends[left]=this.friends[right];
            this.friends[right]= temp;
            left++;
            right--;
        }
    }
    public void removeNulls(){
        int j = 0;
        for (int i = 0; i < this.friends.length; i++) {
            if(this.friends[i]!=null){
                this.friends[j]=this.friends[i];
                j++;
            }
        }
        for(int i = j; i < this.friends.length;i++){
            this.friends[i]=null;
        }
    }
    public void sortByName(){
        for (int i = 0; i < this.friends.length; i++) {
            for (int j = i+1; j < this.friends.length; j++) {
            if(this.friends[i]!=null&&this.friends[j]!=null&&this.friends[i].getName().compareTo(this.friends[j].getName())>0) {
                Person2 temp = this.friends[i];
                this.friends[i] = this.friends[j];
                this.friends[j] = temp;
            }
            }
        }
    }
    public void sortByNameLength(){
        if(this.friends==null||this.friends.length==0){
            return;
        }
        for(int i=0;i<this.friends.length;i++){
            for(int j=i+1;j<this.friends.length;j++){
                if(this.friends[i]!=null&&this.friends[j]!=null&&this.friends[i].getName().length()>this.friends[j].getName().length()){
                    Person2 temp = this.friends[j];
                    this.friends[j] = this.friends[i];
                    this.friends[i] = temp;
                }
            }
        }
    }
    public void moveNullsToEnd(){
        int j = 0;
        for(int i=0;i<this.friends.length;i++){
            if(this.friends[i]!=null){
                this.friends[j]=this.friends[i];
                j++;
            }
        }
        for(int i = j; i<this.friends.length;i++){
            this.friends[i]=null;
        }
    }
    public void removeByName(String name) {
        if(name==null){
            return;
        }
        int j = 0;
        for (int i = 0; i < this.friends.length; i++) {
            if (this.friends[i] != null && !this.friends[i].getName().equals(name)) {
                //保留
                this.friends[j]=this.friends[i];
                j++;
            }
        }
        for(int i = j; i < this.friends.length;i++){
            this.friends[i]=null;
        }
    }
    public void removeDuplicates() {
        int j = 0;
        for (int i = 0; i < this.friends.length; i++) {
            if(this.friends[i]==null) continue;
            boolean flag = false;
            for(int k = 0; k < j; k++){
                if(this.friends[i].equals(this.friends[k])){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                this.friends[j]=this.friends[i];
                j++;
            }
        }
        for(int i = j; i < this.friends.length;i++){
            this.friends[i]=null;
        }
    }
    public int countDuplicateNames(){
        int count = 0;
        for (int i = 0; i < this.friends.length; i++) {
            if(this.friends[i]==null){
                continue;
            }
            for(int j = i-1; j >=0;j--){
                if (this.friends[j] != null && this.friends[j].getName().equals(this.friends[i].getName())) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public String getFirstDuplicateName(){
        if(this.friends==null||this.friends.length==0){
            return null;
        }
        for(int j=0;j<this.friends.length;j++){
            if(this.friends[j]==null){
                continue;
            }
            for(int k=0;k<j;k++){
                if(this.friends[k]!=null &&
                        this.friends[k].getName().equals(this.friends[j].getName())){
                    return this.friends[j].getName();
                }
            }
        }
        return null;
    }
    public String getFirstUniqueName(){
        if(this.friends==null||this.friends.length==0){
            return null;
        }
        for(int i=0;i<this.friends.length;i++){
            if(this.friends[i]==null){
                continue;
            }
            boolean flag=true;
            for(int j=0;j<this.friends.length;j++){
                if(j!=i&&this.friends[j]!=null&&
                        this.friends[j].getName().equals(this.friends[i].getName())){
                    flag=false;
                    break;
                }
            }
            if(flag){
                return this.friends[i].getName();
            }
        }
        return null;
    }
    public static int countChar(String s,char target){
        if(s==null||s.length()==0) return 0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==target){
                count++;
            }
        }
        return count;
    }
    public static boolean containsChar(String s,char target){
        if(s==null||s.length()==0) return false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
    public static int firstIndexOf(String s,char target){
        if(s==null||s.length()==0) return -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
    public  static int lastIndexOf(String s,char target){
        if(s==null||s.length()==0) return -1;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
    public static int countDistinct(String s){
        if(s==null|| s.isEmpty()) return 0;
        int count=0;
        for(int i=0;i<s.length();i++){
            boolean flag=false;
            for(int j=0;j<i;j++){
                if(s.charAt(i)==s.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                count++;
            }
        }
        return count;
    }
    public static int countVowels(String s){
        if(s==null||s.isEmpty()) return 0;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return  count;
    }
    public static String reverse(String s){
        if(s.isEmpty()) return null;
        String result="";
        for(int i=s.length()-1;i>=0;i--){
            result=result+s.charAt(i);
        }
        return result;
    }
    public static boolean isPalindrome(String s){
        if(s==null||s.isEmpty()) return false;
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean isPalindromeIgnore(String s){
        if(s==null) return false;
        int left = 0;
        int right = s.length()-1;
        s=s.toLowerCase();
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static int countWords(String s){
        if(s==null||s.isEmpty()) return 0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '&&(i==0||s.charAt(i-1)==' ')){
                count++;
            }
        }
        return count;
    }
    public static String removeSpaces(String s){
        if(s.isEmpty()) return null;
        String  result="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                result+=s.charAt(i);
            }
        }
        return result;
    }

}
