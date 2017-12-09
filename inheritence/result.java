package inheritence;
public class result extends Student
{
    double sub1, sub2, sub3, total, avg;
    String stream[];
    result()
    {
        this.sub1 = 0;
        this.sub2 = 0;
        this.sub3 = 0;
        this.stream = new String[0];
    }
    
    result(double s1, double s2, double s3)
    {
        this.sub1 = s1;
        this.sub2 = s2;
        this.sub3 = s3;
        this.stream = new String[]{"Mathametics", "Biology", "Commerece", "Arts"};
    }
    
    void calculate()
    {
        double total, avg;
        total = this.sub1 + this.sub2 + this.sub3;
        avg = total / 3;
    }
    
    double gettotal()
    {
        return this.total = total;
    }
    
    double getavaerage()
    {
        return this.avg = avg;
    }
    
    void getStream()
    {
        String stream = "";
        if(avg >= 80)
        {
            stream = this.stream[1];
        }
        else if(avg < 80 || avg >= 70)
        {
            stream = this.stream[2];
        }
        else if(avg < 70 || avg >= 50)
        {
            stream = this.stream[3];
        }
        else if(avg < 50)
        {
            stream = this.stream[4];
        }
    }
    
    void main()
    {
        this.rollNo = 14;
        this.idNo = 46546;    
        Student st = new Student(rollNo, idNo);
        System.out.print()
    }
}