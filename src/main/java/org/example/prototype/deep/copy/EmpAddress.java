package org.example.prototype.deep.copy;

public class EmpAddress implements Cloneable{
    String address;

    public EmpAddress(String address){
        this.address = address;
    }

    @Override
    public String toString() {
        return this.address;
    }

    public EmpAddress cloneAddress() throws
            CloneNotSupportedException{
        //shallow copy
        return (EmpAddress) this.clone();
    }
}
