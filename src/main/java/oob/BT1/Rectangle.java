package oob.BT1;
public class Rectangle 

    { private Double lenght;
    private double width;

    public Rectangle(Double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    public Rectangle() {
    }

    public Double getLenght() {
        return lenght;
    }

    public void setLenght(Double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Double tinhchuvi() {
        double tinh = (lenght + width) * 2;
        return tinh;
    }

    public Double tinhdientich() {
        double tinh = lenght * width;
        return tinh;
    }
    
}
