package inheritence;
import java.util.Scanner;
class Plane
{
    int x1, y1;
    Plane(int nx, int ny)
    {
        this.x1 = nx;
        this.y1 = ny;
    }
    
    void Show()
    {
        System.out.print("the x coordinate is " + x1 + "and y coordinate is " + y1);
    }
}