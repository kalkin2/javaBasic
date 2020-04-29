package main.java.enumTest;

/**
 * enum 기본
 */
public enum Company {
    SK("에스케이"),
    LG("엘지"),
    KT("케이티"),
    SAMSUNG("삼성"),
    APPLE("애플");

    private final String value;


    //constructor
    Company(String value){
        this.value = value;

    }

    //getter
    public String getValue(){
        return value;
    }

    //main
    public static void main(String[] args) {

        for(Company type : Company.values()){
            System.out.println(type); // SK, LG, KT, SAMSUNG, APPLE
            System.out.println(type.getValue()); // 에스케이, 엘쥐, 케이티, 삼성, 애플
        }

        System.out.println(Company.APPLE.ordinal()); //4

    }

}
