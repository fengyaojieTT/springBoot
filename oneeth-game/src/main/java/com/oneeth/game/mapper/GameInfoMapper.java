package com.oneeth.game.mapper;

import com.oneeth.game.entity.GameInfo;
import com.oneeth.game.entity.GameInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameInfoMapper {
    long countByExample(GameInfoExample example);

    int deleteByExample(GameInfoExample example);

    int deleteByPrimaryKey(String id);

    int insert(GameInfo record);

    int insertSelective(GameInfo record);

    List<GameInfo> selectByExample(GameInfoExample example);

    GameInfo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GameInfo record, @Param("example") GameInfoExample example);

    int updateByExample(@Param("record") GameInfo record, @Param("example") GameInfoExample example);

    int updateByPrimaryKeySelective(GameInfo record);

    int updateByPrimaryKey(GameInfo record);
}