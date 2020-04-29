package main.java.enumTest;

import java.util.function.Function;

/**
 * 서로 다른 계산식을 적용해야할 때가 있습니다.
 * 예를 들어 DB에 저장된 code의 값이 “CALC_A”일 경우엔 값 그대로, “CALC_B”일 경우엔 *10 한 값을, “CALC_C”일 경우엔 *3을 계산하여 전달해야만 합니다.
 * 가장 쉬운 해결 방법은 아래와 같이 static 메소드를 작성하여 필요한 곳에서 호출하는 방식일 것입니다.
 */
public enum CalculatorType {

    CALC_A(value -> value),
    CALC_B(value -> value * 10),
    CALC_C(value -> value * 3),
    CALC_D(value -> 0L);

    private Function<Long,Long> expression;
    CalculatorType(Function<Long,Long>expression) {
        this.expression = expression;
    }

    public long calculate(long value){
        return expression.apply(value);
    }

    //2. 상태와 행위를 한곳에서 관리
    public static void main(String[] args) {

        /**
         * 값(상태)과 메소드(행위)가 어떤 관계가 있는지 더이상 다른곳에서 찾을 필요가 없다.
         */
        CalculatorType  code = CALC_B;
        long originValue = 10000L;
        long result = code.calculate(originValue);
        System.out.println("result==="+result);

    }
}
