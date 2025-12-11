package homework_first_classes_objects.rectangle;

public class Rectangle {
    int width;
    int height;

    public Rectangle(int someWidth, int someHeight){
        width = someWidth;
        height = someHeight;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public void setWidth(int newWidth){
        width = newWidth;
    }

    public int calculateArea(){
        return width * height;
    }
}
