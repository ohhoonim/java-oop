package oopBasic;

import java.util.Arrays;
import java.util.List;

import oopBasic.form.Button;
import oopBasic.form.ClickEvent;
import oopBasic.form.Form;
import oopBasic.form.Input;
import oopBasic.form.Title;

public class Polymorphism {
    public static void main(String[] args) {
        // 1. 개념
        // 다형성은 '여러가지의 형태'를 가지고 있음을 말한다.
        // 원기둥 형태의 음료수를 보는 방향에 따라 동그라미, 사각형, 원기둥으로
        // 그릴 수 있듯이 객체는 여러가지 형태를 가질 수 있다.

        // 2. 실습
        // 다중 상속을 통한 다형성
        // 자바는 다중 상속을 허용하지 않는다. interface를 통해 다형성을 구현할 수 있다.
        String name = "matthew";
        int age = 23;
        Form nameForm = new Input<String>("nameInput", name);
        Form ageForm = new Input<Integer>("ageInput", age);
        Form titleForm = new Title("title", "회원가입");
        Form submitForm = new Button("submit");

        // 배열을 이용해서 각 form의 아이디를 출력해보면
        List<Form> formList = Arrays.asList(nameForm, ageForm, titleForm, submitForm);
        for (Form form : formList) {
            System.out.println(form.getId());
        }

        // ClickEvent 인터페이스를 구현했는지 체크도 가능 instanceof
        for (Form form : formList) {
            if (form instanceof ClickEvent) {
                System.out.println(form.getId() + " 는 클릭도 가능합니다.");
            } else {
                System.out.println(form.getId() + " 는 클릭할 수 없습니다.");
            }
        }

        // overriding 과 overloading도 다형성의 일종이다. :
    }
}
