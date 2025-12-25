package uz.pdp; /// maxsus class

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  /// metadata qo'shib beradi springga
public class MyBean2 {
    private final MyBean myBean;

    // Constructor Injection
    //@Autowired // vazifasi DI ni taminlab berish /// spring 4.1 dan keyin bunday yozishga hojat yo'q agar bitta constructor bo'lsa
    public MyBean2(MyBean myBean) {
        this.myBean = myBean;
    }

    public MyBean getMyBean() {
        return myBean;
    }

}
