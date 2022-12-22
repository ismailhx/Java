
/**
 * I am part of a team working on a voting system for a tv 
production company. This class whose instances can 
store basic details about the votes of a panel of judges for the performance by a 
single participant on a show. Each instance of this class with hold details of just one 
participant so other parts of the (imaginary) team will write the code to store multiple 
instances – one for each participant
 *
 * @author (Ismail Hendryx)
 */
public class Judging
{

    private int votes;
    private int judges;
    private String name;

    public Judging(String participant)
    {
        name = participant;
        votes = 0;
        judges = 0;
    }

    public int getVotes()
    {

        return votes;
    }

    public int getJudges()
    {

        return judges;
    }

    public String getName()
    {
        return name;
    }

    public void vote(int numberofvotes)
    {
        if(numberofvotes <0) {
            System.out.println(" "+ numberofvotes +" is an illegal number of votes");
        }
        else {
            if(numberofvotes >10) {
                System.out.println(" "+ numberofvotes +" is an illegal number of votes");
            }

            else {
                votes = numberofvotes + votes;
                judges = judges+1;
            }
        }
    }

    public String getDetails()
    {

        return ""+name+" has "+votes+" votes from "+judges+" judges";
    }

    public boolean positive()
    

    { 
        if(votes >5*judges) {
            return true;
        }

        else {
            return false;
        }

    }
}

    
   
