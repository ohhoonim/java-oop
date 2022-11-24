package oopBasic;

import java.util.Arrays;
import java.util.List;

import oopBasic.abstraction.AnimalCry;
import oopBasic.abstraction.Dog;
import oopBasic.abstraction.Pig;

public class AbstractMain {
    public static void main(String[] args) {
        // 1. 개념
        // 추상화는 데이터 추상화가 정확한 표현이다.
        // 데이터 추상화는 특정 세부 정보를 숨기고
        // 사용자에게 필수 정보만 표시하는 프로세스이다.

        // 또한 추상화는 공통분모를 찾는 일반화과정이라고도 볼 수 있다.
        // 하지만 일반화하는것에 대한 설계자나 개발자의 주관적
        // 기준이 많이 개입될 수 있고, 대부분 객관적 근거를
        // 가지기 어렵기때문에 추상화에 대한 의견 충돌이 있을 수 있다.

        //추상화가 객체지향프로그램의 핵심요소 중의 하나이기는하지만
        // 상속과 더불어 대다수의 경우에 사용되는 것에 권장되지 않는다.

        // 하지만 몇가지 문법은 알아두자. 

        // 2. 실습
        // abtract 키워드를 사용하여 추상클래스와 추상메서드를 만든다. 
        // new 연산자를 사용할 수 없다. 
        // 추상클래스를 상속받고 추상메소드를 override하여 구현한다. 

        Dog myDog = new Dog();
        myDog.cry();

        Pig myPig = new Pig();
        myPig.cry();

        // 추상화를 사용하면 배열에서 활용가능

        List<AnimalCry> animalList = Arrays.asList(
            new Dog(),
            new Pig(),
            new Dog(),
            new Pig()
        );

        for(AnimalCry pet: animalList) {
            pet.cry();
        }
        
    }
}
