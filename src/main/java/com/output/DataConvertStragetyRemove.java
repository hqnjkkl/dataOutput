package com.output;

import java.util.ArrayList;
import java.util.List;

public class DataConvertStragetyRemove implements DataConvertStrategy{

    public List<String> convert(String input,int time) {
        List<String> resultStrings = new ArrayList<String>();
        int start =-1;
        int repeated = 1;
        StringBuffer result = new StringBuffer();
        boolean isRepeated = false;
        for(int i=0;i<input.length();i++){
            if(i<input.length()-1 && input.charAt(i)==input.charAt(i+1)){
                if(start==-1){
                    start = i;
                }
                repeated++;
            }else{
                if(repeated<3){
                    if(start!=-1){
                        for( int j=start;j<=i;j++){
                            result.append(input.charAt(j));
                        }
                    }else{
                        result.append(input.charAt(i));
                    }
                }else{
                    detailedStrategy(start,input,result);
                    isRepeated = true;
                }
                repeated = 1;
                start = -1;
            }
        }

        if(isRepeated){
            resultStrings.add(result.toString());
            resultStrings.addAll(convert(result.toString(),++time));
        }else{
            if(time==0){
                resultStrings.add(result.toString());
            }
        }
        return resultStrings;
    }

    public void detailedStrategy(int start, String input,StringBuffer sb){

    }

}
