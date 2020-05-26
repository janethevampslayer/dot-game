package org.launchcode.dotgame.data;

import org.launchcode.dotgame.models.Game;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends CrudRepository <Game, Integer> {

}
