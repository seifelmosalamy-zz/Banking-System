package Staff;

import bankingsystemfinal.AccountInfo;
import java.io.Serializable;

public class Staff extends Workers  implements Serializable{

    private int Salary;

    private int Id;

    public void CheckIn() {
    }

    public void Salary()
{
salary=3000;
}
    
public void setSalary(int Salary) {
        this.Salary = Salary;
    }
public void setId(int Id)
{
    this.Id=Id;
}
public int getSalary()
{
return Salary;
 }
public int getId()
{
    return Id;
}
}
