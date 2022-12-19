package id.ilhamelmujib.jetheroes.data

import id.ilhamelmujib.jetheroes.model.Hero
import id.ilhamelmujib.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero>{
        return HeroesData.heroes
    }

    fun searchHeroes(query: String): List<Hero>{
        return HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = false)
        }
    }
}