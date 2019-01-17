package encaptulation;

class Emp{
    int empId;
    String empName;
    public void setId(int id){
       empId = id;
    }
    public int getId(){
        return empId;
    }
    
    public void setName(String name){
        empName = name;
    }
    public String getame(){
        return empName;
    }
    
}

public class Encapsulation {

    public static void main(String[] args) {
        
        Emp emp = new Emp();
        emp.setId(24);
        emp.setName("Tousif Akram");
        System.out.println("Employee id is : "+emp.getId());
        System.out.println("Employee name is : "+emp.getame());
    }
    
}
