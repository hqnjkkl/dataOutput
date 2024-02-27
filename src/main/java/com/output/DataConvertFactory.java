package com.output;

public class DataConvertFactory {

    public static DataConvertStrategy getDataConvertStrategy(int state){
        if(state == 1){
            return new DataConvertStragetyRemove();
        }else {
            return new DataConvertStragetyReplace();
        }
    }
}
