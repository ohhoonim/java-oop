package oopBasic;

import oopBasic.component.Input;

public class InheritanceMain {
    public static void main(String[] args) {
        // 1. 개념
        // 자식클래스가 부모클래스의 기능을 그대로 물려받는것을 말한다.
        // 현실세계는 자식과 부모가 다른것이므로 상속을 이용한 
        // 코딩보다는 클래스 구성을 통한 코딩을 권장하고 있다.  
        // 하지만 상속을 이용한 구현은 UI프레임워크 등에서
        // 많이 사용되고 있으므로 그 사용법정도는 알아두어야 한다. 

        // 2. 실습
        Input name = new Input("3764-1200", "matthew");
        
        System.out.println(name.getId());
        System.out.println(name.getValue());
        
        Input age = new Input("3764-1200", 23);

        System.out.println(age.getId());
        System.out.println(age.getValue());

        // java 의 모든 클래스는 Object 클래스의 자식이다. 
        // 자식이 부모의 기능을 대체할 때는 override할 수 있다. 
        System.out.println(age.toString());
        

    }
}
