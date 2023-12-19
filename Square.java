

public class Square extends Rectangle {

    public Square(double length){
        super(length);
    }

    @Override
    public double calculateArea(){
        return super.getLength()*super.getLength();
    }
    @Override
    public double calculatePerimeter(){
        return 2*(super.getLength()+super.getLength());
    }

}
