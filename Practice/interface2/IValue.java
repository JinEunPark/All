package interface2;

interface IValue {
    default public int getValue(){return 0;}//디폴트 함수를 포함하는 interface이고 default함수는 반드시 오버라이딩할 필요는 없음
    //0을 반환하게 만듬
}
