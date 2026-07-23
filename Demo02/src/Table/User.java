package Table;

public class User {
     private int id;
     private String name;
     private String password;
     public User(int id, String name, String password) {
         this.id = id;
         this.name = name;
         this.password = password;
     }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
         return "id=" + id + ", name=" + name + ", password=" + password;
    }
    public String toInsert(){
         return "INSERT INTO userTable(id,name,password) VALUES(" +
                  id + " , '" + name + "' , '" + password+"' )";
    }
    public String toSelect(){
        return "SELECT * FROM userTable WHERE name='" + name+"' AND password='" + password + "' ";
    }
    public String toUpdatePasswordSql(String newPassword){
        return "UPDATE userTable SET password='" + newPassword+"' WHERE id=" + id;
    }
    public String toDeleteSql(){
         return "DELETE FROM userTable WHERE id=" + id;
    }
}
