package com.dao;

import com.entity.HejianzhaungtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HejianzhaungtaiView;

/**
 * 核酸检测情况 Dao 接口
 *
 * @author 
 */
public interface HejianzhaungtaiDao extends BaseMapper<HejianzhaungtaiEntity> {

   List<HejianzhaungtaiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
