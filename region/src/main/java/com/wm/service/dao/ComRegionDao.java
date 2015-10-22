package com.wm.service.dao;

import com.wm.service.model.ComRegion;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ComRegionDao {

    public int insert(ComRegion record);

    public ComRegion selectByPrimaryKey(Long id);

    /**
     * @note 获取根节点
     * @return
     */
    public ComRegion selectRootPoints();

    public List<ComRegion> selectByNameLayer(@Param("name") String name, @Param("layer") int layer);

    public List<ComRegion> selectNextByPointsLayer(@Param("left") int left, @Param("right") int right , @Param("layer") int layer);

    public List<ComRegion> selectAll();

    public int updateByPrimaryKey(ComRegion record);


}