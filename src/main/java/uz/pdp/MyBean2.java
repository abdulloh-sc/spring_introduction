package uz.pdp;

import org.springframework.stereotype.Component;

/// maxsus class

@Component
public class MyBean2 {
    private final MyBean myBean;

    public MyBean2(MyBean myBean) {
        this.myBean = myBean;
    }

    public MyBean getMyBean() {
        return myBean;
    }

}
