import java.util.Scanner;

/**
 * Created by Ada on 31.10.2018.
 */
public class PopularVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noOfCases = input.nextInt();
        for(int i = 0 ; i < noOfCases ; i++) {
            int sum = 0;
            int candidates = input.nextInt();
            int bestCandidateNo = 0;
            int bestNoOfVotes = 0;
            boolean differentVotes = false;
            for(int a=1; a<=candidates; a++){
                int candidateVotes = input.nextInt();
                sum = sum + candidateVotes;
                if(a==1){
                    bestCandidateNo = a;
                    bestNoOfVotes = candidateVotes;
                } else if(bestNoOfVotes != candidateVotes){

                        differentVotes = true;
                    if(bestNoOfVotes < candidateVotes) {
                        bestCandidateNo = a;
                        bestNoOfVotes = candidateVotes;
                    }
                }
            }

            if(differentVotes && (bestNoOfVotes*100/sum) > 50){
                System.out.println("majority winner " + bestCandidateNo);
            } else if(differentVotes && (bestNoOfVotes*100/sum) <= 50){
                System.out.println("minority winner " + bestCandidateNo);
            } else {
                System.out.println("no winner");
            }
        }
    }
}
