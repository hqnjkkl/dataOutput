package com.output;

public class DataConvertStragetyReplace extends DataConvertStragetyRemove{

    @Override
    public void detailedStrategy(int start, String input,StringBuffer sb){
        char in = input.charAt(start);
        if(in=='a'){
            sb.append('Z');
        }else{
            sb.append((char)(input.charAt(start)-1));
        }

    }
}
