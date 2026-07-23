package Day13;

import Day12.Student;

import java.util.Objects;

public class Person {
    private String name;
    private Person friend;
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public boolean hasFriend(){
        return friend != null;
    }

    public void setFriend(Person friend) {
        this.friend = friend;
    }
    public boolean hasSameName(Person other){
        if(other==null){
            return false;
        }
        return this.name.equals(other.name);
    }
    public boolean hasSameFriend(Person other){
        if(other==null){
            return false;
        }
        if(this.friend==null||other.friend==null){
            return false;
        }
        return this.friend==other.friend;
    }
    public void printFriendName(){
        if(this.friend==null){
            return;
        }
        System.out.println(this.friend.getName());
    }
    public boolean hasNoSameFriend(Person other){
        if(other==null){
            return false;
        }
        if(this.friend==null||other.friend==null){
            return false;
        }
        return this.friend!=other.friend;
    }
    public void printOtherFriendName(Person other){
        if(other==null){
            return;
        }
        if(other.friend==null){
            return;
        }
        System.out.println(other.friend.getName());
    }
    public void bindFriend(Person other){
        if(other == null||this==other||this.friend!=null||other.friend!=null){
            return;
        }
        this.setFriend(other);
        other.setFriend(this);
    }
    public boolean isFriendWith(Person other){
        if(other==null){
            return false;
        }
        if(this.friend==null){
            return false;
        }
        return this.friend==other;
    }
    public void unbindFriend(){
        if(this.friend==null){
            return;
        }
        Person temp=this.friend;
        this.friend=null;
        temp.friend=null;

    }
    public void changeFriend(Person newFriend){
        if(newFriend==null){
            return;
        }
        if(newFriend==this){
            return;
        }
        if(this.friend!=null){
            this.unbindFriend();
        }
        if(newFriend.friend!=null){
            newFriend.friend.unbindFriend();
        }
        this.friend=newFriend;
        newFriend.friend=this;
    }
    public boolean hasFriendWithSameName(Person other){
        if(other==null){
            return false;
        }
        if(this.friend==null||other.friend==null){
            return false;
        }
        return this.friend.getName().equals(other.friend.getName());
    }
    public void printFriendHasSameName(Person other){
        if(other==null){
            return;
        }
        if(this.friend==null||other.friend==null){
            return;
        }
        if(this.friend.getName().equals(other.friend.getName())){
            System.out.println("Same name!");
        }
    }
    public void removeFriend(){
        if(this.friend==null){
            return;
        }
        this.friend=null;
    }
    public void removeOtherFriend(Person other){
        if(other==null){
            return;
        }
        if(other.friend==null){
            return;
        }
        other.friend=null;
    }
    public void copyFriendFrom(Person other){
        if(other==null){
            return;
        }
        if(other.friend==null){
            return;
        }
        if(this.friend!=null){
            this.friend=null;
        }
        this.friend=other.friend;
    }
    public void stealFriendFrom(Person other){
        if(other==null){
            return;
        }
        if(other.friend==null){
            return;
        }
        if(this.friend!=null){
            this.removeFriend();
        }
        this.friend = other.friend;
        other.friend=null;
    }
    public void swapFriend(Person other){
        if(other==null){
            return;
        }
        if(this.friend==null||other.friend==null){
            return;
        }
        Person temp=this.friend;
        this.friend=other.friend;
        other.friend=temp;
    }
    public void printBothFriendNames(Person other){
        if(other==null){
            return;
        }
        if(this.friend==null||other.friend==null){
            return;
        }
        System.out.println(this.friend.getName());
        System.out.println(other.friend.getName());
    }
    public void  printFriendChain(Person other){
        if(other==null){
            return;
        }
        if(this.friend==null||other.friend==null){
            return;
        }
        System.out.println(this.getName());
        System.out.println(this.friend.getName());
        System.out.println(other.friend.getName());
    }
    public void printFullFriendChain(Person other){
        if(other==null){
            return;
        }
        if(this.friend==null||other.friend==null){
            return;
        }
        System.out.println(this.getName());
        System.out.println(this.friend.getName());
        System.out.println(other.getName());
        System.out.println(other.friend.getName());
    }
    public boolean isMutualFriend(Person other){
        if(other==null){
            return false;
        }
        if(this.friend==null||other.friend==null){
            return false;
        }
        if(this.friend==other&&other.friend==this){
            return true;
        }
        return false;
    }

}
