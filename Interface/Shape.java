package Interface;

interface Drawable{
    void draw();
}
class Shape implements Drawable{
    @Override
    public  void draw(){
        System.out.println("I am a shape");
    }
    public static void main(String[] args) {
        Shape s= new Shape();
        s.draw();
    }   
}
