package DAY2;

class Innings {
    private String teamname;
    private String inningname;
    private int runs;
    
    Innings(String teamname,String inningname,int runs)
    {
        this.teamname=teamname;
        this.inningname=inningname;
        this.runs=runs;
    }

    public void displayInningsDetails()
    {
        
        System.out.println("TeamName:"+teamname);
        System.out.println("Runs:"+runs);
        if(inningname.equals("First"))
        {
            System.out.println("need "+(runs+1)+" To win");
        }
        else if(inningname.equals("Second"))
        {
            System.out.println("Match Ended");
        }
        

    }
}
