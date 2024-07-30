package com.qimu.qiapibackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qimu.qiapibackend.mapper.DailyCheckInMapper;
import com.qimu.qiapibackend.model.entity.DailyCheckIn;
import com.qimu.qiapibackend.service.DailyCheckInService;
import org.springframework.stereotype.Service;

/**
 * 每日签到服务impl
 */
@Service
public class DailyCheckInServiceImpl extends ServiceImpl<DailyCheckInMapper, DailyCheckIn>
        implements DailyCheckInService {

}




