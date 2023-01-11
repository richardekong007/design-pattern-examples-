package org.example.prototype.deep.copy;

public class Employee implements Cloneable{
    int id;
    String name;
    EmpAddress empAddress;

    public Employee(int id, String name, EmpAddress address){
        this.id = id;
        this.name = name;
        this.empAddress = address;
    }

    @Override
    public String toString() {
        return String.format("Employee detail: Id:%d Name:%s Address:%s", id, name, empAddress);
    }

    //copy constructor
    public Employee(Employee originalEmployee) throws
            CloneNotSupportedException{
        this.id = originalEmployee.id;
        this.name = originalEmployee.name;
        this.empAddress = originalEmployee.empAddress.cloneAddress();
    }
}
