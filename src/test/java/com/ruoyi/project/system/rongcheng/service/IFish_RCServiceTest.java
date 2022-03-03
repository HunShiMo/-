//package com.ruoyi.project.system.rongcheng.service;
//
//import com.ruoyi.project.system.Demo.domain.Demo;
//import com.ruoyi.project.system.rongcheng.domain.Fish_RC;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.math.BigDecimal;
//import java.math.RoundingMode;
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//class IFish_RCServiceTest {
//
//    @Autowired
//    IFish_RCService fish_rcService;
//
//    @Test
//    public void test() {
//        List<Fish_RC> fish_rcs = fish_rcService.selectFish_RCList(new Fish_RC());
//        List<Demo> demoList = new ArrayList<>();
//        Demo demo = new Demo();
//        if (!fish_rcs.isEmpty()) {
//            for (Fish_RC fish_rc : fish_rcs) {
//                demo.setId(fish_rc.getId());
//                demo.setDate(fish_rc.getDate());
//                demo.setHour(Integer.parseInt(fish_rc.getHour()));
//                demo.setMinute(Integer.parseInt(fish_rc.getMinute()));
//                demo.setData(new BigDecimal(fish_rc.getDeep()).divide(BigDecimal.ONE, 0, RoundingMode.HALF_UP).intValue());
//                demo.setNote(fish_rc.getRemark());
//                demo.setTimestamp(String.valueOf(fish_rc.getTimestamp()));
//            }
//            demoList.add(demo);
//            // TODO 把数据插入到p1deep....之类的表
//        }
//    }
//
//}