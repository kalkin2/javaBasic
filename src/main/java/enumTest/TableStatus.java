package main.java.enumTest;

/**
 * 레거시 코드는 : ../legacy/TableStatusLegacy 참고
 */
public enum TableStatus {
        Y("1",true), N("2",false);

     private String table1Value;
     private boolean table2Value;


    TableStatus(String table1, boolean table2) {
        this.table1Value = table1;
        this.table2Value = table2;
    }

    public String getTable1Value(){
        return table1Value;
    }

    public Boolean isTableValue(){
        return table2Value;
    }

    //1. 데이터들 간의 연관관계 표현
    public static void main(String[] args) {
        System.out.println("table1Value::"+TableStatus.Y.table1Value);
        System.out.println("table1Value::"+TableStatus.Y.table2Value);
    }
}
