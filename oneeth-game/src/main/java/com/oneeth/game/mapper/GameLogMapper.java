package com.oneeth.game.mapper;

import com.oneeth.game.entity.GameLog;
import com.oneeth.game.entity.GameLogExample;
import com.oneeth.game.entity.GameLogKey;
import com.oneeth.game.vo.AllPlayingGame;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GameLogMapper {
    long countByExample(GameLogExample example);

    int deleteByExample(GameLogExample example);

    int deleteByPrimaryKey(GameLogKey key);

    int insert(GameLog record);

    int insertSelective(GameLog record);

    List<GameLog> selectByExample(GameLogExample example);

    GameLog selectByPrimaryKey(GameLogKey key);

    int updateByExampleSelective(@Param("record") GameLog record, @Param("example") GameLogExample example);

    int updateByExample(@Param("record") GameLog record, @Param("example") GameLogExample example);

    int updateByPrimaryKeySelective(GameLog record);

    int updateByPrimaryKey(GameLog record);

	List<AllPlayingGame> selectAllGame();

	AllPlayingGame selectGameInfo(AllPlayingGame allPlayingGame);
}