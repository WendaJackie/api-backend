package com.qimu.qiapibackend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qimu.qiapicommon.model.entity.InterfaceInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 接口信息映射器
 */
public interface InterfaceInfoMapper extends BaseMapper<InterfaceInfo> {

    @Select("SELECT * FROM interface_info ORDER BY total_invokes DESC LIMIT 3")
    List<InterfaceInfo> getTopThreeInvokedInterfaces();

}