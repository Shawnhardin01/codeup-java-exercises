package shawn.object_exercise;


public class Person {
    private  String name;

    public String getName(){
        System.out.print( name + "\n" );
         return "";}
    public void sayHello(){
        System.out.println("Hello from your pal " + name);
    }

    public void setName(String name){

    }




    public static void main(String[] args) {
        Person moe = new Person();
        moe.name = "Moe";
        moe.getName();
        moe.sayHello();

    }


}

