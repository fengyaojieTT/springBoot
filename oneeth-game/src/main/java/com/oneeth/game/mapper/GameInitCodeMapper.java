package com.oneeth.game.mapper;

import com.oneeth.game.entity.GameInitCode;
import com.oneeth.game.entity.GameInitCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameInitCodeMapper {
    long countByExample(GameInitCodeExample example);

    int deleteByExample(GameInitCodeExample example);

    int deleteByPrimaryKey(String id);

    int insert(GameInitCode record);

    int insertSelective(GameInitCode record);

    List<GameInitCode> selectByExample(GameInitCodeExample example);

    GameInitCode selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GameInitCode record, @Param("example") GameInitCodeExample example);

    int updateByExample(@Param("record") GameInitCode record, @Param("example") GameInitCodeExample example);

    int updateByPrimaryKeySelective(GameInitCode record);

    int updateByPrimaryKey(GameInitCode record);
}