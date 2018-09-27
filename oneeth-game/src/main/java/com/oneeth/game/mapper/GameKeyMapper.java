package com.oneeth.game.mapper;

import com.oneeth.game.entity.GameKey;
import com.oneeth.game.entity.GameKeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameKeyMapper {
    long countByExample(GameKeyExample example);

    int deleteByExample(GameKeyExample example);

    int deleteByPrimaryKey(String id);

    int insert(GameKey record);

    int insertSelective(GameKey record);

    List<GameKey> selectByExampleWithBLOBs(GameKeyExample example);

    List<GameKey> selectByExample(GameKeyExample example);

    GameKey selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GameKey record, @Param("example") GameKeyExample example);

    int updateByExampleWithBLOBs(@Param("record") GameKey record, @Param("example") GameKeyExample example);

    int updateByExample(@Param("record") GameKey record, @Param("example") GameKeyExample example);

    int updateByPrimaryKeySelective(GameKey record);

    int updateByPrimaryKeyWithBLOBs(GameKey record);

    int updateByPrimaryKey(GameKey record);
}