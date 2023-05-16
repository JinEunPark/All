package sol;
import java.math.*;
import java.util.*;

import static java.util.stream.Collectors.joining;




    class Result {

        /*
         * Complete the 'boardCutting' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY cost_y
         *  2. INTEGER_ARRAY cost_x
         */


        public static int boardCutting(List<Integer> cost_y, List<Integer> cost_x) {
            // Write your code here
            Collections.sort(cost_y,Collections.reverseOrder());
            Collections.sort(cost_x, Collections.reverseOrder());
            List<BigInteger> result = new ArrayList<>();
            int x = 0;
            int y = 0;
            int segment_x= 1;
            int segment_y = 1;

            while(y != (cost_y.size())|| x != (cost_x.size())){
                int current_x = 0;
                int current_y = 0;

                if(x <= cost_x.size()-1 ){
                    current_x = cost_x.get(x);
                }
                if(y <= cost_y.size()-1 ){
                    current_y = cost_y.get(y);
                }


                if(result.size() == 0){
                    if(current_x> current_y){
                        result.add(BigInteger.valueOf(current_x));
                        segment_x++;
                        x++;


                    }else{
                        result.add(BigInteger.valueOf(current_y));
                        segment_y++;
                        y++;
                    }

                }else{

                    if(current_x> current_y){
                        BigInteger buf = BigInteger.valueOf(current_x * segment_y).add(result.get(result.size()-1));
                        result.add(buf);
                        segment_x++;
                        if(x < cost_x.size()){
                            x++;
                        }

                    }else{
                        BigInteger buf = BigInteger.valueOf(current_y * segment_x).add(result.get(result.size()-1));
                        result.add(buf);
                        segment_y++;
                        if(y < cost_y.size()){
                            y++;
                        }
                    }
                }
                System.out.println(result);

            }

            return result.get(result.size()-1).intValue()%(Double.valueOf(Math.pow(10,9)).intValue() + 7);

        }

    }

