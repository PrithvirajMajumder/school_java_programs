package inheritence;
class Circle extends Plane
{
    int x2, y2;
    double radius, area;
    Circle(int nx, int ny, int nx1, int ny1)
    {
        super(nx, ny);
        this.x2 = nx1;
        this.y2 = ny1;
    }
    
    void findRadius()
    {
        this.radius = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow(y2 - y1, 2) / 2);
    }
    
    void findArea()
    {
        this.area = Math.pow((3.14 * radius), 2);
    }
    
    void Show()
    {
        System.out.println("The first coordinates are " + this.x1 + " and " + this.y1);
        System.out.println("The second coordinates are " + this.x2 + " and " + this.y2);
        System.out.println("The Radius of the circle is " + this.radius + " and the area of the circle is " + this.area);
    }
}