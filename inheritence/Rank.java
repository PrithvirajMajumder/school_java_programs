package inheritence;
class Rank extends Record
{
    int index, lowestRank = 50, lowestRankIndex = -1;
    Rank()
    {
        //super();
    }

    void highest()
    {
        int i;
        for(i = 0; i < this.limit; i++)
        {
            if(rank[i] < lowestRank)
            {
                this.lowestRank = rank[i];   
                this.lowestRankIndex = i;
            }
        }
    }
    
    void display()
    {
        System.out.print("The Student who got highest rank " + this.name[this.lowestRankIndex]);
        System.out.print("Rank is: " + this.rank[this.lowestRankIndex]);
    }
}