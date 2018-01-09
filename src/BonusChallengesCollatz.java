import java.util.ArrayList;
import java.util.List;

public class BonusChallengesCollatz {

    public static void main(String[] args) {

//        working progress, not running yet
        List<Long> listOfNum = new ArrayList<>();

        int longestChain = 0;
        int tempChain = 0;


        for(long k = 20; k <= 20; k--) {

            long l = k;
            while (l != 1) {

                if (l % 2 != 0) {
                    l = l * 3 + 1;
                } else if (l % 2 == 0) {
                    l = l / 2;
                }

                listOfNum.add(l);
                tempChain += 1;
            }
        }
            if(tempChain > longestChain) {
                longestChain = tempChain;
                tempChain = 0;
                System.out.println(longestChain);
            }


    }

    }

