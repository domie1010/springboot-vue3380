package com.dao;

import com.entity.XueshengtiwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengtiwenView;

/**
 * 学生体温 Dao 接口
 *
 * @author 
 */
public interface XueshengtiwenDao extends BaseMapper<XueshengtiwenEntity> {

   List<XueshengtiwenView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
