//Wrapper class represent the value of primitive data types as an object.

class IntegerWrapper{

    //Integer is an example of wrapper class.
    Integer value;

    IntegerWrapper(Integer value){
        this.value=value;
    }
}
public class Wrapper{
    static void swap(IntegerWrapper a, IntegerWrapper b){
        Integer temp=a.value;
        a.value=b.value;
        b.value=temp;
    }
    public static void main(String args[]){
        IntegerWrapper obj1= new IntegerWrapper(60);
        IntegerWrapper obj2= new IntegerWrapper(30);
        swap(obj1, obj2);
        System.out.println(obj1.value+" "+obj2.value);
    }
}

class Num{
    final int num= 10;
    String name;

    public Num(String name){
        System.out.println("Object Created");
        this.name= name;
    }

    public static void main(String args[]){
        final Num obj3= new Num("Sharmili");
        //This can be done.
        obj3.name ="new name";

        //But this can't be done, because final keyword's value cannot be changed to new or other. 
        // obj3 = new Num(null)
        System.out.println(obj3.name);

        // Num obj;
        // for(int i=0;i<10000;i++){
        //     obj= new Num("Random name");
        // }
    }
    
    //Garbage Collection.
    // @Override
    // protected void finalize() throws Throwable{
    //     System.out.println("Object is destroyed");
    // }
}