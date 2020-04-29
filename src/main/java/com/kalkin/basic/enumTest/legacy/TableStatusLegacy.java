package main.java.enumTest.legacy;

public class TableStatusLegacy {

    /**
     * 상황 :
     * 하나의 테이블에서 두개의 테이블로 데이터를 넣어주는데
     * 등록 상태를 한테이블은 1, 0 으로 받고  다른 테이블은 true, false로 받는다.
     * 추론 1. :(Y , 1 true) (N, 0, false)는 같은 상태를 나타내고 있다.
     * 상태 : 복잡한 if~else 구문 ,
     */
    //특정테이블 에서는 전송 플래그 값이 "Y" 로 저장됨
    public String toTable1Value(String originValue){
        if("Y".equals(originValue)){
            return "1";
        }else{
            return "0";
        }
    }


    //다른 테이블에서는 true false
    public boolean toTable2Value(String orginValue){
        if("Y".equals(orginValue)){
            return true;
        }else{
            return false;
        }
    }
}
