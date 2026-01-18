package Day02;

class Parent{
    String BloodGroup;
    void ParentBloodGroup(String Blood){
        BloodGroup=Blood;
    }
}

class Child extends Parent{
    String name;

    void ChildBloodGroup(){
        System.out.println(name+" has "+BloodGroup+" Blood Group ");
    }
}

public class Q4 {
    public static void main(String[] arg){
        Child obj = new Child();
        obj.name="abc";
        obj.ParentBloodGroup("B+");

        obj.ChildBloodGroup();
    }
}
