//package com.daily;
//
//class DoctorDutyScheduleRpcImpl{
//    @Autowired  NewScheduleService; //新建一个同类型的Service
//    void saveSchedule(A) {
//        NewScheduleService.saveSchedule(A);
//    }
//}
//
//class NewScheduleService {
//    @Autowired ScheduleService;
//    @Autowired DoctorShareScheduleRpcService;
//    @Autowired xxxMapper; //只能在对应模块的Service里被引用，其他Service不能引用这个mapper
//    void saveSchedule(A) {
//        if (!switch.isOpen()) {
//            ScheduleService.saveSchedule(A); //走原先老的Service逻辑
//            return;
//        }
//        A~B;
//        C = DoctorShareScheduleRpcService.xxx(); //额外的补充数据
//        B.D=C;
//        DoctorShareScheduleRpcService.saveSchedule(B);
//
//        xxxMapper.insert | update | delete
//
//        pushService.pushDT(); //消息通知，如果有
//
//    }
//}


package com.daily;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test{
    public static void main(String[] args) {
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(dateTime);
//        int a = 0;
//        for(int i = 0; i < 2; i ++) {
//            a++;
//        }
//        System.out.println(LocalDateTime.now().isAfter(dateTime));
//        System.out.println(dateTime.getNano());
//        List<String> list = new ArrayList<>();
//        list.add("ha");
//        list.add("he");
//        list.add("ge");
//        System.out.println(StringUtils.join(list, "|"));
//        String s = "abc";
//        String[] str = StringUtils.split(s, ",");
//        System.out.println(Arrays.toString(str));
        
    }



}
